package com.anup.kafka_stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.config.StreamsBuilderFactoryBean;

import java.util.Properties;

@SpringBootApplication
public class KafkaStreamApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaStreamApplication.class, args);

		final StreamsBuilderFactoryBean builderFactoryBean = new StreamsBuilderFactoryBean();
		builderFactoryBean.setKafkaStreamsCustomizer("streams-plaintext-input").to("streams-plaintext-output");

		final StreamsBuilder builder = new StreamsBuilder();

		builder.stream("streams-plaintext-input").to("streams-pipe-output");
	}

}
