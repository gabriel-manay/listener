package com.accenture.entity;

public class TCR07 extends TCR{

    private String transactionCode;	//1-2
    private String transactionCodeQualifier;	// 3
    private String transactionComponentSequenceNumber;	// 4
    private String transactionType;	// 5-6
    private String cardSequenceNumber; //7-9
    private String terminalTransactionDate; //10-15
    private String terminalCapabilityProfile; //16-21
    private String terminalCountryCode; //22-24
    private String terminalSerialNumber; //25-32
    private String unpredictableNumber; //33-40
    private String applicationTransactionCounter; //41-44
    private String applicationInterchangeProfile; //45-48
    private String cryptogram; //49-64
    private String issuerApplicationDataByte2; //65-66
    private String issuerApplicationDataByte3; //67-68
    private String terminalVerificationResults; //69-78
    private String issuerApplicationDataByte4To7; //79-86
    private String cryptogramAmount; //87-98
    private String issuerApplicationDataByte8; //99-100
    private String issuerApplicationDataByte9To16; // 101-116
    private String issuerApplicationDataByte1; //117-118
    private String issuerApplicationDataByte17; //119-120
    private String issuerApplicationDataByte18To32; //121-150
    private String formFactorIndicator; //151-158
    private String issuerScript1Results; //159-168

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

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    public void setCardSequenceNumber(String cardSequenceNumber) {
        this.cardSequenceNumber = cardSequenceNumber;
    }

    public String getTerminalTransactionDate() {
        return terminalTransactionDate;
    }

    public void setTerminalTransactionDate(String terminalTransactionDate) {
        this.terminalTransactionDate = terminalTransactionDate;
    }

    public String getTerminalCapabilityProfile() {
        return terminalCapabilityProfile;
    }

    public void setTerminalCapabilityProfile(String terminalCapabilityProfile) {
        this.terminalCapabilityProfile = terminalCapabilityProfile;
    }

    public String getTerminalCountryCode() {
        return terminalCountryCode;
    }

    public void setTerminalCountryCode(String terminalCountryCode) {
        this.terminalCountryCode = terminalCountryCode;
    }

    public String getTerminalSerialNumber() {
        return terminalSerialNumber;
    }

    public void setTerminalSerialNumber(String terminalSerialNumber) {
        this.terminalSerialNumber = terminalSerialNumber;
    }

    public String getUnpredictableNumber() {
        return unpredictableNumber;
    }

    public void setUnpredictableNumber(String unpredictableNumber) {
        this.unpredictableNumber = unpredictableNumber;
    }

    public String getApplicationTransactionCounter() {
        return applicationTransactionCounter;
    }

    public void setApplicationTransactionCounter(String applicationTransactionCounter) {
        this.applicationTransactionCounter = applicationTransactionCounter;
    }

    public String getApplicationInterchangeProfile() {
        return applicationInterchangeProfile;
    }

    public void setApplicationInterchangeProfile(String applicationInterchangeProfile) {
        this.applicationInterchangeProfile = applicationInterchangeProfile;
    }

    public String getCryptogram() {
        return cryptogram;
    }

    public void setCryptogram(String cryptogram) {
        this.cryptogram = cryptogram;
    }

    public String getIssuerApplicationDataByte2() {
        return issuerApplicationDataByte2;
    }

    public void setIssuerApplicationDataByte2(String issuerApplicationDataByte2) {
        this.issuerApplicationDataByte2 = issuerApplicationDataByte2;
    }

    public String getIssuerApplicationDataByte3() {
        return issuerApplicationDataByte3;
    }

    public void setIssuerApplicationDataByte3(String issuerApplicationDataByte3) {
        this.issuerApplicationDataByte3 = issuerApplicationDataByte3;
    }

    public String getTerminalVerificationResults() {
        return terminalVerificationResults;
    }

    public void setTerminalVerificationResults(String terminalVerificationResults) {
        this.terminalVerificationResults = terminalVerificationResults;
    }

    public String getIssuerApplicationDataByte4To7() {
        return issuerApplicationDataByte4To7;
    }

