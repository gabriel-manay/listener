package com.accenture.configuration;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.entity.Transaction;
import com.accenture.entity.TransactionDTO;

public class LoggingItemWriter implements ItemWriter<Transaction> {

    @Autowired
	TransactionDTO transactionDTO;

    @Override
    public void write(List<? extends Transaction> list) throws Exception {
        transactionDTO.addTransaction(list.get(0));
    }
    
    
}
