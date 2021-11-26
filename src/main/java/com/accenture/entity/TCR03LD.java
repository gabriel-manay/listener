package com.accenture.entity;

public class TCR03LD extends TCR{
    //Loan Detail
    private String transactionCode;	//1-2
    private String transactionCodeQualifier;	// 3
    private String transactionComponentSequenceNumber;	// 4
    private String reserved1;	// 5-16
    private String businessFormatCode; //17-18
    private String cardholderTaxIDType; //19-22
    private String cardholderTaxID; //23-37
    private String reserved2; //38-39
    private String assetIndicator; //40
    private String loanType; //41-60
    private String merchantProgramIdentifier; //61-66
    private String reserved3; //67-168

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

    public String getCardholderTaxIDType() {
        return cardholderTaxIDType;
    }

    public void setCardholderTaxIDType(String cardholderTaxIDType) {
        this.cardholderTaxIDType = cardholderTaxIDType;
    }

    public String getCardholderTaxID() {
        return cardholderTaxID;
    }

    public void setCardholderTaxID(String cardholderTaxID) {
        this.cardholderTaxID = cardholderTaxID;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public String getAssetIndicator() {
        return assetIndicator;
    }

    public void setAssetIndicator(String assetIndicator) {
        this.assetIndicator = assetIndicator;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getMerchantProgramIdentifier() {
        return merchantProgramIdentifier;
    }

    public void setMerchantProgramIdentifier(String merchantProgramIdentifier) {
        this.merchantProgramIdentifier = merchantProgramIdentifier;
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }

    @Override
    public String toString() {
        return "TCR03LD{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", businessFormatCode='" + businessFormatCode + '\'' +
                ", cardholderTaxIDType='" + cardholderTaxIDType + '\'' +
                ", cardholderTaxID='" + cardholderTaxID + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                ", assetIndicator='" + assetIndicator + '\'' +
                ", loanType='" + loanType + '\'' +
                ", merchantProgramIdentifier='" + merchantProgramIdentifier + '\'' +
                ", reserved3='" + reserved3 + '\'' +
                '}';
    }
}
