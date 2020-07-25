package com.workload.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.workload.model.Order;


@Component("WorkloadService")
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}