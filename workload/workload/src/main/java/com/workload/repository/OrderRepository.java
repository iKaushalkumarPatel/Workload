package com.workload.repository;


import org.springframework.data.repository.CrudRepository;

import com.workload.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}