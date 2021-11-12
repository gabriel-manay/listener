package com.accenture.entity;

public class Transaction {
	
	private Integer transactionCode;	//1-2
	private Integer transactionCodeQualifier;	// 3
	private Integer transactionComponentSequenceNumber;	// 4
	private String accountNumber;	// 5-20
	private Integer accountNumberExtension; //21-23
	private String floorLimitIndicator; //24
	private String crbExceptionFileIndicator; //25
	private String PCASIndicator; //26
	private Integer acquirerReferenceNumber; //27-49
	private Integer acquirersBusinessID; //50-57
	private Integer purchaseDate; //58-61
	private Integer destinationAmount; //62-73
	private String destinationCurrencyCode; //74-76
	private Integer sourceAmount; //77-88
	private String sourceCurrencyCode; //89-91
	private String merchantName; //92-116
	private String merchantCity; //117-129
	private String merchantCountryCode; //130-132
	private Integer merchantCategoryCode; //133-136
	private Integer merchantZIPCode; // 137-141
	private String merchantStateProvinceCode; //142-144
	private String requestedPaymentService; //145
	private String numberOfPaymentForms; //146
	private Integer usageCode; //147
	private Integer reasonCode; //148-149
	private Integer settlementFlag; // 150
	private String authorizationCharacteristicsIndicator; //151
	private String authorizationCode; //125-157
	private String POSTerminalCapability; //158
	private String reserved; //159
	private String cardholderIDMethod; //160
	private String collectionOnlyFlag; //161
	private String POSEntryMode; //162-163
	private Integer centralProcessingDate; //164-167
	private String reimbursementAttribute; //168

	
	
	public Transaction() {
	}
	

