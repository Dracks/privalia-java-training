package com.privalia.springkafka;

import com.privalia.springkafka.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication

@EnableKafka
public class SpringKafkaApplication implements CommandLineRunner{

	@Autowired
	private Sender sender;

	@Value("${kafka.topic.helloworld}")
	private String topic;

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sender.send(topic, "Hello Spring Kafka!");
	}
}
