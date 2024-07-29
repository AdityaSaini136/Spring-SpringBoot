package com.exmp.hg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Student_Details")
@Data
public class Students {
	
	@Id
	private Integer studentId;
	private String studentName;
	private String studentAddress;
	private String studentSchool;
	

	

}
