package com.accenture.entity;

public class TCR04SF extends TCR{
    //Supplement Financial Data
    private String transactionCode; //1-2
    private String transactionCodeQualifier; //3
    private String transactionComponentSequenceNumber; //4
    private String agentUniqueID; //5-9
    private String reserved1; //10-14
    private String businessFormatCode; //15-16
    private String networkIdentificationCode; //17-20
    private String contactForInformation; //21-45
    private String adjustmentProcessingIndicator; //46
    private String messageReasonCode; //47-50
    private String surchargeAmount; //51-58
    private String surchargeCreditDebitIndicator; //59-60
    private String visaInternalUseOnly; //61-76
    private String reserved2; //77-103
    private String surchargeAmountInCardholderBillingCurrency; //104-111
    private String moneyTransferForeignExchangeFee; //112-119
    private String paymentAccountReference; //120-148
    private String tokenRequestorID; //149-159
    private String reserved3; //160-168

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

    public String getAgentUniqueID() {
        return agentUniqueID;
    }

    public void setAgentUniqueID(String agentUniqueID) {
        this.agentUniqueID = agentUniqueID;
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    public String getBusinessFormatCode() {
        return businessFormatCode;
    }

    public void setBusinessFormatCode(String businessFormatCode) {
        this.businessFormatCode = businessFormatCode;
    }

    public String getNetworkIdentificationCode() {
        return networkIdentificationCode;
    }

    public void setNetworkIdentificationCode(String networkIdentificationCode) {
        this.networkIdentificationCode = networkIdentificationCode;
    }

    public String getContactForInformation() {
        return contactForInformation;
    }

    public void setContactForInformation(String contactForInformation) {
        this.contactForInformation = contactForInformation;
    }

    public String getAdjustmentProcessingIndicator() {
        return adjustmentProcessingIndicator;
    }

    public void setAdjustmentProcessingIndicator(String adjustmentProcessingIndicator) {
        this.adjustmentProcessingIndicator = adjustmentProcessingIndicator;
    }

    public String getMessageReasonCode() {
        return messageReasonCode;
    }

    public void setMessageReasonCode(String messageReasonCode) {
        this.messageReasonCode = messageReasonCode;
    }

    public String getSurchargeAmount() {
        return surchargeAmount;
    }

    public void setSurchargeAmount(String surchargeAmount) {
        this.surchargeAmount = surchargeAmount;
    }

    public String getSurchargeCreditDebitIndicator() {
        return surchargeCreditDebitIndicator;
    }

    public void setSurchargeCreditDebitIndicator(String surchargeCreditDebitIndicator) {
        this.surchargeCreditDebitIndicator = surchargeCreditDebitIndicator;
    }

    public String getVisaInternalUseOnly() {
        return visaInternalUseOnly;
    }

    public void setVisaInternalUseOnly(String visaInternalUseOnly) {
        this.visaInternalUseOnly = visaInternalUseOnly;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public String getSurchargeAmountInCardholderBillingCurrency() {
        return surchargeAmountInCardholderBillingCurrency;
    }

    public void setSurchargeAmountInCardholderBillingCurrency(String surchargeAmountInCardholderBillingCurrency) {
        this.surchargeAmountInCardholderBillingCurrency = surchargeAmountInCardholderBillingCurrency;
    }

    public String getMoneyTransferForeignExchangeFee() {
        return moneyTransferForeignExchangeFee;
    }

    public void setMoneyTransferForeignExchangeFee(String moneyTransferForeignExchangeFee) {
        this.moneyTransferForeignExchangeFee = moneyTransferForeignExchangeFee;
    }

    public String getPaymentAccountReference() {
        return paymentAccountReference;
    }

    public void setPaymentAccountReference(String paymentAccountReference) {
        this.paymentAccountReference = paymentAccountReference;
    }

    public String getTokenRequestorID() {
        return tokenRequestorID;
    }

    public void setTokenRequestorID(String tokenRequestorID) {
        this.tokenRequestorID = tokenRequestorID;
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }

    @Override
    public String toString() {
        return "TCR04SF{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", agentUniqueID='" + agentUniqueID + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", businessFormatCode='" + businessFormatCode + '\'' +
                ", networkIdentificationCode='" + networkIdentificationCode + '\'' +
                ", contactForInformation='" + contactForInformation + '\'' +
                ", adjustmentProcessingIndicator='" + adjustmentProcessingIndicator + '\'' +
                ", messageReasonCode='" + messageReasonCode + '\'' +
                ", surchargeAmount='" + surchargeAmount + '\'' +
                ", surchargeCreditDebitIndicator='" + surchargeCreditDebitIndicator + '\'' +
                ", visaInternalUseOnly='" + visaInternalUseOnly + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                ", surchargeAmountInCardholderBillingCurrency='" + surchargeAmountInCardholderBillingCurrency + '\'' +
                ", moneyTransferForeignExchangeFee='" + moneyTransferForeignExchangeFee + '\'' +
                ", paymentAccountReference='" + paymentAccountReference + '\'' +
                ", tokenRequestorID='" + tokenRequestorID + '\'' +
                ", reserved3='" + reserved3 + '\'' +
                '}';
    }
}
