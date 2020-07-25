package com.workload.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
 
import com.workload.model.Order;

public interface EmployeeRepository extends CrudRepository<Order, Long>{ 
	
}