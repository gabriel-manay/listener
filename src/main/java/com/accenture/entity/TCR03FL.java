package com.accenture.entity;

public class TCR03FL extends TCR{
    //Fleet Service
    private String transactionCode;	//1-2
    private String transactionCodeQualifier;	// 3
    private String transactionComponentSequenceNumber;	// 4
    private String reserved1;	// 5-14
    private String businessApplicationID; //15-16
    private String businessFormatCode; //17-18
    private String reserved2; //19-22
    private String expandedFuelType; //23-26
    private String typeOfPurchase; //27
    private String fuelType; //28-29
    private String unitOfMeasure; //30
    private String quantity; //31-42
    private String unitCost; //43-54
    private String grossFuelPrice; //55-66
    private String netFuelPrice; //67-78
    private String grossNonFuelPrice; //79-90
    private String netNonFuelPrice; //91-102
    private String odometerReading; //103-109
    private String vatTaxRate; //110-113
    private String miscellaneousFuelTax; //114-125
    private String productQualifier; //126-131
    private String reserved3; //132-137
    private String miscellaneousNonFuelTax; //138-149
    private String serviceType; //150
    private String miscellaneousFuelTaxExemptionStatus; //151
    private String miscellaneousNonFuelTaxExemptionStatus; //152
    private String reserved4; //153-168

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

    public String getBusinessApplicationID() {
        return businessApplicationID;
    }

    public void setBusinessApplicationID(String businessApplicationID) {
        this.businessApplicationID = businessApplicationID;
    }

    public String getBusinessFormatCode() {
        return businessFormatCode;
    }

    public void setBusinessFormatCode(String businessFormatCode) {
        this.businessFormatCode = businessFormatCode;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public String getExpandedFuelType() {
        return expandedFuelType;
    }

    public void setExpandedFuelType(String expandedFuelType) {
        this.expandedFuelType = expandedFuelType;
    }

    public String getTypeOfPurchase() {
        return typeOfPurchase;
    }

    public void setTypeOfPurchase(String typeOfPurchase) {
        this.typeOfPurchase = typeOfPurchase;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }

    public String getGrossFuelPrice() {
        return grossFuelPrice;
    }

    public void setGrossFuelPrice(String grossFuelPrice) {
        this.grossFuelPrice = grossFuelPrice;
    }

    public String getNetFuelPrice() {
        return netFuelPrice;
    }

    public void setNetFuelPrice(String netFuelPrice) {
        this.netFuelPrice = netFuelPrice;
    }

    public String getGrossNonFuelPrice() {
        return grossNonFuelPrice;
    }

    public void setGrossNonFuelPrice(String grossNonFuelPrice) {
        this.grossNonFuelPrice = grossNonFuelPrice;
    }

    public String getNetNonFuelPrice() {
        return netNonFuelPrice;
    }

    public void setNetNonFuelPrice(String netNonFuelPrice) {
        this.netNonFuelPrice = netNonFuelPrice;
    }

    public String getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(String odometerReading) {
        this.odometerReading = odometerReading;
    }

    public String getVatTaxRate() {
        return vatTaxRate;
    }

    public void setVatTaxRate(String vatTaxRate) {
        this.vatTaxRate = vatTaxRate;
    }

    public String getMiscellaneousFuelTax() {
        return miscellaneousFuelTax;
    }

    public void setMiscellaneousFuelTax(String miscellaneousFuelTax) {
        this.miscellaneousFuelTax = miscellaneousFuelTax;
    }

    public String getProductQualifier() {
        return productQualifier;
    }

    public void setProductQualifier(String productQualifier) {
        this.productQualifier = productQualifier;
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }

    public String getMiscellaneousNonFuelTax() {
        return miscellaneousNonFuelTax;
    }

    public void setMiscellaneousNonFuelTax(String miscellaneousNonFuelTax) {
        this.miscellaneousNonFuelTax = miscellaneousNonFuelTax;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getMiscellaneousFuelTaxExemptionStatus() {
        return miscellaneousFuelTaxExemptionStatus;
    }

    public void setMiscellaneousFuelTaxExemptionStatus(String miscellaneousFuelTaxExemptionStatus) {
        this.miscellaneousFuelTaxExemptionStatus = miscellaneousFuelTaxExemptionStatus;
    }

    public String getMiscellaneousNonFuelTaxExemptionStatus() {
        return miscellaneousNonFuelTaxExemptionStatus;
    }

    public void setMiscellaneousNonFuelTaxExemptionStatus(String miscellaneousNonFuelTaxExemptionStatus) {
        this.miscellaneousNonFuelTaxExemptionStatus = miscellaneousNonFuelTaxExemptionStatus;
    }

    public String getReserved4() {
        return reserved4;
    }

    public void setReserved4(String reserved4) {
        this.reserved4 = reserved4;
    }

    @Override
    public String toString() {
        return "TCR03FL{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", businessApplicationID='" + businessApplicationID + '\'' +
                ", businessFormatCode='" + businessFormatCode + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                ", expandedFuelType='" + expandedFuelType + '\'' +
                ", typeOfPurchase='" + typeOfPurchase + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                ", quantity='" + quantity + '\'' +
                ", unitCost='" + unitCost + '\'' +
                ", grossFuelPrice='" + grossFuelPrice + '\'' +
                ", netFuelPrice='" + netFuelPrice + '\'' +
                ", grossNonFuelPrice='" + grossNonFuelPrice + '\'' +
                ", netNonFuelPrice='" + netNonFuelPrice + '\'' +
                ", odometerReading='" + odometerReading + '\'' +
                ", vatTaxRate='" + vatTaxRate + '\'' +
                ", miscellaneousFuelTax='" + miscellaneousFuelTax + '\'' +
                ", productQualifier='" + productQualifier + '\'' +
                ", reserved3='" + reserved3 + '\'' +
                ", miscellaneousNonFuelTax='" + miscellaneousNonFuelTax + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", miscellaneousFuelTaxExemptionStatus='" + miscellaneousFuelTaxExemptionStatus + '\'' +
                ", miscellaneousNonFuelTaxExemptionStatus='" + miscellaneousNonFuelTaxExemptionStatus + '\'' +
                ", reserved4='" + reserved4 + '\'' +
                '}';
    }
}
