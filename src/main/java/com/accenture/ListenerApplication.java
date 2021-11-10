package com.accenture;

import java.util.function.Supplier;

import com.accenture.entity.Log;
import com.accenture.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

	@Autowired
	TransactionDTO transactionDTO;

	@Autowired
	ILogService logService;

	private int contador = 0;
	
	public static void main(String[] args) {
		SpringApplication.run(ListenerApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("batch-config.xml");

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("readingJob");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done");

	}


	@Bean
    public Supplier<Message<?>> fileReader() {
	//	service.guardarLog();
	//	logService.save(new Log(true, true, 55,145,true, true, true));

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

				//probando si recupera registros de BBDD
				//LOGGER.info("Log : " + logService.findAll());
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
