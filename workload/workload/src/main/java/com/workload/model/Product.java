package com.workload.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString 
@Table(name = "Products")
@Entity
public class Product {
	
	@Id
	private Long id; 
	private String productCode;
	private String productDescription;
	private boolean topping1;
	private boolean topping2;
	private boolean topping3;
	private double price;
	
 
}
