package com.accenture.entity;

public class TCR02 extends TCR{
    //Argentina
    private String transactionCode;
    private String transactionCodeQualifier;
    private String transactionComponentSequenceNumber;
    private String installmentPaymentTotalAmount;
    private String nationalNetCountryCode;
    private String installmentPaymentIndicator;
    private String numberOfInstallmentPayments;
    private String installmentPaymentNumber;
    private String installmentPaymentInterestAmount;
    private String vatForInstallmentPaymentInterestAmount;
    private String installmentPaymentRiskAmount;
    private String vatForInstallmentPaymentRiskAmount;
    private String irfIndicator;
    private String settlementIndicator;
    private String deferredCardholderBillingDate;
    private String deferredSettlementDate;
    private String tipAmount;
    private String interchangeReimbursementFee;
    private String vatNationalReimbursementFee;
    private String promotionData;
    private String reserved;

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

    public String getInstallmentPaymentTotalAmount() {
        return installmentPaymentTotalAmount;
    }

    public void setInstallmentPaymentTotalAmount(String installmentPaymentTotalAmount) {
        this.installmentPaymentTotalAmount = installmentPaymentTotalAmount;
    }

    public String getNationalNetCountryCode() {
        return nationalNetCountryCode;
    }

    public void setNationalNetCountryCode(String nationalNetCountryCode) {
        this.nationalNetCountryCode = nationalNetCountryCode;
    }

    public String getInstallmentPaymentIndicator() {
        return installmentPaymentIndicator;
    }

    public void setInstallmentPaymentIndicator(String installmentPaymentIndicator) {
        this.installmentPaymentIndicator = installmentPaymentIndicator;
    }

    public String getNumberOfInstallmentPayments() {
        return numberOfInstallmentPayments;
    }

    public void setNumberOfInstallmentPayments(String numberOfInstallmentPayments) {
        this.numberOfInstallmentPayments = numberOfInstallmentPayments;
    }

    public String getInstallmentPaymentNumber() {
        return installmentPaymentNumber;
    }

    public void setInstallmentPaymentNumber(String installmentPaymentNumber) {
        this.installmentPaymentNumber = installmentPaymentNumber;
    }

    public String getInstallmentPaymentInterestAmount() {
        return installmentPaymentInterestAmount;
    }

    public void setInstallmentPaymentInterestAmount(String installmentPaymentInterestAmount) {
        this.installmentPaymentInterestAmount = installmentPaymentInterestAmount;
    }

    public String getVatForInstallmentPaymentInterestAmount() {
        return vatForInstallmentPaymentInterestAmount;
    }

    public void setVatForInstallmentPaymentInterestAmount(String vatForInstallmentPaymentInterestAmount) {
        this.vatForInstallmentPaymentInterestAmount = vatForInstallmentPaymentInterestAmount;
    }

    public String getInstallmentPaymentRiskAmount() {
        return installmentPaymentRiskAmount;
    }

    public void setInstallmentPaymentRiskAmount(String installmentPaymentRiskAmount) {
        this.installmentPaymentRiskAmount = installmentPaymentRiskAmount;
    }

    public String getVatForInstallmentPaymentRiskAmount() {
        return vatForInstallmentPaymentRiskAmount;
    }

    public void setVatForInstallmentPaymentRiskAmount(String vatForInstallmentPaymentRiskAmount) {
        this.vatForInstallmentPaymentRiskAmount = vatForInstallmentPaymentRiskAmount;
    }

    public String getIrfIndicator() {
        return irfIndicator;
    }

    public void setIrfIndicator(String irfIndicator) {
        this.irfIndicator = irfIndicator;
    }

    public String getSettlementIndicator() {
        return settlementIndicator;
    }

    public void setSettlementIndicator(String settlementIndicator) {
        this.settlementIndicator = settlementIndicator;
    }

    public String getDeferredCardholderBillingDate() {
        return deferredCardholderBillingDate;
    }

    public void setDeferredCardholderBillingDate(String deferredCardholderBillingDate) {
        this.deferredCardholderBillingDate = deferredCardholderBillingDate;
    }

    public String getDeferredSettlementDate() {
        return deferredSettlementDate;
    }

    public void setDeferredSettlementDate(String deferredSettlementDate) {
        this.deferredSettlementDate = deferredSettlementDate;
    }

    public String getTipAmount() {
        return tipAmount;
    }

    public void setTipAmount(String tipAmount) {
        this.tipAmount = tipAmount;
    }

    public String getInterchangeReimbursementFee() {
        return interchangeReimbursementFee;
    }

    public void setInterchangeReimbursementFee(String interchangeReimbursementFee) {
        this.interchangeReimbursementFee = interchangeReimbursementFee;
    }

    public String getVatNationalReimbursementFee() {
        return vatNationalReimbursementFee;
    }

    public void setVatNationalReimbursementFee(String vatNationalReimbursementFee) {
        this.vatNationalReimbursementFee = vatNationalReimbursementFee;
    }

    public String getPromotionData() {
        return promotionData;
    }

    public void setPromotionData(String promotionData) {
        this.promotionData = promotionData;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return "TCR02{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", installmentPaymentTotalAmount='" + installmentPaymentTotalAmount + '\'' +
                ", nationalNetCountryCode='" + nationalNetCountryCode + '\'' +
                ", installmentPaymentIndicator='" + installmentPaymentIndicator + '\'' +
                ", numberOfInstallmentPayments='" + numberOfInstallmentPayments + '\'' +
                ", installmentPaymentNumber='" + installmentPaymentNumber + '\'' +
                ", installmentPaymentInterestAmount='" + installmentPaymentInterestAmount + '\'' +
                ", vatForInstallmentPaymentInterestAmount='" + vatForInstallmentPaymentInterestAmount + '\'' +
                ", installmentPaymentRiskAmount='" + installmentPaymentRiskAmount + '\'' +
                ", vatForInstallmentPaymentRiskAmount='" + vatForInstallmentPaymentRiskAmount + '\'' +
                ", irfIndicator='" + irfIndicator + '\'' +
                ", settlementIndicator='" + settlementIndicator + '\'' +
                ", deferredCardholderBillingDate='" + deferredCardholderBillingDate + '\'' +
                ", deferredSettlementDate='" + deferredSettlementDate + '\'' +
                ", tipAmount='" + tipAmount + '\'' +
                ", interchangeReimbursementFee='" + interchangeReimbursementFee + '\'' +
                ", vatNationalReimbursementFee='" + vatNationalReimbursementFee + '\'' +
                ", promotionData='" + promotionData + '\'' +
                ", reserved='" + reserved + '\'' +
                '}';
    }
}
