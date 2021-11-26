package com.accenture.entity;

public class TCR05 extends TCR{
    public String transactionCode; //1-2
    public String transactionCodeQualifier; //3
    public String transactionComponentSequenceNumber; //4
    public String transactionIdentifier; //5-19
    public String authorizedAmount; //20-31
    public String authorizationCurrencyCode; //32-34
    public String authorizationResponseCode; //35-36
    public String validationCode; //37-40
    public String excludedTransactionIdentifierReason; //41
    public String reserved1; //42
    public String reserved2; //43-44
    public String multipleClearingSequenceNumber; //45-46
    public String multipleClearingSequenceCount; //47-48
    public String marketSpecificAuthorizationDataIndicator; //49
    public String totalAuthorizedAmount; //50-61
    public String informationIndicator; //62
    public String merchantTelephoneNumber; // 63-76
    public String additionalDataIndicator; //77
    public String merchantVolumeIndicator; //78-79
    public String electronicCommerceGoodsIndicator; //80-81
    public String merchantVerificationValue; //82-91
    public String interchangeFeeAmount; //92-106
    public String interchangeFeeSign; //107
    public String sourceCurrencyToBaseCurrencyExchangeRate; //108-115
    public String baseCurrencyToDestinationCurrencyExchangeRate; //116-123
    public String optionalIssuerISAAmount; //124-135
    public String productID; //136-137
    public String programID; //138-143
    public String dynamicCurrencyConversionIndicator; //144
    public String accountTypeIdentification; //145-148
    public String spendQualifiedIndicator; //149
    public String panToken; //150-165
    public String reserved3; //166-167
    public String cvv2ResultCode; //168

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

    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

    public String getAuthorizedAmount() {
        return authorizedAmount;
    }

    public void setAuthorizedAmount(String authorizedAmount) {
        this.authorizedAmount = authorizedAmount;
    }

    public String getAuthorizationCurrencyCode() {
        return authorizationCurrencyCode;
    }

    public void setAuthorizationCurrencyCode(String authorizationCurrencyCode) {
        this.authorizationCurrencyCode = authorizationCurrencyCode;
    }

    public String getAuthorizationResponseCode() {
        return authorizationResponseCode;
    }

    public void setAuthorizationResponseCode(String authorizationResponseCode) {
        this.authorizationResponseCode = authorizationResponseCode;
    }

