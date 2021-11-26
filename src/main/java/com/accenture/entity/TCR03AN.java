package com.accenture.entity;

public class TCR03AN extends TCR {
    //Passenger Transport Ancillary Data
    private String transactionCode;	//1-2
    private String transactionCodeQualifier;	// 3
    private String transactionComponentSequenceNumber;	// 4
    private String reserved1;	// 5-14
    private String businessApplicationID; //15-16
    private String businessFormatCode; //17-18
    private String ancillaryTicketDocumentNumber; //19-33
    private String ancillaryServiceCategory1; //34-37
    private String ancillaryServiceSubCategory1; //38-41
    private String ancillaryServiceCategory2; //42-45
    private String ancillaryServiceSubCategory2; //46-49
    private String ancillaryServiceCategory3; //50-53
    private String ancillaryServiceSubCategory3; //54-57
    private String ancillaryServiceCategory4; //58-61
    private String ancillaryServiceSubCategory4; //62-65
    private String passengerName; //66-85
    private String issuedInConnectionWithTicketNumber; //86-100
    private String creditReasonIndicator; //101
    private String reserved2; //102-168

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

    public String getAncillaryTicketDocumentNumber() {
        return ancillaryTicketDocumentNumber;
    }

    public void setAncillaryTicketDocumentNumber(String ancillaryTicketDocumentNumber) {
        this.ancillaryTicketDocumentNumber = ancillaryTicketDocumentNumber;
    }

    public String getAncillaryServiceCategory1() {
        return ancillaryServiceCategory1;
    }

    public void setAncillaryServiceCategory1(String ancillaryServiceCategory1) {
        this.ancillaryServiceCategory1 = ancillaryServiceCategory1;
    }

    public String getAncillaryServiceSubCategory1() {
        return ancillaryServiceSubCategory1;
    }

    public void setAncillaryServiceSubCategory1(String ancillaryServiceSubCategory1) {
        this.ancillaryServiceSubCategory1 = ancillaryServiceSubCategory1;
    }

    public String getAncillaryServiceCategory2() {
        return ancillaryServiceCategory2;
    }

    public void setAncillaryServiceCategory2(String ancillaryServiceCategory2) {
        this.ancillaryServiceCategory2 = ancillaryServiceCategory2;
    }

    public String getAncillaryServiceSubCategory2() {
        return ancillaryServiceSubCategory2;
    }

    public void setAncillaryServiceSubCategory2(String ancillaryServiceSubCategory2) {
        this.ancillaryServiceSubCategory2 = ancillaryServiceSubCategory2;
    }

    public String getAncillaryServiceCategory3() {
        return ancillaryServiceCategory3;
    }

    public void setAncillaryServiceCategory3(String ancillaryServiceCategory3) {
        this.ancillaryServiceCategory3 = ancillaryServiceCategory3;
    }

    public String getAncillaryServiceSubCategory3() {
        return ancillaryServiceSubCategory3;
    }

    public void setAncillaryServiceSubCategory3(String ancillaryServiceSubCategory3) {
        this.ancillaryServiceSubCategory3 = ancillaryServiceSubCategory3;
    }

    public String getAncillaryServiceCategory4() {
        return ancillaryServiceCategory4;
    }

    public void setAncillaryServiceCategory4(String ancillaryServiceCategory4) {
        this.ancillaryServiceCategory4 = ancillaryServiceCategory4;
    }

    public String getAncillaryServiceSubCategory4() {
        return ancillaryServiceSubCategory4;
    }

    public void setAncillaryServiceSubCategory4(String ancillaryServiceSubCategory4) {
        this.ancillaryServiceSubCategory4 = ancillaryServiceSubCategory4;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getIssuedInConnectionWithTicketNumber() {
        return issuedInConnectionWithTicketNumber;
    }

    public void setIssuedInConnectionWithTicketNumber(String issuedInConnectionWithTicketNumber) {
        this.issuedInConnectionWithTicketNumber = issuedInConnectionWithTicketNumber;
    }

    public String getCreditReasonIndicator() {
        return creditReasonIndicator;
    }

    public void setCreditReasonIndicator(String creditReasonIndicator) {
        this.creditReasonIndicator = creditReasonIndicator;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    @Override
    public String toString() {
        return "TCR03AN{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", businessApplicationID='" + businessApplicationID + '\'' +
                ", businessFormatCode='" + businessFormatCode + '\'' +
                ", ancillaryTicketDocumentNumber='" + ancillaryTicketDocumentNumber + '\'' +
                ", ancillaryServiceCategory1='" + ancillaryServiceCategory1 + '\'' +
                ", ancillaryServiceSubCategory1='" + ancillaryServiceSubCategory1 + '\'' +
                ", ancillaryServiceCategory2='" + ancillaryServiceCategory2 + '\'' +
                ", ancillaryServiceSubCategory2='" + ancillaryServiceSubCategory2 + '\'' +
                ", ancillaryServiceCategory3='" + ancillaryServiceCategory3 + '\'' +
                ", ancillaryServiceSubCategory3='" + ancillaryServiceSubCategory3 + '\'' +
                ", ancillaryServiceCategory4='" + ancillaryServiceCategory4 + '\'' +
                ", ancillaryServiceSubCategory4='" + ancillaryServiceSubCategory4 + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", issuedInConnectionWithTicketNumber='" + issuedInConnectionWithTicketNumber + '\'' +
                ", creditReasonIndicator='" + creditReasonIndicator + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                '}';
    }
}
