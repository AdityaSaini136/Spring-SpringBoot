package com.kuhada.tech.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kuhada.tech.entity.Employee;
import com.kuhada.tech.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	@PostMapping("/employees")
	public ResponseEntity<Employee> save(@Valid @RequestBody Employee employee){
		Employee emp =empService.save(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}

	@PutMapping("/employees")
	public ResponseEntity<Employee> update(@Valid @RequestBody Employee employee){
		Employee emp =empService.update(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getById(@PathVariable ("id") Integer id){
		Employee emp =empService.getById(id);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteById(@PathVariable ("id") Integer id){
		empService.deleteById(id);
		return new ResponseEntity<Employee>( HttpStatus.OK);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> findAll(){
		List<Employee> emp= empService.findAll();
		return new ResponseEntity<List<Employee>>(emp, HttpStatus.OK);
		
	}
	
}
