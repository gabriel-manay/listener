package com.accenture.entity;

import java.util.ArrayList;
import java.util.List;

import com.accenture.validation.IValidation;
import com.accenture.validation.TransactionCodeValidation;

public class Transaction {
	
	private Integer transactionCode;	//1-2
	private Integer transactionCodeQualifier;	// 3
	private Integer transactionComponentSequenceNumber;	// 4
	private String accountNumber;	// 5-20
	
	private List<IValidation> validations = new ArrayList<IValidation>();
	
	public Transaction() {
		validations.add(new TransactionCodeValidation());		
	}
	

	public Integer getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(Integer transactionCode) {
		this.transactionCode = transactionCode;
	}
	public Integer getTransactionCodeQualifier() {
		return transactionCodeQualifier;
	}
	public void setTransactionCodeQualifier(Integer transactionCodeQualifier) {
		this.transactionCodeQualifier = transactionCodeQualifier;
	}
	public Integer getTransactionComponentSequenceNumber() {
		return transactionComponentSequenceNumber;
	}
	public void setTransactionComponentSequenceNumber(Integer transactionComponentSequenceNumber) {
		this.transactionComponentSequenceNumber = transactionComponentSequenceNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	@Override
	public String toString() {
		return "Transaction [transactionCode=" + transactionCode + ", transactionCodeQualifier="
				+ transactionCodeQualifier + ", transactionComponentSequenceNumber="
				+ transactionComponentSequenceNumber + ", accountNumber=" + accountNumber + "]";
	}
	
	public boolean validate() {
		boolean result = true;
		
		for (IValidation iValidation : validations) {
			result = iValidation.validate();
		}
		
		return result;
	}
	

}
