package com.accenture;

import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.accenture.entity.Transaction;
import com.accenture.entity.TransactionDTO;

@SpringBootApplication
@EnableBatchProcessing
@EnableScheduling
public class ListenerApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ListenerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ListenerApplication.class, args);
	}
	
	@Autowired
	TransactionDTO transactionDTO;

	private int contador = 0;
	
	@Bean
    public Supplier<Message<Transaction>> fileReader() {

		return () -> {
			if (transactionDTO.getTransactions().size() > 0) {
				Transaction t = transactionDTO.getFirstElement();
				
				LOGGER.info(">>>> transaccion: {}",t.toString());

				contador++;

				return MessageBuilder
						.withPayload(t)
						.setHeader("_id", contador)
						.build();
			}
			return MessageBuilder.withPayload(new Transaction()).build();
		};
	}

}
