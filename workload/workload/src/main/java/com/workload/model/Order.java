package com.workload.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order {



	private String orderNumber;
	private String orderDescription;
	private int Quantiy;
	private String status;
	private Product product;
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