    public void setIssuerApplicationDataByte4To7(String issuerApplicationDataByte4To7) {
        this.issuerApplicationDataByte4To7 = issuerApplicationDataByte4To7;
    }

    public String getCryptogramAmount() {
        return cryptogramAmount;
    }

    public void setCryptogramAmount(String cryptogramAmount) {
        this.cryptogramAmount = cryptogramAmount;
    }

    public String getIssuerApplicationDataByte8() {
        return issuerApplicationDataByte8;
    }

    public void setIssuerApplicationDataByte8(String issuerApplicationDataByte8) {
        this.issuerApplicationDataByte8 = issuerApplicationDataByte8;
    }

    public String getIssuerApplicationDataByte9To16() {
        return issuerApplicationDataByte9To16;
    }

    public void setIssuerApplicationDataByte9To16(String issuerApplicationDataByte9To16) {
        this.issuerApplicationDataByte9To16 = issuerApplicationDataByte9To16;
    }

    public String getIssuerApplicationDataByte1() {
        return issuerApplicationDataByte1;
    }

    public void setIssuerApplicationDataByte1(String issuerApplicationDataByte1) {
        this.issuerApplicationDataByte1 = issuerApplicationDataByte1;
    }

    public String getIssuerApplicationDataByte17() {
        return issuerApplicationDataByte17;
    }

    public void setIssuerApplicationDataByte17(String issuerApplicationDataByte17) {
        this.issuerApplicationDataByte17 = issuerApplicationDataByte17;
    }

    public String getIssuerApplicationDataByte18To32() {
        return issuerApplicationDataByte18To32;
    }

    public void setIssuerApplicationDataByte18To32(String issuerApplicationDataByte18To32) {
        this.issuerApplicationDataByte18To32 = issuerApplicationDataByte18To32;
    }

    public String getFormFactorIndicator() {
        return formFactorIndicator;
    }

    public void setFormFactorIndicator(String formFactorIndicator) {
        this.formFactorIndicator = formFactorIndicator;
    }

    public String getIssuerScript1Results() {
        return issuerScript1Results;
    }

    public void setIssuerScript1Results(String issuerScript1Results) {
        this.issuerScript1Results = issuerScript1Results;
    }

    @Override
    public String toString() {
        return "TCR07{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", cardSequenceNumber='" + cardSequenceNumber + '\'' +
                ", terminalTransactionDate='" + terminalTransactionDate + '\'' +
                ", terminalCapabilityProfile='" + terminalCapabilityProfile + '\'' +
                ", terminalCountryCode='" + terminalCountryCode + '\'' +
                ", terminalSerialNumber='" + terminalSerialNumber + '\'' +
                ", unpredictableNumber='" + unpredictableNumber + '\'' +
                ", applicationTransactionCounter='" + applicationTransactionCounter + '\'' +
                ", applicationInterchangeProfile='" + applicationInterchangeProfile + '\'' +
                ", cryptogram='" + cryptogram + '\'' +
                ", issuerApplicationDataByte2='" + issuerApplicationDataByte2 + '\'' +
                ", issuerApplicationDataByte3='" + issuerApplicationDataByte3 + '\'' +
                ", terminalVerificationResults='" + terminalVerificationResults + '\'' +
                ", issuerApplicationDataByte4To7='" + issuerApplicationDataByte4To7 + '\'' +
                ", cryptogramAmount='" + cryptogramAmount + '\'' +
                ", issuerApplicationDataByte8='" + issuerApplicationDataByte8 + '\'' +
                ", issuerApplicationDataByte9To16='" + issuerApplicationDataByte9To16 + '\'' +
                ", issuerApplicationDataByte1='" + issuerApplicationDataByte1 + '\'' +
                ", issuerApplicationDataByte17='" + issuerApplicationDataByte17 + '\'' +
                ", issuerApplicationDataByte18To32='" + issuerApplicationDataByte18To32 + '\'' +
                ", formFactorIndicator='" + formFactorIndicator + '\'' +
                ", issuerScript1Results='" + issuerScript1Results + '\'' +
                '}';
    }
}
