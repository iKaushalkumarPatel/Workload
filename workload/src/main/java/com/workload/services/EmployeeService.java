package com.workload.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.workload.model.Employee;
import com.workload.repository.EmployeeRepository;


 
@Service
public class EmployeeService {
     
    @Autowired
    EmployeeRepository repository;
	private String lastName;
     
    public List<Employee> getAllEmployees()
    {
        List<Employee> employeeList = repository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<Employee>();
        }
    }
     
    public Employee getEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<Employee> employee = repository.findById(id);
         
        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
     
    public Employee createOrUpdateEmployee(Employee entity) throws RecordNotFoundException
    {
        Optional<Employee> employee = repository.findById(entity.getEmployeeId());
         
        if(employee.isPresent())
        {
            Employee newEntity = employee.get();
            Long employeeId = null;
			newEntity.setEmployeeId(employeeId);
            String firstName = null;
			newEntity.setFirstName(firstName);
            newEntity.setLastName(lastName);
            String email = null;
			newEntity.setEmail(email);
            String contact = null;
			newEntity.setContact(contact);

            newEntity = repository.save(newEntity);
             
            return newEntity;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
    }
     
    public void deleteEmployeeById(Long employeeId) throws RecordNotFoundException
    {
        Optional<Employee> employee = repository.findById(employeeId);
         
        if(employee.isPresent())
        {
            repository.deleteById(employeeId);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
}