package com.kafka1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka1.binding.Order;
import com.kafka1.constants.AppConstants;

@Service
public class OrderService {
	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
	
	public String addMsg(Order order) {
		// publish msg to kafka topic
		kafkaTemplate.send(AppConstants.TOPIC_NAME, order);
		
		return "Msg Published To Kafka Topic";
	}
}
