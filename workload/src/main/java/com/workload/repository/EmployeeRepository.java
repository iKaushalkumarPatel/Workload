package com.workload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workload.model.Employee;
@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {
 
}

/*
import java.util.List;
import java.util.Optional;

import com.workload.model.Employee;

public class EmployeeRepository {

	public Optional<Employee> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public Employee save(Employee newEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
*/