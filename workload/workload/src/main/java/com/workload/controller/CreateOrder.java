package com.workload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workload.model.Order;
import com.workload.repository.OrderRepository;
import com.workload.service.WorkloadService;

@RestController
public class CreateOrder {

	@Autowired
	private WorkloadService workloadService;

	@PostMapping("/createorder")
	public Order createOrder(@RequestBody Order order) {
		return workloadService.save(order);
	}

	
	
}
