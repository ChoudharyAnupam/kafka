package com.anup.kafka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@KafkaListener(topics =  "PRODUCE_MSG", groupId = "group-id")
	void consumeMessage(String message) {
		System.out.println(message);
	}

}
