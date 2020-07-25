package com.workload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
    
	@Column(name="firstName")	
    private String firstName;
	
	@Column(name="lastName")
    private String lastName;
	
	@Column(name="email", nullable=false, length=200)
    private String email;
	
	@Column(name="contact")
	private String contact;
	
    public Long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


    

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + 
                ", lastName=" + lastName + ", email=" + email   + ", contact=" + contact+"]";
    }
}