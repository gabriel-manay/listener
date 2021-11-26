package com.accenture.entity;

public class TCR03CA extends TCR{
    //Car Rental
    private String transactionCode;	//1-2
    private String transactionCodeQualifier;	// 3
    private String transactionComponentSequenceNumber;	// 4
    private String reserved1;	// 5-14
    private String businessApplicationID; //15-16
    private String businessFormatCode; //17-18
    private String daysRented; //19-20
    private String reserved2; //21-26
    private String carRentalNoShowIndicator; //27
    private String carRentalExtraCharges; //28-33
    private String reserved3; //34-37
    private String carRentalCheckOutDate; //38-43
    private String dailyRentalRate; //44-55
    private String weeklyRentalRate; //56-67
    private String insuranceCharges; //68-79
    private String fuelCharges; //80-91
    private String carClassCode; //92-93
    private String oneWayDropOffCharges; //94-105
    private String renterName; //106-145
    private String reserved4; //146-168

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

    public String getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(String daysRented) {
        this.daysRented = daysRented;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public String getCarRentalNoShowIndicator() {
        return carRentalNoShowIndicator;
    }

    public void setCarRentalNoShowIndicator(String carRentalNoShowIndicator) {
        this.carRentalNoShowIndicator = carRentalNoShowIndicator;
    }

    public String getCarRentalExtraCharges() {
        return carRentalExtraCharges;
    }

    public void setCarRentalExtraCharges(String carRentalExtraCharges) {
        this.carRentalExtraCharges = carRentalExtraCharges;
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }

    public String getCarRentalCheckOutDate() {
        return carRentalCheckOutDate;
    }

    public void setCarRentalCheckOutDate(String carRentalCheckOutDate) {
        this.carRentalCheckOutDate = carRentalCheckOutDate;
    }

    public String getDailyRentalRate() {
        return dailyRentalRate;
    }

    public void setDailyRentalRate(String dailyRentalRate) {
        this.dailyRentalRate = dailyRentalRate;
    }

    public String getWeeklyRentalRate() {
        return weeklyRentalRate;
    }

    public void setWeeklyRentalRate(String weeklyRentalRate) {
        this.weeklyRentalRate = weeklyRentalRate;
    }

    public String getInsuranceCharges() {
        return insuranceCharges;
    }

    public void setInsuranceCharges(String insuranceCharges) {
        this.insuranceCharges = insuranceCharges;
    }

    public String getFuelCharges() {
        return fuelCharges;
    }

    public void setFuelCharges(String fuelCharges) {
        this.fuelCharges = fuelCharges;
    }

    public String getCarClassCode() {
        return carClassCode;
    }

    public void setCarClassCode(String carClassCode) {
        this.carClassCode = carClassCode;
    }

    public String getOneWayDropOffCharges() {
        return oneWayDropOffCharges;
    }

    public void setOneWayDropOffCharges(String oneWayDropOffCharges) {
        this.oneWayDropOffCharges = oneWayDropOffCharges;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public String getReserved4() {
        return reserved4;
    }

    public void setReserved4(String reserved4) {
        this.reserved4 = reserved4;
    }

    @Override
    public String toString() {
        return "TCR03CA{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", businessApplicationID='" + businessApplicationID + '\'' +
                ", businessFormatCode='" + businessFormatCode + '\'' +
                ", daysRented='" + daysRented + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                ", carRentalNoShowIndicator='" + carRentalNoShowIndicator + '\'' +
                ", carRentalExtraCharges='" + carRentalExtraCharges + '\'' +
                ", reserved3='" + reserved3 + '\'' +
                ", carRentalCheckOutDate='" + carRentalCheckOutDate + '\'' +
                ", dailyRentalRate='" + dailyRentalRate + '\'' +
                ", weeklyRentalRate='" + weeklyRentalRate + '\'' +
                ", insuranceCharges='" + insuranceCharges + '\'' +
                ", fuelCharges='" + fuelCharges + '\'' +
                ", carClassCode='" + carClassCode + '\'' +
                ", oneWayDropOffCharges='" + oneWayDropOffCharges + '\'' +
                ", renterName='" + renterName + '\'' +
                ", reserved4='" + reserved4 + '\'' +
                '}';
    }
}
