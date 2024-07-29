package com.exmp.hg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
//@Data
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue
	public Integer id;
	public String name;
	public String comName;
	public String address;
	public String city;
	public int contactNo;
	

}
