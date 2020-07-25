package com.workload.repository;

import org.springframework.data.repository.CrudRepository;
import com.workload.model.*;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
