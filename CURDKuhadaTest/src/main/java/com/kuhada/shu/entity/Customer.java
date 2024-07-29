package com.kuhada.shu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Custo")
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer custId;
	private String custName;
	private String custEmail;
	private String custAddress;
	

}
