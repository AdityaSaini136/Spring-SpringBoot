package com.exm.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Product_List")
@JsonIgnoreProperties
public class Product {

	@Id
	@GeneratedValue
	//@JsonProperty("productid")
	private Integer productid;

	//@JsonProperty("productName")
	private String productName;

	//@JsonProperty("productComName")
	private String productComName;

	//@JsonProperty("productCost")
	private int productCost;
}