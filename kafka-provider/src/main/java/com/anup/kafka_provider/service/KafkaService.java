package com.anup.kafka_provider.service;

import com.anup.kafka_provider.config.KafkaConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean produceMessage(String message) {
        this.kafkaTemplate.send(KafkaConstant.PRODUCE_MSG, message);
        return true;
    }
}
