package com.accenture.configuration;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.entity.Transaction;
import com.accenture.entity.TransactionDTO;

/**
 * This {@code ItemWriter} writes the received {@link Transaction} objects
 * to a log file. The goal of this component is to help us to demonstrate
 * that our item reader reads the correct information from the CSV file.
 */
public class LoggingItemWriter implements ItemWriter<Transaction> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingItemWriter.class);
    
    @Autowired
	TransactionDTO transactionDTO;

    @Override
    public void write(List<? extends Transaction> list) throws Exception {
        LOGGER.info("Transacción leida: {}", list);
        LOGGER.info("****");
        LOGGER.info("Contenido de listado: {}", transactionDTO.toString());
        LOGGER.info("**************");
        transactionDTO.addTransaction(list.get(0));
    }
    
    
}
