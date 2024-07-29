package com.exmp.hg.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmp.hg.entity.Students;
import com.exmp.hg.repo.Student_Repo;
import com.exmp.hg.service.Student_Service;
@Service
public class Student_ServiceImpl implements Student_Service{

	@Autowired
	private Student_Repo student_Repo; 
	
	@Override
	public Students save(Students students) {
		return student_Repo.save(students);
	}

	@Override
	public Students getStudent(Integer id) {
		return student_Repo.findById(id).orElse(null);
	}

	@Override
	public Students updateStudent(Students students) {
		return student_Repo.save(students);
	}

//	@Override
//	public void updateById(Students students) {
//		return student_Repo.save(students);
//	}

	
	
}
