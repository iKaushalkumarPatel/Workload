package com.workload.model;

public class Customer {

	private String customerId;
	private String firstName;
	private String fastName;
	private String email;
	private String phone;
	
	
	public Customer(String customerId, String firstName, String fastName, String email, String phone) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.fastName = fastName;
		this.email = email;
		this.phone = phone;
		
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFastName() {
		return fastName;
	}
	public void setFastName(String fastName) {
		this.fastName = fastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
