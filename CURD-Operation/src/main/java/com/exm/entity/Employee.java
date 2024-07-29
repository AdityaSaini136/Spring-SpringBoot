package com.exm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Employee")
@JsonIgnoreProperties
public class Employee {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private Integer id;
	
	@Column(name="Name")
	@JsonProperty("name")
	private String name;

	@Column(name="CompanyName")
	@JsonProperty("comName")
	private String comName;
	
	@Column(name="Salary")
	@JsonProperty("salary")
	private double salary;
	
	@Email
	@Column(name="Email")
	@JsonProperty("email")
	private String email;
	
	@Column(name="phone")
	@JsonProperty("phone")
	private String phone;
	
}