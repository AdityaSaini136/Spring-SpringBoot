package com.epam.employee.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="EpamEmp_list")
@JsonIgnoreProperties
public class Employee {
	@Id
	@GeneratedValue
	@JsonProperty
	private Integer id;
	
	@Column(name="empName")
	@JsonProperty("EmpName")
	private String empName;
	
	@Column(name="postName")
	@JsonProperty("PostName")
	private String postName;
	
	@Column(name="empSalary")
	@JsonProperty("EmpSalary")
	private double  empSalary;

	public Employee() {
		
	}
	
	public Employee(Integer id, String empName, String postName, double empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.postName = postName;
		this.empSalary = empSalary;
	}
}