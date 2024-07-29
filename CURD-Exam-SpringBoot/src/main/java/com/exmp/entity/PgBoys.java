package com.exmp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@JsonIgnoreProperties
public class PgBoys {

	@Id
	@GeneratedValue
	@JsonProperty
	private Integer id;

	@JsonProperty
	@NotNull
	@NotEmpty
	private String name;

	@JsonProperty
	private String address;

	@JsonProperty
	@Size(max=10,min=10, message="Phone Number Must be Ten digits")
	private String conNumber;

	@JsonProperty
	@NotEmpty
	private String roomNumber;

	@JsonProperty
	@Email(message = "Email Address is not Correct..!")
	private String email; 

	@JsonProperty
	@NotEmpty  
	private String rentAggriment; 

}
