package com.kuhada.tech.entity;
//import javax.persistence.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 3, message = "First name should have atleast 3 characters " )
	//@NotNull(message = "Name is mandatory")
	private String firstName;
	private String lastName; 
	
	@NotNull(message = "Address is mandatory")
	private String address;
	
	@Email
	@NotBlank
	private String email;
}