    public String getValidationCode() {
        return validationCode;
    }

    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
    }

    public String getExcludedTransactionIdentifierReason() {
        return excludedTransactionIdentifierReason;
    }

    public void setExcludedTransactionIdentifierReason(String excludedTransactionIdentifierReason) {
        this.excludedTransactionIdentifierReason = excludedTransactionIdentifierReason;
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public String getMultipleClearingSequenceNumber() {
        return multipleClearingSequenceNumber;
    }

    public void setMultipleClearingSequenceNumber(String multipleClearingSequenceNumber) {
        this.multipleClearingSequenceNumber = multipleClearingSequenceNumber;
    }

    public String getMultipleClearingSequenceCount() {
        return multipleClearingSequenceCount;
    }

    public void setMultipleClearingSequenceCount(String multipleClearingSequenceCount) {
        this.multipleClearingSequenceCount = multipleClearingSequenceCount;
    }

    public String getMarketSpecificAuthorizationDataIndicator() {
        return marketSpecificAuthorizationDataIndicator;
    }

    public void setMarketSpecificAuthorizationDataIndicator(String marketSpecificAuthorizationDataIndicator) {
        this.marketSpecificAuthorizationDataIndicator = marketSpecificAuthorizationDataIndicator;
    }

    public String getTotalAuthorizedAmount() {
        return totalAuthorizedAmount;
    }

    public void setTotalAuthorizedAmount(String totalAuthorizedAmount) {
        this.totalAuthorizedAmount = totalAuthorizedAmount;
    }

    public String getInformationIndicator() {
        return informationIndicator;
    }

    public void setInformationIndicator(String informationIndicator) {
        this.informationIndicator = informationIndicator;
    }

    public String getMerchantTelephoneNumber() {
        return merchantTelephoneNumber;
    }

    public void setMerchantTelephoneNumber(String merchantTelephoneNumber) {
        this.merchantTelephoneNumber = merchantTelephoneNumber;
    }

    public String getAdditionalDataIndicator() {
        return additionalDataIndicator;
    }

    public void setAdditionalDataIndicator(String additionalDataIndicator) {
        this.additionalDataIndicator = additionalDataIndicator;
    }

    public String getMerchantVolumeIndicator() {
        return merchantVolumeIndicator;
    }

    public void setMerchantVolumeIndicator(String merchantVolumeIndicator) {
        this.merchantVolumeIndicator = merchantVolumeIndicator;
    }

    public String getElectronicCommerceGoodsIndicator() {
        return electronicCommerceGoodsIndicator;
    }

    public void setElectronicCommerceGoodsIndicator(String electronicCommerceGoodsIndicator) {
        this.electronicCommerceGoodsIndicator = electronicCommerceGoodsIndicator;
    }

    public String getMerchantVerificationValue() {
        return merchantVerificationValue;
    }

    public void setMerchantVerificationValue(String merchantVerificationValue) {
        this.merchantVerificationValue = merchantVerificationValue;
    }

    public String getInterchangeFeeAmount() {
        return interchangeFeeAmount;
    }

    public void setInterchangeFeeAmount(String interchangeFeeAmount) {
        this.interchangeFeeAmount = interchangeFeeAmount;
    }

    public String getInterchangeFeeSign() {
        return interchangeFeeSign;
    }

    public void setInterchangeFeeSign(String interchangeFeeSign) {
        this.interchangeFeeSign = interchangeFeeSign;
    }

    public String getSourceCurrencyToBaseCurrencyExchangeRate() {
        return sourceCurrencyToBaseCurrencyExchangeRate;
    }

    public void setSourceCurrencyToBaseCurrencyExchangeRate(String sourceCurrencyToBaseCurrencyExchangeRate) {
        this.sourceCurrencyToBaseCurrencyExchangeRate = sourceCurrencyToBaseCurrencyExchangeRate;
    }

    public String getBaseCurrencyToDestinationCurrencyExchangeRate() {
        return baseCurrencyToDestinationCurrencyExchangeRate;
    }

    public void setBaseCurrencyToDestinationCurrencyExchangeRate(String baseCurrencyToDestinationCurrencyExchangeRate) {
        this.baseCurrencyToDestinationCurrencyExchangeRate = baseCurrencyToDestinationCurrencyExchangeRate;
    }

    public String getOptionalIssuerISAAmount() {
        return optionalIssuerISAAmount;
    }

    public void setOptionalIssuerISAAmount(String optionalIssuerISAAmount) {
        this.optionalIssuerISAAmount = optionalIssuerISAAmount;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProgramID() {
        return programID;
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public String getDynamicCurrencyConversionIndicator() {
        return dynamicCurrencyConversionIndicator;
    }

    public void setDynamicCurrencyConversionIndicator(String dynamicCurrencyConversionIndicator) {
        this.dynamicCurrencyConversionIndicator = dynamicCurrencyConversionIndicator;
    }

    public String getAccountTypeIdentification() {
        return accountTypeIdentification;
    }

    public void setAccountTypeIdentification(String accountTypeIdentification) {
        this.accountTypeIdentification = accountTypeIdentification;
    }

    public String getSpendQualifiedIndicator() {
        return spendQualifiedIndicator;
    }

    public void setSpendQualifiedIndicator(String spendQualifiedIndicator) {
        this.spendQualifiedIndicator = spendQualifiedIndicator;
    }

    public String getPanToken() {
        return panToken;
    }

    public void setPanToken(String panToken) {
        this.panToken = panToken;
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }

    public String getCvv2ResultCode() {
        return cvv2ResultCode;
    }

    public void setCvv2ResultCode(String cvv2ResultCode) {
        this.cvv2ResultCode = cvv2ResultCode;
    }

    @Override
    public String toString() {
        return "TCR05{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", transactionIdentifier='" + transactionIdentifier + '\'' +
                ", authorizedAmount='" + authorizedAmount + '\'' +
                ", authorizationCurrencyCode='" + authorizationCurrencyCode + '\'' +
                ", authorizationResponseCode='" + authorizationResponseCode + '\'' +
                ", validationCode='" + validationCode + '\'' +
                ", excludedTransactionIdentifierReason='" + excludedTransactionIdentifierReason + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                ", multipleClearingSequenceNumber='" + multipleClearingSequenceNumber + '\'' +
                ", multipleClearingSequenceCount='" + multipleClearingSequenceCount + '\'' +
                ", marketSpecificAuthorizationDataIndicator='" + marketSpecificAuthorizationDataIndicator + '\'' +
                ", totalAuthorizedAmount='" + totalAuthorizedAmount + '\'' +
                ", informationIndicator='" + informationIndicator + '\'' +
                ", merchantTelephoneNumber='" + merchantTelephoneNumber + '\'' +
                ", additionalDataIndicator='" + additionalDataIndicator + '\'' +
                ", merchantVolumeIndicator='" + merchantVolumeIndicator + '\'' +
                ", electronicCommerceGoodsIndicator='" + electronicCommerceGoodsIndicator + '\'' +
                ", merchantVerificationValue='" + merchantVerificationValue + '\'' +
                ", interchangeFeeAmount='" + interchangeFeeAmount + '\'' +
                ", interchangeFeeSign='" + interchangeFeeSign + '\'' +
                ", sourceCurrencyToBaseCurrencyExchangeRate='" + sourceCurrencyToBaseCurrencyExchangeRate + '\'' +
                ", baseCurrencyToDestinationCurrencyExchangeRate='" + baseCurrencyToDestinationCurrencyExchangeRate + '\'' +
                ", optionalIssuerISAAmount='" + optionalIssuerISAAmount + '\'' +
                ", productID='" + productID + '\'' +
                ", programID='" + programID + '\'' +
                ", dynamicCurrencyConversionIndicator='" + dynamicCurrencyConversionIndicator + '\'' +
                ", accountTypeIdentification='" + accountTypeIdentification + '\'' +
                ", spendQualifiedIndicator='" + spendQualifiedIndicator + '\'' +
                ", panToken='" + panToken + '\'' +
                ", reserved3='" + reserved3 + '\'' +
                ", cvv2ResultCode='" + cvv2ResultCode + '\'' +
                '}';
    }
}
