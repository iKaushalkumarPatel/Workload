package com.workload.controller;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workload.model.Employee;
import com.workload.services.EmployeeService;
import com.workload.services.RecordNotFoundException;
 
@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    @Autowired
    EmployeeService service;
 
    @GetMapping
    public Response<List<Employee>> getAllEmployees() {
        List<Employee> list = service.getAllEmployees();
 
        return new Response<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    @GetMapping("/{employeeId}")
    public Response<Employee> getEmployeeById(@PathVariable("employeeId") Long id) throws RecordNotFoundException {
        Employee entity = service.getEmployeeById(id);
 
        return new Response<Employee>(entity, new HttpHeaders(), HttpStatus.OK);
    }
 
    @PostMapping
    public Response<Employee> createOrUpdateEmployee(Employee employee)
                                                    throws RecordNotFoundException {
        Employee updated = service.createOrUpdateEmployee(employee);
        return new Response<Employee>(updated, new HttpHeaders(), HttpStatus.OK);
    }
 
    @DeleteMapping("/{employeeId}")
    public HttpStatus deleteEmployeeById(@PathVariable("employeeId") Long id) throws RecordNotFoundException {
        service.deleteEmployeeById(id);
        return HttpStatus.FORBIDDEN;
    }
 
}