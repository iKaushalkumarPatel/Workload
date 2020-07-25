package com.workload.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workload.model.Order;
import com.workload.model.Product;
import com.workload.repository.OrderRepository;

import io.swagger.annotations.Api;
@RestController
@RequestMapping("/api")
@Api(value = "WorkLoad Management System")
public class OrderController { 

		@Autowired
		private OrderRepository orderRepository;

		@PostMapping("/order")
		public ResponseEntity<String> addOrder(@RequestBody Order order) {
			HttpHeaders responseHeaders = getRestHeader();
			try {
				orderRepository.save(order);
			} catch (Exception e) { 
				e.printStackTrace();
				return new ResponseEntity<String>("", responseHeaders, HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<String>("", responseHeaders, HttpStatus.CREATED);
		}

		private HttpHeaders getRestHeader() {
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.add("Content-Type", "application/json");
			return responseHeaders;
		}
	 
}
