package com.accenture.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionDTO {

	private List<Transaction> transactions;
	private Integer numberOfLines;
	private Integer counter;
	private boolean eofSent;

	public TransactionDTO() {
		this.transactions = new ArrayList<Transaction>();
		numberOfLines = 0;
		counter = 0;
		eofSent = false;
	}

	public boolean isEofSent() {
		return eofSent;
	}

	public void setEofSent(boolean eofSent) {
		this.eofSent = eofSent;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void addTransaction(Transaction t) {
		this.getTransactions().add(t);
	}

	public Integer getNumberOfLines() {
		return numberOfLines;
	}

	public void setNumberOfLines(Integer numberOfLines) {
		this.numberOfLines = numberOfLines;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public Transaction getFirstElement() {
		Transaction t = this.getTransactions().get(0);
		this.getTransactions().remove(0);
		incrementCounter();
		return t;
	}

	private void incrementCounter() {
		counter++;
	}

	public void reset(int linesCount) {
		this.numberOfLines = linesCount;
		this.counter = 0;
		this.transactions = new ArrayList<Transaction>();
		this.eofSent = false;
	}

	public boolean isEndOfFile() {
		return counter == numberOfLines;
	}

	public boolean eofSent() {
		boolean value = this.eofSent;
		this.eofSent = true;
		return value;
	}

    public void addTransactions(Transaction transaction){
        this.transactions.add(transaction);
    }

}
