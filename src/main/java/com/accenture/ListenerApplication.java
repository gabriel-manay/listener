package com.accenture;

import java.util.function.Supplier;

import com.accenture.entity.Transaction;
import com.accenture.entity.TransactionDTO;
import com.amazonaws.services.s3.AmazonS3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableBatchProcessing
@EnableScheduling
public class ListenerApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ListenerApplication.class);

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
	
	public static void main(String[] args) {
		SpringApplication.run(ListenerApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("batchConfig.xml");
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("exampleJob");
		LOGGER.info("Starting the batch job: exampleJob");
		try{
			JobParameters jobParameters = new JobParametersBuilder()
					.addString("jobID", String.valueOf(System.currentTimeMillis())).toJobParameters();
			JobExecution execution = jobLauncher.run(job, jobParameters);
			LOGGER.info("Job Status: {}", execution.getStatus());
		} catch(Exception e){
			e.printStackTrace();
			LOGGER.error("Job failed: {}", e.getMessage());
		}
	}

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
