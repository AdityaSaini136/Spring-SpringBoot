package com.exmp.hg.service;

import com.exmp.hg.entity.Students;

public interface Student_Service {
	
	
	public Students save(Students students);

	public Students getStudent(Integer id);
	
	public Students updateStudent(Students students);


}
