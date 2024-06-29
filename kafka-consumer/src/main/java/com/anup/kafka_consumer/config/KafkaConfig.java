package com.anup.kafka_consumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstants.MESSAGE_UPDATED, groupId = AppConstants.GROUP_ID)
    public void updatedMessage(String message) {
        System.out.println(message);
    }


}
