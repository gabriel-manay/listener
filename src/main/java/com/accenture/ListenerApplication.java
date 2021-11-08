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
import com.accenture.service.ILogService;

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

	@Autowired
	ILogService logService;

	private int contador = 0;
	
	@Bean
    public Supplier<Message<?>> fileReader() {
	//	service.guardarLog();
		return () -> {
			if (transactionDTO.getTransactions().size() > 0) {
				Transaction t = transactionDTO.getFirstElement();
				
				/*
				LOGGER.info("Listado"+service.recuperarLogs());
				for(Log log: service.recuperarLogs() ){
					LOGGER.info(log.toString());

				}
				*/
				
				LOGGER.info(">>>>>>>>>>>>>>>>>>		Se registra log");
				logService.registerFileProcess();
				
				LOGGER.info(">>>>>>>>>>>>>>>>>>		Se envia transaccion: {}", t.toString());

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
