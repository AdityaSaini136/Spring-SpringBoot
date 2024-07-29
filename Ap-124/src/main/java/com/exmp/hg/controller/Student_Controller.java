package com.exmp.hg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exmp.hg.entity.Students;
import com.exmp.hg.service.Student_Service;

@RestController
public class Student_Controller {

	@Autowired
	private Student_Service student_Service;

	@PostMapping("/students")
	public ResponseEntity<Students> save(@RequestBody  Students students){
		Students save = student_Service.save(students);
		return new ResponseEntity<Students>(save, HttpStatus.CREATED);
	}
	@GetMapping("/students/{id}")
	public ResponseEntity<Students> getById(@PathVariable ("id") Integer id){
		Students stu = student_Service.getStudent(id);
		return new ResponseEntity<Students>(stu,HttpStatus.OK);
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<Students> updateById(@PathVariable("id") Students students){
		Students updateStudent = student_Service.updateStudent(students);
		return new ResponseEntity<Students>(updateStudent, HttpStatus.OK);
	}

}
