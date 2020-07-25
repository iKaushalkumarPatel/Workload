package com.workload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workload.exception.OrderNotFoundException;
import com.workload.model.Order;
import com.workload.repository.OrderRepository;
import com.workload.service.WorkloadService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CreateOrderController {

	@Autowired
	private WorkloadService workloadService;
	Logger logger = LoggerFactory.getLogger(CreateOrderController.class);

	@PostMapping("/createorder")
	public Order createOrder(@RequestBody Order order) {
		if (order==null)
		      throw new OrderNotFoundException("order-" + order);
		return workloadService.save(order);
	}

	
	
}
