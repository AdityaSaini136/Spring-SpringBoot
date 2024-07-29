package com.exmp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name="PgBoysdetail")
@JsonIgnoreProperties
public class PgBoys {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotEmpty(message = "Please Enter a vaild Name..!")
	private String name;
	
	@Email(message = "Your mail is not correct formation..!!")
	private String email;
	
	@NotEmpty(message = "RanrAggriment details must be update..!")
	private String rantAggriment;
	
	@NotEmpty(message = "Please Enter a vaild Address..!")
	private String address; 
	
	@Size(min = 10,max = 10, message = "Number is not vaild..!!")
	private String conNumber;
	
	@NotEmpty(message = "Please Varify your Room Number..!")
	private String roomNumber;
	
	@NotEmpty(message = "Please Enter a vaild Name..!")
	private String gender;

}
