package com.infy.group.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "InfoEmp")
@JsonIgnoreProperties
public class Employee {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private Integer Id;
	
	@Column(name="Name")
	@JsonProperty("name")
	private String name;
	
	@Column(name="Email")
	@JsonProperty("email")
	private String email;
	
	@Column(name="number")
	@JsonProperty("number")
	private String number;
	
	@Column(name="salary")
	@JsonProperty("salary")
    private double salary;  
	
}