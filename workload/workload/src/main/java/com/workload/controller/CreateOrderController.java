package com.workload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workload.model.Order;
import com.workload.repository.OrderRepository;


@RestController
public class CreateOrderController {

	@Autowired
	private OrderRepository orderRepository;

	@PostMapping("/createorder")
	public Order createOrder(@RequestBody Order order) {
		return orderRepository.save(order);
	}

	
	
}
