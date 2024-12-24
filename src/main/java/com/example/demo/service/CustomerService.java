package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;

@Service
public class CustomerService {
	
	String message;
	
	@KafkaListener(topics = "${topic.name}", groupId = "my-group")
	public void listener(@Payload Customer customer) {
		message = customer.toString(); 		
	}
	
	public String getMessage() {
		return message;
	}

}
