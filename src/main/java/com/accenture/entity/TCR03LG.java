package com.accenture.entity;

public class TCR03LG extends TCR{
    //Lodging
    private String transactionCode;	//1-2
    private String transactionCodeQualifier;	// 3
    private String transactionComponentSequenceNumber;	// 4
    private String reserved1;	// 5-14
    private String businessApplicationID; //15-16
    private String businessFormatCode; //17-18
    private String reserved2; //19-26
    private String lodgingNoShowIndicator; //27
    private String lodgingExtraCharges; //28-33
    private String reserved3; //34-37
    private String lodgingCheckInDate; //38-43
    private String dailyRoomRate; //44-55
    private String totalTax; //56-67
    private String prepaidExpenses; //68-79
    private String foodBeverageCharges; //80-91
    private String folioCashAdvances; //92-103
    private String roomNights; //104-105
    private String totalRoomTax; //106-117
    private String reserved4; //118-168

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

    public String getLodgingNoShowIndicator() {
        return lodgingNoShowIndicator;
    }

    public void setLodgingNoShowIndicator(String lodgingNoShowIndicator) {
        this.lodgingNoShowIndicator = lodgingNoShowIndicator;
    }

    public String getLodgingExtraCharges() {
        return lodgingExtraCharges;
    }

    public void setLodgingExtraCharges(String lodgingExtraCharges) {
        this.lodgingExtraCharges = lodgingExtraCharges;
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }

    public String getLodgingCheckInDate() {
        return lodgingCheckInDate;
    }

    public void setLodgingCheckInDate(String lodgingCheckInDate) {
        this.lodgingCheckInDate = lodgingCheckInDate;
    }

    public String getDailyRoomRate() {
        return dailyRoomRate;
    }

    public void setDailyRoomRate(String dailyRoomRate) {
        this.dailyRoomRate = dailyRoomRate;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public String getPrepaidExpenses() {
        return prepaidExpenses;
    }

    public void setPrepaidExpenses(String prepaidExpenses) {
        this.prepaidExpenses = prepaidExpenses;
    }

    public String getFoodBeverageCharges() {
        return foodBeverageCharges;
    }

    public void setFoodBeverageCharges(String foodBeverageCharges) {
        this.foodBeverageCharges = foodBeverageCharges;
    }

    public String getFolioCashAdvances() {
        return folioCashAdvances;
    }

    public void setFolioCashAdvances(String folioCashAdvances) {
        this.folioCashAdvances = folioCashAdvances;
    }

    public String getRoomNights() {
        return roomNights;
    }

    public void setRoomNights(String roomNights) {
        this.roomNights = roomNights;
    }

    public String getTotalRoomTax() {
        return totalRoomTax;
    }

    public void setTotalRoomTax(String totalRoomTax) {
        this.totalRoomTax = totalRoomTax;
    }

    public String getReserved4() {
        return reserved4;
    }

    public void setReserved4(String reserved4) {
        this.reserved4 = reserved4;
    }

    @Override
    public String toString() {
        return "TCR03LG{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", businessApplicationID='" + businessApplicationID + '\'' +
                ", businessFormatCode='" + businessFormatCode + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                ", lodgingNoShowIndicator='" + lodgingNoShowIndicator + '\'' +
                ", lodgingExtraCharges='" + lodgingExtraCharges + '\'' +
                ", reserved3='" + reserved3 + '\'' +
                ", lodgingCheckInDate='" + lodgingCheckInDate + '\'' +
                ", dailyRoomRate='" + dailyRoomRate + '\'' +
                ", totalTax='" + totalTax + '\'' +
                ", prepaidExpenses='" + prepaidExpenses + '\'' +
                ", foodBeverageCharges='" + foodBeverageCharges + '\'' +
                ", folioCashAdvances='" + folioCashAdvances + '\'' +
                ", roomNights='" + roomNights + '\'' +
                ", totalRoomTax='" + totalRoomTax + '\'' +
                ", reserved4='" + reserved4 + '\'' +
                '}';
    }
}
