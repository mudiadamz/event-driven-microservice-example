package com.techgalery.consumer.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestKafkaListener {
    private final Logger log = LoggerFactory.getLogger(TestKafkaListener.class);

    @KafkaListener(topics = "TEST_TOPIC", groupId = "FE_Dev")
    public void listenTestTopic( String data ) {
        log.info("Consumed : "+ data);
    }
}
