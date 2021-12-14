package com.accenture.configuration;

import com.accenture.entity.Transaction;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;


import java.util.List;
import java.util.Properties;

public class TransactionLoggingItemWriter implements ItemWriter<Transaction> {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionLoggingItemWriter.class);

    @Override
    public void write(List<? extends Transaction> items) throws Exception {
        sendMessage(items.get(0).toString());
    }

    private void sendMessage(String message) {
        LOGGER.info("************* Se envia mensaje: {}", message);

        Properties props = new Properties();
        props.put("bootstrap.servers", "kafka-broker:9092");
        props.put("acks", "0");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        try (Producer<String, String> producer = new KafkaProducer<>(props);) {
            producer.send(new ProducerRecord<>("channel01", "key", message));
            producer.flush();
        }
    }
}
