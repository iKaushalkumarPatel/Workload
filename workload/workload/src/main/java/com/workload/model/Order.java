package com.workload.model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString 
@Table(name = "Orders")
@Entity
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String description;
	@OneToMany(fetch = FetchType.EAGER ,
            cascade = CascadeType.ALL)  
	private List<OrderItem> orderItems; 
	
	@Column(name="orderNumber", nullable = false)
	private String orderNumber;
    
	@Column(name="orderDescription", nullable = false)
	private String orderDescription;
	 
	
	@Column(name="status", nullable = false)
	private String status;
	@OneToOne(fetch = FetchType.EAGER ,
            cascade = CascadeType.ALL)   
	private Customer customer;

}
