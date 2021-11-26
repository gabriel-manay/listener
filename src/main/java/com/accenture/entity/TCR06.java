package com.accenture.entity;

public class TCR06 extends TCR{
    private String transactionCode;	//1-2
    private String transactionCodeQualifier;	// 3
    private String transactionComponentSequenceNumber;	// 4
    private String localTax; // 5-16
    private String localTaxIncluded; //17
    private String nationalTax; //18-29
    private String nationalTaxIncluded; //30
    private String merchantVATRegistrationSingleBusinessReferenceNumber; //31-50
    private String customerVATRegistrationNumber; //51-63
    private String reserved1; //64-75
    private String summaryCommodityCode; //76-79
    private String otherTax; //80-91
    private String messageIdentifier; //92-106
    private String timeOfPurchase; //107-110
    private String customerReferenceIdentifier; //111-127
    private String nonFuelProductCode1; //128-129
    private String nonFuelProductCode2; //130-131
    private String nonFuelProductCode3; //132-133
    private String nonFuelProductCode4; //134-135
    private String nonFuelProductCode5; //136-137
    private String nonFuelProductCode6; //138-139
    private String nonFuelProductCode7; //140-141
    private String nonFuelProductCode8; //142-143
    private String merchantPostalCode; //144-154
    private String reserved2; //155-168

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

    public String getLocalTax() {
        return localTax;
    }

    public void setLocalTax(String localTax) {
        this.localTax = localTax;
    }

    public String getLocalTaxIncluded() {
        return localTaxIncluded;
    }

    public void setLocalTaxIncluded(String localTaxIncluded) {
        this.localTaxIncluded = localTaxIncluded;
    }

    public String getNationalTax() {
        return nationalTax;
    }

    public void setNationalTax(String nationalTax) {
        this.nationalTax = nationalTax;
    }

    public String getNationalTaxIncluded() {
        return nationalTaxIncluded;
    }

    public void setNationalTaxIncluded(String nationalTaxIncluded) {
        this.nationalTaxIncluded = nationalTaxIncluded;
    }

    public String getMerchantVATRegistrationSingleBusinessReferenceNumber() {
        return merchantVATRegistrationSingleBusinessReferenceNumber;
    }

    public void setMerchantVATRegistrationSingleBusinessReferenceNumber(String merchantVATRegistrationSingleBusinessReferenceNumber) {
        this.merchantVATRegistrationSingleBusinessReferenceNumber = merchantVATRegistrationSingleBusinessReferenceNumber;
    }

    public String getCustomerVATRegistrationNumber() {
        return customerVATRegistrationNumber;
    }

    public void setCustomerVATRegistrationNumber(String customerVATRegistrationNumber) {
        this.customerVATRegistrationNumber = customerVATRegistrationNumber;
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    public String getSummaryCommodityCode() {
        return summaryCommodityCode;
    }

    public void setSummaryCommodityCode(String summaryCommodityCode) {
        this.summaryCommodityCode = summaryCommodityCode;
    }

    public String getOtherTax() {
        return otherTax;
    }

    public void setOtherTax(String otherTax) {
        this.otherTax = otherTax;
    }

    public String getMessageIdentifier() {
        return messageIdentifier;
    }

    public void setMessageIdentifier(String messageIdentifier) {
        this.messageIdentifier = messageIdentifier;
    }

    public String getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public void setTimeOfPurchase(String timeOfPurchase) {
        this.timeOfPurchase = timeOfPurchase;
    }

    public String getCustomerReferenceIdentifier() {
        return customerReferenceIdentifier;
    }

    public void setCustomerReferenceIdentifier(String customerReferenceIdentifier) {
        this.customerReferenceIdentifier = customerReferenceIdentifier;
    }

    public String getNonFuelProductCode1() {
        return nonFuelProductCode1;
    }

    public void setNonFuelProductCode1(String nonFuelProductCode1) {
        this.nonFuelProductCode1 = nonFuelProductCode1;
    }

    public String getNonFuelProductCode2() {
        return nonFuelProductCode2;
    }

    public void setNonFuelProductCode2(String nonFuelProductCode2) {
        this.nonFuelProductCode2 = nonFuelProductCode2;
    }

    public String getNonFuelProductCode3() {
        return nonFuelProductCode3;
    }

    public void setNonFuelProductCode3(String nonFuelProductCode3) {
        this.nonFuelProductCode3 = nonFuelProductCode3;
    }

    public String getNonFuelProductCode4() {
        return nonFuelProductCode4;
    }

    public void setNonFuelProductCode4(String nonFuelProductCode4) {
        this.nonFuelProductCode4 = nonFuelProductCode4;
    }

    public String getNonFuelProductCode5() {
        return nonFuelProductCode5;
    }

    public void setNonFuelProductCode5(String nonFuelProductCode5) {
        this.nonFuelProductCode5 = nonFuelProductCode5;
    }

    public String getNonFuelProductCode6() {
        return nonFuelProductCode6;
    }

    public void setNonFuelProductCode6(String nonFuelProductCode6) {
        this.nonFuelProductCode6 = nonFuelProductCode6;
    }

    public String getNonFuelProductCode7() {
        return nonFuelProductCode7;
    }

    public void setNonFuelProductCode7(String nonFuelProductCode7) {
        this.nonFuelProductCode7 = nonFuelProductCode7;
    }

    public String getNonFuelProductCode8() {
        return nonFuelProductCode8;
    }

    public void setNonFuelProductCode8(String nonFuelProductCode8) {
        this.nonFuelProductCode8 = nonFuelProductCode8;
    }

    public String getMerchantPostalCode() {
        return merchantPostalCode;
    }

    public void setMerchantPostalCode(String merchantPostalCode) {
        this.merchantPostalCode = merchantPostalCode;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    @Override
    public String toString() {
        return "TCR06{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", localTax='" + localTax + '\'' +
                ", localTaxIncluded='" + localTaxIncluded + '\'' +
                ", nationalTax='" + nationalTax + '\'' +
                ", nationalTaxIncluded='" + nationalTaxIncluded + '\'' +
                ", merchantVATRegistrationSingleBusinessReferenceNumber='" + merchantVATRegistrationSingleBusinessReferenceNumber + '\'' +
                ", customerVATRegistrationNumber='" + customerVATRegistrationNumber + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", summaryCommodityCode='" + summaryCommodityCode + '\'' +
                ", otherTax='" + otherTax + '\'' +
                ", messageIdentifier='" + messageIdentifier + '\'' +
                ", timeOfPurchase='" + timeOfPurchase + '\'' +
                ", customerReferenceIdentifier='" + customerReferenceIdentifier + '\'' +
                ", nonFuelProductCode1='" + nonFuelProductCode1 + '\'' +
                ", nonFuelProductCode2='" + nonFuelProductCode2 + '\'' +
                ", nonFuelProductCode3='" + nonFuelProductCode3 + '\'' +
                ", nonFuelProductCode4='" + nonFuelProductCode4 + '\'' +
                ", nonFuelProductCode5='" + nonFuelProductCode5 + '\'' +
                ", nonFuelProductCode6='" + nonFuelProductCode6 + '\'' +
                ", nonFuelProductCode7='" + nonFuelProductCode7 + '\'' +
                ", nonFuelProductCode8='" + nonFuelProductCode8 + '\'' +
                ", merchantPostalCode='" + merchantPostalCode + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                '}';
    }
}
