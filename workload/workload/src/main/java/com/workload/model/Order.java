package com.workload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order {


    @Id
    @GeneratedValue
	@Column(name="orderNumber", nullable = false)
	private String orderNumber;
    
	@Column(name="orderDescription", nullable = false)
	private String orderDescription;
	
	@Column(name="Quantiy", nullable = false)
	private int Quantiy;
	
	@Column(name="status", nullable = false)
	private String status;
	
	@Column(name="product", nullable = false)
	private Product product;
	
	@Column(name="customer", nullable = false)
	private Customer customer;
	
	public Order(String orderNumber, String orderDescription, int quantiy, String status) {
		super();
		this.orderNumber = orderNumber;
		this.orderDescription = orderDescription;
		Quantiy = quantiy;
		this.status = status;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public int getQuantiy() {
		return Quantiy;
	}
	public void setQuantiy(int quantiy) {
		Quantiy = quantiy;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	


}
