package com.accenture.entity;

public class TCR04VROL extends TCR{
    //Supplemental Visa Resolve Online (VROL) Financial Data
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
    private String disputeCondition; //51-53
    private String vrolFinalcialID; //54-64
    private String vrolCaseNumber; //65-74
    private String vrolBundleCaseNumber; //75-84
    private String clientCaseNumber; //85-104
    private String disputeStatus; //105-106
    private String surchargeAmount; //107-114
    private String surchargeCreditDebitIndicator; //115-116
    private String reserved2; //117-168

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

    public String getDisputeCondition() {
        return disputeCondition;
    }

    public void setDisputeCondition(String disputeCondition) {
        this.disputeCondition = disputeCondition;
    }

    public String getVrolFinalcialID() {
        return vrolFinalcialID;
    }

    public void setVrolFinalcialID(String vrolFinalcialID) {
        this.vrolFinalcialID = vrolFinalcialID;
    }

    public String getVrolCaseNumber() {
        return vrolCaseNumber;
    }

    public void setVrolCaseNumber(String vrolCaseNumber) {
        this.vrolCaseNumber = vrolCaseNumber;
    }

    public String getVrolBundleCaseNumber() {
        return vrolBundleCaseNumber;
    }

    public void setVrolBundleCaseNumber(String vrolBundleCaseNumber) {
        this.vrolBundleCaseNumber = vrolBundleCaseNumber;
    }

    public String getClientCaseNumber() {
        return clientCaseNumber;
    }

    public void setClientCaseNumber(String clientCaseNumber) {
        this.clientCaseNumber = clientCaseNumber;
    }

    public String getDisputeStatus() {
        return disputeStatus;
    }

    public void setDisputeStatus(String disputeStatus) {
        this.disputeStatus = disputeStatus;
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

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    @Override
    public String toString() {
        return "TCR04VROL{" +
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
                ", disputeCondition='" + disputeCondition + '\'' +
                ", vrolFinalcialID='" + vrolFinalcialID + '\'' +
                ", vrolCaseNumber='" + vrolCaseNumber + '\'' +
                ", vrolBundleCaseNumber='" + vrolBundleCaseNumber + '\'' +
                ", clientCaseNumber='" + clientCaseNumber + '\'' +
                ", disputeStatus='" + disputeStatus + '\'' +
                ", surchargeAmount='" + surchargeAmount + '\'' +
                ", surchargeCreditDebitIndicator='" + surchargeCreditDebitIndicator + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                '}';
    }
}
