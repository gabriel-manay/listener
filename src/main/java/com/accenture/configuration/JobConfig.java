package com.accenture.configuration;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import com.accenture.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.mapping.PatternMatchingCompositeLineMapper;
import org.springframework.batch.item.file.transform.FixedLengthTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.batch.item.support.SingleItemPeekableItemReader;
import org.springframework.batch.item.support.builder.SingleItemPeekableItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.UrlResource;

import com.accenture.service.ILogService;
import com.amazonaws.services.s3.AmazonS3;

@Configuration
public class JobConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(JobConfig.class);

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private AmazonS3 s3Client;

	@Value("${application.bucket.name}")
	private String bucketName;

	@Value("${application.file.name}")
	private String fileName;

	@Value("${cloud.aws.region.static}")
	private String region;

	@Autowired
	ILogService logService;

	@Bean
	public ItemReader<TCR00> itemReader() throws MalformedURLException {

		LineMapper<TCR00> transactionLineMapper = createTransactionLineMapper();

		UrlResource resource = null;
		Log log = null;

		resource = new UrlResource("https://transac2.s3.amazonaws.com/TCR00E.txt");

		//LOGGER.info(">>>>>>>>>>>>>>>>>>		Se registra log");
		//log = logService.registerFileProcess(resource.getFilename(), resource.contentLength());

		//Sólo funciona si archivo/objeto a leer/descargar es público
		//resource = new UrlResource(s3Client.getUrl(bucketName,fileName));

		// renombrar archivo y mover archivo a directorio "procesados"
		//String pattern = "yyyyMMdd";
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		//String date = simpleDateFormat.format(new Date());
		//s3Client.copyObject(bucketName, fileName, bucketName, "procesados/"+ date + "-" +fileName);

		//logService.setAsMoved(log);

		return new FlatFileItemReaderBuilder<TCR00>()
				.name("dataReader")
				.resource(resource)
				.lineMapper(transactionLineMapper)
				.strict(false)
				.build();
	}

	@Bean
	@StepScope
	public ItemReader<Transaction> multiLineItemReader(){
		MultiLineTransactionItemReader reader = new MultiLineTransactionItemReader();
		reader.setDelegate(singleItemPeekableItemReader());
		return reader;
	}

	@Bean
	@StepScope
	public SingleItemPeekableItemReader<TCR> singleItemPeekableItemReader(){
		return new SingleItemPeekableItemReaderBuilder<TCR>()
				.delegate(flatFileItemReader())
				.build();
	}

	@Bean
	@StepScope
	public FlatFileItemReader<TCR> flatFileItemReader(){
		return new FlatFileItemReaderBuilder<TCR>()
				.name("flatFileItemReader")
				.resource(new UrlResource(s3Client.getUrl(bucketName,fileName)))
				.lineMapper(orderFileLineMapper())
				.build();
	}

	private LineMapper<TCR00> createTransactionLineMapper() {
		DefaultLineMapper<TCR00> TransactionLineMapper = new DefaultLineMapper<>();

		LineTokenizer TransactionLineTokenizer = tcr00Tokenizer();
		TransactionLineMapper.setLineTokenizer(TransactionLineTokenizer);

		FieldSetMapper<TCR00> TransactionInformationMapper = tcr00FieldSetMapper();
		TransactionLineMapper.setFieldSetMapper(TransactionInformationMapper);

		return TransactionLineMapper;
	}

	private LineTokenizer tcr00Tokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "accountNumber", "accountNumberExtension", "floorLimitIndicator",
				"crbExceptionFileIndicator", "PCASIndicator", "acquirerReferenceNumber", "acquirersBusinessID",
				"purchaseDate", "destinationAmount", "destinationCurrencyCode", "sourceAmount", "sourceCurrencyCode",
				"merchantName", "merchantCity", "merchantCountryCode", "merchantCategoryCode", "merchantZIPCode",
				"merchantStateProvinceCode", "requestedPaymentService", "numberOfPaymentForms", "usageCode",
				"reasonCode", "settlementFlag", "authorizationCharacteristicsIndicator", "authorizationCode",
				"POSTerminalCapability", "reserved", "cardholderIDMethod", "collectionOnlyFlag", "POSEntryMode",
				"centralProcessingDate", "reimbursementAttribute" };
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 20),
				new Range(21, 23), new Range(24, 24), new Range(25, 25), new Range(26, 26), new Range(27, 49),
				new Range(50, 57), new Range(58, 61), new Range(62, 73), new Range(74, 76), new Range(77, 88),
				new Range(89, 91), new Range(92, 116), new Range(117, 129), new Range(130, 132), new Range(133, 136),
				new Range(137, 141), new Range(142, 144), new Range(145, 145), new Range(146, 146), new Range(147, 147),
				new Range(148, 149), new Range(150, 150), new Range(151, 151), new Range(152, 157), new Range(158, 158),
				new Range(159, 159), new Range(160, 160), new Range(161, 161), new Range(162, 163), new Range(164, 167),
				new Range(168, 168) };
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR00> tcr00FieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR00> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR00.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr01Tokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "businessFormatCode", "tokenAssuranceLevel", "reserved1",
				"reserved2", "documentationIndicator", "memberMessageText", "specialConditionIndicator",
				"feeProgramIndicator", "issuerCharge", "reserved3", "cardAcceptorId", "terminalId",
				"nationalReimbursementFee", "mpeCommerceAndPaymentIndicator", "specialChargebackIndicator", "conversionDate", "reserved4",
				"acceptanceTerminalIndicator", "prepaidCardIndicator", "serviceDevelopmentField", "avsResponseCode",
				"authorizationSourceCode", "purchaseIdentifierFormat", "accountSelection", "installmentPaymentCount",
				"purchaseIdentifier", "cashback", "chipConditionCode", "posEnviroment" };
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5,5),
				new Range(6, 7), new Range(8, 16), new Range(17, 22), new Range(23, 23), new Range(24, 73),
				new Range(74, 75), new Range(76, 78), new Range(79, 79), new Range(80, 80), new Range(81, 95),
				new Range(96, 103), new Range(104, 115), new Range(116, 116), new Range(117, 117), new Range(118, 121),
				new Range(122, 123), new Range(124, 124), new Range(125, 125), new Range(126, 126), new Range(127, 127),
				new Range(128, 128), new Range(129, 129), new Range(130, 130), new Range(131, 132), new Range(133, 157),
				new Range(158, 166), new Range(167, 167), new Range(168, 168) };
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR01> tcr01FieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR01> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR01.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr02Tokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "installmentPaymentTotalAmount", "nationalNetCountryCode", "installmentPaymentIndicator",
				"numberOfInstallmentPayments", "installmentPaymentNumber", "installmentPaymentInterestAmount", "vatForInstallmentPaymentInterestAmount",
				"installmentPaymentRiskAmount", "vatForInstallmentPaymentRiskAmount", "irfIndicator", "settlementIndicator", "deferredCardholderBillingDate",
				"deferredSettlementDate", "tipAmount", "interchangeReimbursementFee", "vatNationalReimbursementFee", "promotionData",
				"reserved" };
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 16),
				new Range(17, 19), new Range(20, 21), new Range(22, 23), new Range(24, 25), new Range(26, 37),
				new Range(38, 47), new Range(48, 57), new Range(58, 67), new Range(68, 68), new Range(69, 69),
				new Range(70, 75), new Range(76, 81), new Range(82, 93), new Range(94, 103), new Range(104, 113),
				new Range(114, 133), new Range(134, 168) };
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR02> tcr02FieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR02> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR02.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr03AITokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "reserved1", "businessApplicationID", "businessFormatCode",
				"reserved2", "passengerName", "departureDate", "airportCode",
				"tripLeg1Information", "tripLeg2Information", "tripLeg3Information", "tripLeg4Information", "travelAgencyCode",
				"travelAgencyName", "restrictedTicketIndicator", "fareBasisCodeLeg1", "fareBasisCodeLeg2", "fareBasisCodeLeg3",
				"fareBasisCodeLeg4", "computerizedReservationSystem", "flightNumberLeg1", "flightNumberLeg2",
				"flightNumberLeg3", "flightNumberLeg4", "creditReasonIndicator", "ticketChangeIndicator",
				"reserved3" };
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 14),
				new Range(15, 16), new Range(17, 18), new Range(19, 26), new Range(27, 46), new Range(47, 52),
				new Range(53, 55), new Range(56, 62), new Range(63, 69), new Range(70, 76), new Range(77, 83),
				new Range(84, 91), new Range(92, 116), new Range(117, 117), new Range(118, 123), new Range(124, 129),
				new Range(130, 135), new Range(136, 141), new Range(142, 145), new Range(146, 150), new Range(151, 155),
				new Range(156, 160), new Range(161, 165), new Range(166, 166), new Range(167, 167), new Range(168, 168)};
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR03AI> tcr03AIFieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR03AI> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR03AI.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr03ANTokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "reserved1", "businessApplicationID", "businessFormatCode","ancillaryTicketDocumentNumber",
				"ancillaryServiceCategory1", "ancillaryServiceSubCategory1", "ancillaryServiceCategory2","ancillaryServiceSubCategory2",
				"ancillaryServiceCategory3", "ancillaryServiceSubCategory3", "ancillaryServiceCategory4", "ancillaryServiceSubCategory4",
				"passengerName","issuedInConnectionWithTicketNumber", "creditReasonIndicator", "reserved2"};
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 14),
				new Range(15, 16), new Range(17, 18), new Range(19, 33), new Range(34, 37), new Range(38, 41),
				new Range(42, 45), new Range(46, 49), new Range(50, 53), new Range(54, 57), new Range(58, 61),
				new Range(62, 65), new Range(66, 85), new Range(86, 100), new Range(101, 101), new Range(102, 168)};
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR03AN> tcr03ANFieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR03AN> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR03AN.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr03LGTokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "reserved1", "businessApplicationID", "businessFormatCode","reserved2",
				"lodgingNoShowIndicator", "lodgingExtraCharges", "reserved3","lodgingCheckInDate",
				"dailyRoomDate", "totalTax", "prepaidExpenses", "foodBeverageCharges",
				"folioCashAdvances","roomNights", "totalRoomTax", "reserved4"};
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 14),
				new Range(15, 16), new Range(17, 18), new Range(19, 26), new Range(27, 27), new Range(28, 33),
				new Range(34, 37), new Range(38, 43), new Range(44, 55), new Range(56, 67), new Range(68, 79),
				new Range(80, 91), new Range(92, 103), new Range(104, 105), new Range(106, 117), new Range(118, 168)};
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR03LG> tcr03LGFieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR03LG> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR03LG.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr03CATokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "reserved1", "businessApplicationID", "businessFormatCode", "daysRented",
				"reserved2", "carRentalNoShowIndicator", "carRentalExtraChanges","reserved3",
				"carRentalCheckOutDate", "dailyRentalRate", "weeklyRentalRate", "insuranceCharges",
				"fuelCharges","carClassCode", "oneWayDropOffCharges", "renterName", "reserved4"};
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 14),
				new Range(15, 16), new Range(17, 18), new Range(19, 20), new Range(21, 26), new Range(27, 27),
				new Range(28, 33), new Range(34, 37), new Range(38, 43), new Range(44, 55), new Range(56, 67),
				new Range(68, 79), new Range(80, 91), new Range(92, 93), new Range(94, 105), new Range(106, 145),
				new Range(146,168)
		};
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR03CA> tcr03CAFieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR03CA> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR03CA.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr03FLTokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "reserved1", "businessApplicationID", "businessFormatCode", "reserved2",
				"expandedFuelType", "typeOfPurchase", "fuelType", "unitOfMeasure", "quantity",
				"unitCost", "grossFuelPrice", "netFuelPrice", "grossNonFuelPrice", "netNonFuelPrice",
				"odometerReading", "vatTaxRate", "miscellaneousFuelTax", "productQualifier", "reserved3", "miscellaneousNonFuelTax",
				"serviceType", "miscellaneousFuelTaxExemptionStatus", "miscellaneousNonFuelTaxExemptionStatus", "reserved4" };
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 14),
				new Range(15, 16), new Range(17, 18), new Range(19, 22), new Range(23, 26), new Range(27, 27),
				new Range(28, 29), new Range(30, 30), new Range(31, 42), new Range(43, 54), new Range(55, 66),
				new Range(67, 78), new Range(79, 90), new Range(91, 102), new Range(103, 109), new Range(110, 113),
				new Range(114, 125), new Range(126, 131), new Range(132, 137), new Range(138, 149), new Range(150, 150),
				new Range(151, 151), new Range(152, 152), new Range(153, 168)};
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR03FL> tcr03FLFieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR03FL> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR03FL.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr03CRTokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "reserved", "fastFundsIndicator", "businessFormatCode", "businessApplicationID",
				"sourceOfFunds", "paymentReversalReasonCode", "senderReferenceNumber", "senderAccountNumber", "senderName",
				"senderAddress", "senderCity", "senderState", "senderCountry" };
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 15),
				new Range(16, 16), new Range(17, 18), new Range(19, 20), new Range(21, 21), new Range(22, 23),
				new Range(24, 39), new Range(40, 73), new Range(74, 103), new Range(104, 138), new Range(139, 163),
				new Range(164, 165), new Range(166, 168)};
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR03CR> tcr03CRFieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR03CR> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR03CR.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr04Tokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "accountNumber", "accountNumberExtension", "floorLimitIndicator",
				"crbExceptionFileIndicator", "PCASIndicator", "acquirerReferenceNumber", "acquirersBusinessID",
				"purchaseDate", "destinationAmount", "destinationCurrencyCode", "sourceAmount", "sourceCurrencyCode",
				"merchantName", "merchantCity", "merchantCountryCode", "merchantCategoryCode", "merchantZIPCode",
				"merchantStateProvinceCode", "requestedPaymentService", "numberOfPaymentForms", "usageCode",
				"reasonCode", "settlementFlag", "authorizationCharacteristicsIndicator", "authorizationCode",
				"POSTerminalCapability", "reserved", "cardholderIDMethod", "collectionOnlyFlag", "POSEntryMode",
				"centralProcessingDate", "reimbursementAttribute" };
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 20),
				new Range(21, 23), new Range(24, 24), new Range(25, 25), new Range(26, 26), new Range(27, 49),
				new Range(50, 57), new Range(58, 61), new Range(62, 73), new Range(74, 76), new Range(77, 88),
				new Range(89, 91), new Range(92, 116), new Range(117, 129), new Range(130, 132), new Range(133, 136),
				new Range(137, 141), new Range(142, 144), new Range(145, 145), new Range(146, 146), new Range(147, 147),
				new Range(148, 149), new Range(150, 150), new Range(151, 151), new Range(152, 157), new Range(158, 158),
				new Range(159, 159), new Range(160, 160), new Range(161, 161), new Range(162, 163), new Range(164, 167),
				new Range(168, 168) };
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR00> tcr04FieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR00> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR00.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr05Tokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "transactionIdentifier", "authorizedAmount", "authorizationCurrencyCode",
				"authorizationResponseCode", "validationCode", "excludedTransactionIdentifierReason", "reserved1",
				"reserved2", "multipleClearingSequenceNumber", "multipleClearingSequenceCount", "marketSpecificAuthorizationDataIndicator", "totalAuthorizedAmount",
				"informationIndicator", "merchantTelephoneNumber", "additionalDataIndicator", "merchantVolumeIndicator", "electronicCommerceGoodsIndicator", "merchantVerificationValue",
				"interchangeFeeAmount", "interchangeFeeSign", "sourceCurrencyToBaseCurrencyExchangeRate", "baseCurrencyToDestinationCurrencyExchangeRate",
				"optionalIssuerISAAmount", "productID", "programID", "dynamicCurrencyConversionIndicator",
				"accountTypeIdentification", "spendQualifiedIndicator", "panToken", "reserved3", "cvv2ResultCode" };
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 19),
				new Range(20, 31), new Range(32, 34), new Range(35, 36), new Range(37, 40), new Range(41, 41),
				new Range(42, 42), new Range(43, 44), new Range(45, 46), new Range(47, 48), new Range(49, 49),
				new Range(50, 61), new Range(62, 62), new Range(63, 76), new Range(77, 77), new Range(78, 79),
				new Range(80, 81), new Range(82, 91), new Range(92, 106), new Range(107, 107), new Range(108, 115),
				new Range(116, 123), new Range(124, 135), new Range(136, 137), new Range(138, 143), new Range(144, 144),
				new Range(145, 148), new Range(149, 149), new Range(150, 165), new Range(166, 167), new Range(168, 168)};
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR05> tcr05FieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR05> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR05.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr06Tokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "localTax", "localTaxIncluded", "nationalTax",
				"nationalTaxIncluded", "merchantVATRegistrationSingleBusinessReferenceNumber", "customerVATRegistrationNumber", "reserved1",
				"summaryCommodityCode", "otherTax", "messageIdentifier", "timeOfPurchase", "customerReferenceIdentifier",
				"nonFuelProductCode1", "nonFuelProductCode2", "nonFuelProductCode3", "nonFuelProductCode4", "nonFuelProductCode5",
				"nonFuelProductCode6", "nonFuelProductCode7", "nonFuelProductCode8", "merchantPostalCode",
				"reserved2" };
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 16),
				new Range(17, 17), new Range(18, 29), new Range(30, 30), new Range(31, 50), new Range(51, 63),
				new Range(64, 75), new Range(76, 79), new Range(80, 91), new Range(92, 106), new Range(107, 110),
				new Range(111, 127), new Range(128, 129), new Range(130, 131), new Range(132, 133), new Range(134, 135),
				new Range(136, 137), new Range(138, 139), new Range(140, 141), new Range(142, 143), new Range(144, 154),
				new Range(155, 168) };
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR06> tcr06FieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR06> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR06.class);
		return studentInformationMapper;
	}

	private LineTokenizer tcr07Tokenizer() {
		FixedLengthTokenizer rc = new FixedLengthTokenizer();
		String[] names = new String[] { "transactionCode", "transactionCodeQualifier",
				"transactionComponentSequenceNumber", "transactionType", "cardSequenceNumber", "terminalTransactionDate",
				"terminalCapabilityProfile", "terminalCountryCode", "terminalSerialNumber", "unpredictableNumber",
				"applicationTransactionCounter", "applicationInterchangeProfile", "cryptogram", "issuerApplicationDataByte2", "issuerApplicationDataByte3",
				"terminalVerificationResults", "issuerApplicationDataByte4To7", "cryptogramAmount", "issuerApplicationDataByte8", "issuerApplicationDataByte9To16",
				"issuerApplicationDataByte1", "issuerApplicationDataByte17", "issuerApplicationDataByte18To32", "formFactorIndicator",
				"issuerScript1Results" };
		rc.setNames(names);
		Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 6),
				new Range(7, 9), new Range(10, 15), new Range(16, 21), new Range(22, 24), new Range(25, 32),
				new Range(33, 40), new Range(41, 44), new Range(45, 48), new Range(49, 64), new Range(65, 66),
				new Range(67, 68), new Range(69, 78), new Range(79, 86), new Range(87, 98), new Range(99, 100),
				new Range(101, 116), new Range(117, 118), new Range(119, 120), new Range(121, 150), new Range(151, 158),
				new Range(159, 168) };
		rc.setColumns(ranges);
		return rc;
	}

	private FieldSetMapper<TCR07> tcr07FieldSetMapper() {
		BeanWrapperFieldSetMapper<TCR07> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(TCR07.class);
		return studentInformationMapper;
	}

	private PatternMatchingCompositeLineMapper<TCR> orderFileLineMapper(){
		PatternMatchingCompositeLineMapper lineMapper = new PatternMatchingCompositeLineMapper<>();

		Map<String, LineTokenizer> tokenizers = new HashMap<>();
		tokenizers.put("0?00*", tcr00Tokenizer());
		tokenizers.put("0?01*", tcr01Tokenizer());
		tokenizers.put("0?02*", tcr02Tokenizer());
		tokenizers.put("0?03????????????AI*", tcr03AITokenizer());
		tokenizers.put("0?03????????????AN*", tcr03ANTokenizer());
		tokenizers.put("0?03????????????LG*", tcr03LGTokenizer());
		tokenizers.put("0?03????????????CA*", tcr03CATokenizer());
		tokenizers.put("0?03????????????FL*", tcr03FLTokenizer());
		tokenizers.put("0?03????????????CR*", tcr03CRTokenizer());
		//tokenizers.put("0?04*", tcr04Tokenizer());
		tokenizers.put("0?05*", tcr05Tokenizer());
		tokenizers.put("0?06*", tcr06Tokenizer());
		tokenizers.put("0?07*", tcr07Tokenizer());

		lineMapper.setTokenizers(tokenizers);

		Map<String, FieldSetMapper> mappers = new HashMap<>();
		mappers.put("0?00*", tcr00FieldSetMapper());
		mappers.put("0?01*", tcr01FieldSetMapper());
		mappers.put("0?02*", tcr02FieldSetMapper());
		mappers.put("0?03????????????AI*", tcr03AIFieldSetMapper());
		mappers.put("0?03????????????AN*", tcr03ANFieldSetMapper());
		mappers.put("0?03????????????LG*", tcr03LGFieldSetMapper());
		mappers.put("0?03????????????CA*", tcr03CAFieldSetMapper());
		mappers.put("0?03????????????FL*", tcr03FLFieldSetMapper());
		mappers.put("0?03????????????CR*", tcr03CRFieldSetMapper());
		//mappers.put("0?04*", tcr04FieldSetMapper());
		mappers.put("0?05*", tcr05FieldSetMapper());
		mappers.put("0?06*", tcr06FieldSetMapper());
		mappers.put("0?07*", tcr07FieldSetMapper());

		lineMapper.setFieldSetMappers(mappers);

		return lineMapper;
	}

	@Bean
	public ItemWriter<Transaction> transactionItemWriter(){
		return new TransactionLoggingItemWriter();
	}

	@Bean
	public Step exampleJobStep() {
		return stepBuilderFactory
				.get("exampleJobStep")
				.<Transaction, Transaction>chunk(1)
				.reader(multiLineItemReader())
				.writer(transactionItemWriter())
				.build();
	}

	@Bean
	public Job exampleJob() {
		return jobBuilderFactory
				.get("exampleJob")
				.incrementer(new RunIdIncrementer())
				.flow(exampleJobStep())
				.end()
				.build();
	}
}
