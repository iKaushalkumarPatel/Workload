package com.workload.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString 
@Table(name = "Customers")
@Entity
public class Customer {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
}
