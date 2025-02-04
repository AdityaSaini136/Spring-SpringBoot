package com.exmp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name="userdata")
@JsonIgnoreProperties
public class User {

	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@JsonProperty
	private String name;
	@JsonProperty
	private String fName;
	@JsonProperty
	private String email;
	
	
}
