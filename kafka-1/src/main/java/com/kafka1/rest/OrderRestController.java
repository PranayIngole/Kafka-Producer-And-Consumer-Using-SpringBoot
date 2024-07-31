package com.kafka1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka1.binding.Order;
import com.kafka1.service.OrderService;
@RestController
public class OrderRestController {
	@Autowired
	private OrderService service;
	
	@PostMapping("/order")
	public String createOrder(@RequestBody Order order) {
		String msg = service.addMsg(order);
		return msg;
	}
}
