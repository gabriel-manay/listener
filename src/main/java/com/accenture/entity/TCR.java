package com.accenture.entity;

public abstract class TCR {

    private String transactionCode;
    private String transactionCodeQualifier;
    private String transactionComponentSequenceNumber;

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionCodeQualifier() {
        return transactionCodeQualifier;
    }

    public void setTransactionCodeQualifier(String transactionCodeQualifier) {
        this.transactionCodeQualifier = transactionCodeQualifier;
    }

    public String getTransactionComponentSequenceNumber() {
        return transactionComponentSequenceNumber;
    }

    public void setTransactionComponentSequenceNumber(String transactionComponentSequenceNumber) {
        this.transactionComponentSequenceNumber = transactionComponentSequenceNumber;
    }
}
