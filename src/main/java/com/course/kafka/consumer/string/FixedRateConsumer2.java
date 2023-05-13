package com.course.kafka.consumer.string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

//@Service
public class FixedRateConsumer2 {
    private static final Logger LOG = LoggerFactory.getLogger(FixedRateConsumer2.class);

    @KafkaListener(topics = "t-fixedrate-2")
    public void consume(String message){
        LOG.info("Consuming : {}", message);
    }
}
