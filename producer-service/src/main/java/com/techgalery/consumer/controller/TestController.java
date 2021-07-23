package com.techgalery.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value="/test_api")
public class TestController {

    @Autowired
    private KafkaTemplate<Object, Object> kafkaTemplate;

    @PostMapping
    public String testPost(@RequestBody Map req) {
        kafkaTemplate.send("TEST_TOPIC", req.get("dataKey"), req.get("dataBody"));
        return "testResponse";
    }
}