	public Integer getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(Integer transactionCode) {
		this.transactionCode = transactionCode;
	}
	public Integer getTransactionCodeQualifier() {
		return transactionCodeQualifier;
	}
	public void setTransactionCodeQualifier(Integer transactionCodeQualifier) {
		this.transactionCodeQualifier = transactionCodeQualifier;
	}
	public Integer getTransactionComponentSequenceNumber() {
		return transactionComponentSequenceNumber;
	}
	public void setTransactionComponentSequenceNumber(Integer transactionComponentSequenceNumber) {
		this.transactionComponentSequenceNumber = transactionComponentSequenceNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Integer getAccountNumberExtension() {
		return accountNumberExtension;
	}

	public void setAccountNumberExtension(Integer accountNumberExtension) {
		this.accountNumberExtension = accountNumberExtension;
	}

	public String getFloorLimitIndicator() {
		return floorLimitIndicator;
	}

	public void setFloorLimitIndicator(String floorLimitIndicator) {
		this.floorLimitIndicator = floorLimitIndicator;
	}

	public String getCrbExceptionFileIndicator() {
		return crbExceptionFileIndicator;
	}

	public void setCrbExceptionFileIndicator(String crbExceptionFileIndicator) {
		this.crbExceptionFileIndicator = crbExceptionFileIndicator;
	}

	public String getPCASIndicator() {
		return PCASIndicator;
	}

	public void setPCASIndicator(String PCASIndicator) {
		this.PCASIndicator = PCASIndicator;
	}

	public Integer getAcquirerReferenceNumber() {
		return acquirerReferenceNumber;
	}

	public void setAcquirerReferenceNumber(Integer acquirerReferenceNumber) {
		this.acquirerReferenceNumber = acquirerReferenceNumber;
	}

	public Integer getAcquirersBusinessID() {
		return acquirersBusinessID;
	}

	public void setAcquirersBusinessID(Integer acquirersBusinessID) {
		this.acquirersBusinessID = acquirersBusinessID;
	}

	public Integer getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Integer purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getDestinationAmount() {
		return destinationAmount;
	}

	public void setDestinationAmount(Integer destinationAmount) {
		this.destinationAmount = destinationAmount;
	}

	public String getDestinationCurrencyCode() {
		return destinationCurrencyCode;
	}

	public void setDestinationCurrencyCode(String destinationCurrencyCode) {
		this.destinationCurrencyCode = destinationCurrencyCode;
	}

	public Integer getSourceAmount() {
		return sourceAmount;
	}

	public void setSourceAmount(Integer sourceAmount) {
		this.sourceAmount = sourceAmount;
	}

	public String getSourceCurrencyCode() {
		return sourceCurrencyCode;
	}

	public void setSourceCurrencyCode(String sourceCurrencyCode) {
		this.sourceCurrencyCode = sourceCurrencyCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}

	public String getMerchantCountryCode() {
		return merchantCountryCode;
	}

	public void setMerchantCountryCode(String merchantCountryCode) {
		this.merchantCountryCode = merchantCountryCode;
	}

	public Integer getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(Integer merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public Integer getMerchantZIPCode() {
		return merchantZIPCode;
	}

	public void setMerchantZIPCode(Integer merchantZIPCode) {
		this.merchantZIPCode = merchantZIPCode;
	}

	public String getMerchantStateProvinceCode() {
		return merchantStateProvinceCode;
	}

	public void setMerchantStateProvinceCode(String merchantStateProvinceCode) {
		this.merchantStateProvinceCode = merchantStateProvinceCode;
	}

	public String getRequestedPaymentService() {
		return requestedPaymentService;
	}

	public void setRequestedPaymentService(String requestedPaymentService) {
		this.requestedPaymentService = requestedPaymentService;
	}

	public String getNumberOfPaymentForms() {
		return numberOfPaymentForms;
	}

	public void setNumberOfPaymentForms(String numberOfPaymentForms) {
		this.numberOfPaymentForms = numberOfPaymentForms;
	}

	public Integer getUsageCode() {
		return usageCode;
	}

	public void setUsageCode(Integer usageCode) {
		this.usageCode = usageCode;
	}

	public Integer getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(Integer reasonCode) {
		this.reasonCode = reasonCode;
	}

	public Integer getSettlementFlag() {
		return settlementFlag;
	}

	public void setSettlementFlag(Integer settlementFlag) {
		this.settlementFlag = settlementFlag;
	}

	public String getAuthorizationCharacteristicsIndicator() {
		return authorizationCharacteristicsIndicator;
	}

	public void setAuthorizationCharacteristicsIndicator(String authorizationCharacteristicsIndicator) {
		this.authorizationCharacteristicsIndicator = authorizationCharacteristicsIndicator;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getPOSTerminalCapability() {
		return POSTerminalCapability;
	}

	public void setPOSTerminalCapability(String POSTerminalCapability) {
		this.POSTerminalCapability = POSTerminalCapability;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	public String getCardholderIDMethod() {
		return cardholderIDMethod;
	}

	public void setCardholderIDMethod(String cardholderIDMethod) {
		this.cardholderIDMethod = cardholderIDMethod;
	}

	public String getCollectionOnlyFlag() {
		return collectionOnlyFlag;
	}

	public void setCollectionOnlyFlag(String collectionOnlyFlag) {
		this.collectionOnlyFlag = collectionOnlyFlag;
	}

	public String getPOSEntryMode() {
		return POSEntryMode;
	}

	public void setPOSEntryMode(String POSEntryMode) {
		this.POSEntryMode = POSEntryMode;
	}

	public Integer getCentralProcessingDate() {
		return centralProcessingDate;
	}

	public void setCentralProcessingDate(Integer centralProcessingDate) {
		this.centralProcessingDate = centralProcessingDate;
	}

	public String getReimbursementAttribute() {
		return reimbursementAttribute;
	}

	public void setReimbursementAttribute(String reimbursementAttribute) {
		this.reimbursementAttribute = reimbursementAttribute;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"transactionCode=" + transactionCode +
				", transactionCodeQualifier=" + transactionCodeQualifier +
				", transactionComponentSequenceNumber=" + transactionComponentSequenceNumber +
				", accountNumber='" + accountNumber + '\'' +
				", accountNumberExtension=" + accountNumberExtension +
				", floorLimitIndicator='" + floorLimitIndicator + '\'' +
				", crbExceptionFileIndicator='" + crbExceptionFileIndicator + '\'' +
				", PCASIndicator='" + PCASIndicator + '\'' +
				", acquirerReferenceNumber=" + acquirerReferenceNumber +
				", acquirersBusinessID=" + acquirersBusinessID +
				", purchaseDate=" + purchaseDate +
				", destinationAmount=" + destinationAmount +
				", destinationCurrencyCode='" + destinationCurrencyCode + '\'' +
				", sourceAmount=" + sourceAmount +
				", sourceCurrencyCode='" + sourceCurrencyCode + '\'' +
				", merchantName='" + merchantName + '\'' +
				", merchantCity='" + merchantCity + '\'' +
				", merchantCountryCode='" + merchantCountryCode + '\'' +
				", merchantCategotyCode=" + merchantCategoryCode +
				", merchantZIPCode=" + merchantZIPCode +
				", merchantStateProvinceCode='" + merchantStateProvinceCode + '\'' +
				", requestedPaymentService='" + requestedPaymentService + '\'' +
				", numberOfPaymentForms='" + numberOfPaymentForms + '\'' +
				", usageCode=" + usageCode +
				", reasonCode=" + reasonCode +
				", settlementFlag=" + settlementFlag +
				", authorizationCharacteristicsIndicator='" + authorizationCharacteristicsIndicator + '\'' +
				", authorizationCode='" + authorizationCode + '\'' +
				", POSTerminalCapability='" + POSTerminalCapability + '\'' +
				", reserved='" + reserved + '\'' +
				", cardholderIDMethod='" + cardholderIDMethod + '\'' +
				", collectionOnlyFlag='" + collectionOnlyFlag + '\'' +
				", POSEntryMode='" + POSEntryMode + '\'' +
				", centralProcessingDate=" + centralProcessingDate +
				", reimbursementAttribute='" + reimbursementAttribute + '\'' +
				'}';
	}
}
