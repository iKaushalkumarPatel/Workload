package com.workload.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.workload.model.Order;



@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
	@Query
	Order findByUserUniqueId(String OrderId);

}