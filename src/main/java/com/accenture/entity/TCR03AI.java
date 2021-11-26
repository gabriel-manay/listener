package com.accenture.entity;

public class TCR03AI extends TCR{
    //Passenger-Itinerary Data
    private String transactionCode;	//1-2
    private String transactionCodeQualifier;	// 3
    private String transactionComponentSequenceNumber;	// 4
    private String reserved1;	// 5-14
    private String businessApplicationID; //15-16
    private String businessFormatCode; //17-18
    private String reserved2; //19-26
    private String passengerName; //27-46
    private String departureDate; //47-52
    private String airportCode; //53-55
    private String trip1LegInformation; //56-62
    private String trip2LegInformation; //63-69
    private String trip3LegInformation; //70-76
    private String trip4LegInformation; //77-83
    private String travelAgencyCode; //84-91
    private String travelAgencyName; //92-116
    private String restrictedTicketIndicator; //117
    private String fareBasisCodeLeg1; //118-123
    private String fareBasisCodeLeg2; //124-129
    private String fareBasisCodeLeg3; //130-135
    private String fareBasisCodeLeg4; //136-141
    private String computerizedReservationSystem; //142-145
    private String flightNumberLeg1; //146-150
    private String flightNumberLeg2; //151-155
    private String flightNumberLeg3; //156-160
    private String flightNumberLeg4; //161-165
    private String creditReasonIndicator; //166
    private String ticketChangeIndicator; //167
    private String reserved3; //168

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

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getTrip1LegInformation() {
        return trip1LegInformation;
    }

    public void setTrip1LegInformation(String trip1LegInformation) {
        this.trip1LegInformation = trip1LegInformation;
    }

    public String getTrip2LegInformation() {
        return trip2LegInformation;
    }

    public void setTrip2LegInformation(String trip2LegInformation) {
        this.trip2LegInformation = trip2LegInformation;
    }

    public String getTrip3LegInformation() {
        return trip3LegInformation;
    }

    public void setTrip3LegInformation(String trip3LegInformation) {
        this.trip3LegInformation = trip3LegInformation;
    }

    public String getTrip4LegInformation() {
        return trip4LegInformation;
    }

    public void setTrip4LegInformation(String trip4LegInformation) {
        this.trip4LegInformation = trip4LegInformation;
    }

    public String getTravelAgencyCode() {
        return travelAgencyCode;
    }

    public void setTravelAgencyCode(String travelAgencyCode) {
        this.travelAgencyCode = travelAgencyCode;
    }

    public String getTravelAgencyName() {
        return travelAgencyName;
    }

    public void setTravelAgencyName(String travelAgencyName) {
        this.travelAgencyName = travelAgencyName;
    }

    public String getRestrictedTicketIndicator() {
        return restrictedTicketIndicator;
    }

    public void setRestrictedTicketIndicator(String restrictedTicketIndicator) {
        this.restrictedTicketIndicator = restrictedTicketIndicator;
    }

    public String getFareBasisCodeLeg1() {
        return fareBasisCodeLeg1;
    }

    public void setFareBasisCodeLeg1(String fareBasisCodeLeg1) {
        this.fareBasisCodeLeg1 = fareBasisCodeLeg1;
    }

    public String getFareBasisCodeLeg2() {
        return fareBasisCodeLeg2;
    }

    public void setFareBasisCodeLeg2(String fareBasisCodeLeg2) {
        this.fareBasisCodeLeg2 = fareBasisCodeLeg2;
    }

    public String getFareBasisCodeLeg3() {
        return fareBasisCodeLeg3;
    }

    public void setFareBasisCodeLeg3(String fareBasisCodeLeg3) {
        this.fareBasisCodeLeg3 = fareBasisCodeLeg3;
    }

    public String getFareBasisCodeLeg4() {
        return fareBasisCodeLeg4;
    }

    public void setFareBasisCodeLeg4(String fareBasisCodeLeg4) {
        this.fareBasisCodeLeg4 = fareBasisCodeLeg4;
    }

    public String getComputerizedReservationSystem() {
        return computerizedReservationSystem;
    }

    public void setComputerizedReservationSystem(String computerizedReservationSystem) {
        this.computerizedReservationSystem = computerizedReservationSystem;
    }

    public String getFlightNumberLeg1() {
        return flightNumberLeg1;
    }

    public void setFlightNumberLeg1(String flightNumberLeg1) {
        this.flightNumberLeg1 = flightNumberLeg1;
    }

    public String getFlightNumberLeg2() {
        return flightNumberLeg2;
    }

    public void setFlightNumberLeg2(String flightNumberLeg2) {
        this.flightNumberLeg2 = flightNumberLeg2;
    }

    public String getFlightNumberLeg3() {
        return flightNumberLeg3;
    }

    public void setFlightNumberLeg3(String flightNumberLeg3) {
        this.flightNumberLeg3 = flightNumberLeg3;
    }

    public String getFlightNumberLeg4() {
        return flightNumberLeg4;
    }

    public void setFlightNumberLeg4(String flightNumberLeg4) {
        this.flightNumberLeg4 = flightNumberLeg4;
    }

    public String getCreditReasonIndicator() {
        return creditReasonIndicator;
    }

    public void setCreditReasonIndicator(String creditReasonIndicator) {
        this.creditReasonIndicator = creditReasonIndicator;
    }

    public String getTicketChangeIndicator() {
        return ticketChangeIndicator;
    }

    public void setTicketChangeIndicator(String ticketChangeIndicator) {
        this.ticketChangeIndicator = ticketChangeIndicator;
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }

    @Override
    public String toString() {
        return "TCR03AI{" +
                "transactionCode='" + transactionCode + '\'' +
                ", transactionCodeQualifier='" + transactionCodeQualifier + '\'' +
                ", transactionComponentSequenceNumber='" + transactionComponentSequenceNumber + '\'' +
                ", reserved1='" + reserved1 + '\'' +
                ", businessApplicationID='" + businessApplicationID + '\'' +
                ", businessFormatCode='" + businessFormatCode + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", airportCode='" + airportCode + '\'' +
                ", trip1LegInformation='" + trip1LegInformation + '\'' +
                ", trip2LegInformation='" + trip2LegInformation + '\'' +
                ", trip3LegInformation='" + trip3LegInformation + '\'' +
                ", trip4LegInformation='" + trip4LegInformation + '\'' +
                ", travelAgencyCode='" + travelAgencyCode + '\'' +
                ", travelAgencyName='" + travelAgencyName + '\'' +
                ", restrictedTicketIndicator='" + restrictedTicketIndicator + '\'' +
                ", fareBasisCodeLeg1='" + fareBasisCodeLeg1 + '\'' +
                ", fareBasisCodeLeg2='" + fareBasisCodeLeg2 + '\'' +
                ", fareBasisCodeLeg3='" + fareBasisCodeLeg3 + '\'' +
                ", fareBasisCodeLeg4='" + fareBasisCodeLeg4 + '\'' +
                ", computerizedReservationSystem='" + computerizedReservationSystem + '\'' +
                ", flightNumberLeg1='" + flightNumberLeg1 + '\'' +
                ", flightNumberLeg2='" + flightNumberLeg2 + '\'' +
                ", flightNumberLeg3='" + flightNumberLeg3 + '\'' +
                ", flightNumberLeg4='" + flightNumberLeg4 + '\'' +
                ", creditReasonIndicator='" + creditReasonIndicator + '\'' +
                ", ticketChangeIndicator='" + ticketChangeIndicator + '\'' +
                ", reserved3='" + reserved3 + '\'' +
                '}';
    }
}
