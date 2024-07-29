package com.epam.employee.controller;

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

import com.epam.employee.entites.Employee;
import com.epam.employee.exception.EmployeeNotFoundException;
import com.epam.employee.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	@PostMapping("/employee")
	public ResponseEntity<Employee> save(@RequestBody Employee employee ){
		Employee emp = empService.save(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getByEmpId(@PathVariable ("id") Integer id) {
		Employee emp = empService.getByEmpId(id); 
		if(emp==null) {
			throw new EmployeeNotFoundException("Employee Not exit with given id "+id);
		}
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	@PutMapping("/employee")
	public ResponseEntity<Employee> update(@RequestBody Employee employee){
		Employee emp = empService.update(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Employee> deleteById(@PathVariable ("id") Integer id){
		empService.deleteById(id) ;
		return new ResponseEntity<>(HttpStatus.OK);
	}
}