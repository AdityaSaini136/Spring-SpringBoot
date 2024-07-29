package com.exm.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Student_Details")
public class Student {

	@Id
	@Column(name="Student_Id")
	private int studentId;

	@Column(name="Student_Name")
	private String name;

	@Column(name="Student_City")
	private String city;
}