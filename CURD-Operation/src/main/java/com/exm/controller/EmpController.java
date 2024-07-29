package com.exm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exm.entity.Employee;
import com.exm.service.EmployeeService;

@RestController
public class EmpController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable ("id") Integer id){
		 Employee byId = employeeService.getById(id);
		 return new ResponseEntity<Employee>(byId,HttpStatus.OK);
	}
	@PostMapping("/employee")
	public ResponseEntity<Employee> save(@RequestBody Employee employee){
		Employee save = employeeService.save(employee);
		return new ResponseEntity<Employee>(save, HttpStatus.CREATED);
	}
	@PutMapping("/employee")
	public ResponseEntity<Employee> update(@RequestBody Employee employee){
		Employee update = employeeService.update(employee);
		return new ResponseEntity<Employee>(update, HttpStatus.OK);
	}
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Employee> deleteById(@PathVariable ("id") Integer id){
		 employeeService.deleteById(id);
		return new ResponseEntity<Employee>( HttpStatus.OK);
	}
}