package com.workload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workload.model.Order;
import com.workload.repository.OrderRepository;

@Service
public class WorkloadServiceImp implements WorkloadService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order save(Order order) {
		Order orderdetail = new Order(order.getOrderNumber(), order.getOrderDescription(), order.getQuantiy(), order.getStatus());
		if(orderdetail!=null) {
		orderRepository.save(orderdetail);
		
		}
		orderdetail.setOrderNumber(order.getOrderNumber());
		orderdetail.setOrderDescription(order.getOrderDescription());
		orderdetail.setQuantiy(order.getQuantiy());
		orderdetail.setStatus("cancelled");
		
		return orderdetail;
	}

}
