package com.exmp.hg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;

@Entity
@Data
public class Employee {

	@Id 
	private Integer id;
	private String name;
	private String address;
	
}
