package com.accenture.configuration;

import java.net.MalformedURLException;

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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.UrlResource;

import com.accenture.entity.Transaction;

@Configuration
public class JobConfig {
	
	@Bean
    public ItemReader<Transaction> itemReader() {
        LineMapper<Transaction> transactionLineMapper = createTransactionLineMapper();
        
        UrlResource resource = null;
		try {
			resource = new UrlResource("https://transac.s3.amazonaws.com/transactions.txt");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//renonbrar archivo
		//mover archivo a directorio "procesados"
        
    	return new FlatFileItemReaderBuilder<Transaction>()
    			.name("dataReader")
    			.resource(resource)
    			.lineMapper(transactionLineMapper)
    			.build();
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
        String[] names = new String[] { "transactionCode", "transactionCodeQualifier", "transactionComponentSequenceNumber", "accountNumber" };
        rc.setNames(names);
        Range[] ranges = new Range[] { new Range(1, 2), new Range(3, 3), new Range(4, 4), new Range(5, 20) };
        rc.setColumns(ranges);
        return rc;
    }
/*    
    private LineTokenizer createTransactionLineTokenizer() {
        DelimitedLineTokenizer studentLineTokenizer = new DelimitedLineTokenizer();
        studentLineTokenizer.setDelimiter(";");
        studentLineTokenizer.setNames(new String[]{"name", "emailAddress", "purchasedPackage"});
        return studentLineTokenizer;
    }
*/
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
     * @param reader
     * @param writer
     * @param stepBuilderFactory
     * @return
     */
    @Bean
    public Step exampleJobStep(ItemReader<Transaction> reader,
                               ItemWriter<Transaction> writer,
                               StepBuilderFactory stepBuilderFactory) {
        return stepBuilderFactory.get("exampleJobStep")
                .<Transaction, Transaction>chunk(1)
                .reader(reader)
                .writer(writer)
                .build();
    }

    /**
     * Creates a bean that represents our example batch job.
     * @param exampleJobStep
     * @param jobBuilderFactory
     * @return
     */
    @Bean
    public Job exampleJob(Step exampleJobStep,
                          JobBuilderFactory jobBuilderFactory) {
        return jobBuilderFactory.get("exampleJob")
                .incrementer(new RunIdIncrementer())
                .flow(exampleJobStep)
                .end()
                .build();
    }

}
