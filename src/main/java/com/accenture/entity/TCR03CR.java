package com.accenture.entity;

public class TCR03CR extends TCR{
    //Business Application Data
    private String transactionCode;	//1-2
    private String transactionCodeQualifier;	// 3
    private String transactionComponentSequenceNumber;	// 4
    private String reserved;	// 5-15
    private String fastFundsIndicator; //16
    private String businessFormatCode; //17-18
    private String businessApplicationID; //19-20
    private String sourceOfFunds; //21
    private String paymentReversalReasonCode; //22-23
    private String senderReferenceNumber; //24-39
    private String senderAccountNumber; //40-73
    private String senderName; //74-103
    private String senderAddress; //104-138
    private String senderCity; //139-163
    private String senderState; //164-165
    private String senderCountry; //166-168

    @Override
    public String getTransactionCode() {
        return transactionCode;
    }

    @Override
    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    @Override
    public String getTransactionCodeQualifier() {
        return transactionCodeQualifier;
    }

    @Override
    public void setTransactionCodeQualifier(String transactionCodeQualifier) {
        this.transactionCodeQualifier = transactionCodeQualifier;
    }

    @Override
    public String getTransactionComponentSequenceNumber() {
        return transactionComponentSequenceNumber;
    }

    @Override
    public void setTransactionComponentSequenceNumber(String transactionComponentSequenceNumber) {
        this.transactionComponentSequenceNumber = transactionComponentSequenceNumber;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public String getFastFundsIndicator() {
        return fastFundsIndicator;
    }

    public void setFastFundsIndicator(String fastFundsIndicator) {
        this.fastFundsIndicator = fastFundsIndicator;
    }

    public String getBusinessFormatCode() {
        return businessFormatCode;
    }

    public void setBusinessFormatCode(String businessFormatCode) {
        this.businessFormatCode = businessFormatCode;
    }

    public String getBusinessApplicationID() {
        return businessApplicationID;
    }

    public void setBusinessApplicationID(String businessApplicationID) {
        this.businessApplicationID = businessApplicationID;
    }

    public String getSourceOfFunds() {
        return sourceOfFunds;
    }

    public void setSourceOfFunds(String sourceOfFunds) {
        this.sourceOfFunds = sourceOfFunds;
    }

    public String getPaymentReversalReasonCode() {
        return paymentReversalReasonCode;
    }

    public void setPaymentReversalReasonCode(String paymentReversalReasonCode) {
        this.paymentReversalReasonCode = paymentReversalReasonCode;
    }

    public String getSenderReferenceNumber() {
        return senderReferenceNumber;
    }

    public void setSenderReferenceNumber(String senderReferenceNumber) {
        this.senderReferenceNumber = senderReferenceNumber;
    }

    public String getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(String senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getSenderState() {
        return senderState;
    }

    public void setSenderState(String senderState) {
        this.senderState = senderState;
    }

    public String getSenderCountry() {
        return senderCountry;
    }

    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    @Override
    public String toString() {
        return "TCR03CR{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", reserved='" + reserved + '\'' +
                ", fastFundsIndicator='" + fastFundsIndicator + '\'' +
                ", businessFormatCode='" + businessFormatCode + '\'' +
                ", businessApplicationID='" + businessApplicationID + '\'' +
                ", sourceOfFunds='" + sourceOfFunds + '\'' +
                ", paymentReversalReasonCode='" + paymentReversalReasonCode + '\'' +
                ", senderReferenceNumber='" + senderReferenceNumber + '\'' +
                ", senderAccountNumber='" + senderAccountNumber + '\'' +
                ", senderName='" + senderName + '\'' +
                ", senderAddress='" + senderAddress + '\'' +
                ", senderCity='" + senderCity + '\'' +
                ", senderState='" + senderState + '\'' +
                ", senderCountry='" + senderCountry + '\'' +
                '}';
    }
}
