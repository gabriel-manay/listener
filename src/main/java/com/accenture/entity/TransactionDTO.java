package com.accenture.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionDTO {

    private List<Transaction> transactions;

    public TransactionDTO(){
        this.transactions = new ArrayList<>();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransactions(Transaction transaction){
        this.transactions.add(transaction);
    }

    public Transaction getFirstElement(){
        Transaction transaction = this.getTransactions().get(0);
        this.getTransactions().remove(0);
        return transaction;
    }
}
