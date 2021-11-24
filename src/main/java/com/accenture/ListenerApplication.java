package com.accenture;

import java.util.function.Supplier;

import com.accenture.entity.Transaction;
import com.accenture.entity.TransactionDTO;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.accenture.entity.TCR00;
import com.accenture.entity.TCR00DTO;

@SpringBootApplication
@EnableBatchProcessing
@EnableScheduling
public class ListenerApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ListenerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ListenerApplication.class, args);
	}
	
	@Autowired
	TCR00DTO TCR00DTO;

	@Autowired
	TransactionDTO transactionDTO;

	@Autowired
	private AmazonS3 s3Client;

	@Value("${application.bucket.name}")
	private String bucketName;

	@Value("${application.file.name}")
	private String fileName;

	@Value("${cloud.aws.region.static}")
	private String region;

	private int contador = 0;
	private int totalLines;
	private long charsPerLine = 168;
	
	/*@Bean
    public Supplier<Message<TCR00>> fileReader() {
		S3Object s3Object = s3Client.getObject(bucketName,fileName);
		ObjectMetadata metadata = s3Object.getObjectMetadata();
		long contentLength = metadata.getContentLength();
		totalLines = (int) Math.floor(contentLength/charsPerLine);

		return () -> {
			if(contador != totalLines){
				if (TCR00DTO.getTransactions().size() > 0) {
					TCR00 t = TCR00DTO.getFirstElement();

					LOGGER.info(">>>> transaccion: {}",t.toString());

					contador++;

					return MessageBuilder
							.withPayload(t)
							.setHeader("_id", contador)
							.build();
				}
			} else {
				return MessageBuilder.withPayload(new TCR00("AA")).build();
			}
			return MessageBuilder.withPayload(new TCR00()).build();
		};
	}*/

	@Bean
	public Supplier<Message<Transaction>> fileReader(){
		return ()->{
			if(transactionDTO.getTransactions().size() > 0){
				Transaction transaction = transactionDTO.getFirstElement();
				LOGGER.info(">>>> transaccion: {}",transaction.toString());
				return MessageBuilder.withPayload(transaction).build();
			}
			return MessageBuilder.withPayload(new Transaction()).build();
		};
	}

}
