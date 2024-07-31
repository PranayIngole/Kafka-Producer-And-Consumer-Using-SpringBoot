package com.kafka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.kafka2.constants.AppConstants;

@SpringBootApplication
public class Kafka2Application {

	public static void main(String[] args) {
		SpringApplication.run(Kafka2Application.class, args);
	}
	
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = "kafka2")
	public void subscribeMsg(String order) {
		System.out.println("Msg Recived From Kafka *** :: ");
		System.out.println(order);
	}
}
