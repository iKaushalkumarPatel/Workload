package com.workload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.workload.repository.OrderRepository;

@SpringBootApplication
public class WorkloadApplication {
	@Autowired
	OrderRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(WorkloadApplication.class, args);
	}

}
