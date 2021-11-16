package com.accenture.configuration;

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FixedLengthTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.UrlResource;

import com.accenture.entity.Log;
import com.accenture.entity.Transaction;
import com.accenture.service.ILogService;
import com.amazonaws.services.s3.AmazonS3;

@Configuration
public class JobConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(JobConfig.class);

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
	public ItemReader<Transaction> itemReader() throws MalformedURLException {

		LineMapper<Transaction> transactionLineMapper = createTransactionLineMapper();

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

		return new FlatFileItemReaderBuilder<Transaction>().name("dataReader").resource(resource)
				.lineMapper(transactionLineMapper).strict(false).build();
	}

	private LineMapper<Transaction> createTransactionLineMapper() {
		DefaultLineMapper<Transaction> TransactionLineMapper = new DefaultLineMapper<>();

		LineTokenizer TransactionLineTokenizer = tradeRecordTokenizer();
		TransactionLineMapper.setLineTokenizer(TransactionLineTokenizer);

		FieldSetMapper<Transaction> TransactionInformationMapper = createTransactionInformationMapper();
		TransactionLineMapper.setFieldSetMapper(TransactionInformationMapper);

		return TransactionLineMapper;
	}

	private LineTokenizer tradeRecordTokenizer() {
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

	private FieldSetMapper<Transaction> createTransactionInformationMapper() {
		BeanWrapperFieldSetMapper<Transaction> studentInformationMapper = new BeanWrapperFieldSetMapper<>();
		studentInformationMapper.setTargetType(Transaction.class);
		return studentInformationMapper;
	}

	@Bean
	public ItemWriter<Transaction> itemWriter() {
		return new LoggingItemWriter();
	}

	/**
	 * Creates a bean that represents the only step of our batch job.
	 * 
	 * @param reader
	 * @param writer
	 * @param stepBuilderFactory
	 * @return
	 */
	@Bean
	public Step exampleJobStep(ItemReader<Transaction> reader, ItemWriter<Transaction> writer,
			StepBuilderFactory stepBuilderFactory) {
		return stepBuilderFactory.get("exampleJobStep").<Transaction, Transaction>chunk(1).reader(reader).writer(writer)
				.build();
	}

	/**
	 * Creates a bean that represents our example batch job.
	 * 
	 * @param exampleJobStep
	 * @param jobBuilderFactory
	 * @return
	 */
	@Bean
	public Job exampleJob(Step exampleJobStep, JobBuilderFactory jobBuilderFactory) {
		return jobBuilderFactory.get("exampleJob").incrementer(new RunIdIncrementer()).flow(exampleJobStep).end()
				.build();
	}

}
