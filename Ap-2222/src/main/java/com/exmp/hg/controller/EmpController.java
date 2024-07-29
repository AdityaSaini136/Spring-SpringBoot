package com.exmp.hg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exmp.hg.entity.Employee;
import com.exmp.hg.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	public EmpService empService;
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> save(@RequestBody Employee employee){
		Employee saveEmp  =  empService.save(employee);
		return new ResponseEntity<Employee>(saveEmp, HttpStatus.CREATED);
	}
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> update(@RequestBody Integer id){
		 empService.updateById(id);
		return new ResponseEntity<Employee>(HttpStatus.CREATED);
	}
	
	
	

}
