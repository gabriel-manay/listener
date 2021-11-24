package com.accenture.configuration;

import com.accenture.entity.Transaction;
import com.accenture.entity.TransactionDTO;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TransactionLoggingItemWriter implements ItemWriter<Transaction> {

    @Autowired
    private TransactionDTO transactionDTO;

    @Override
    public void write(List<? extends Transaction> items) throws Exception {
        transactionDTO.addTransactions(items.get(0));
    }
}
