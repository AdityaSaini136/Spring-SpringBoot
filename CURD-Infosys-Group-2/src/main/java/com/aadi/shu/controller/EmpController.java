package com.aadi.shu.controller;

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

import com.aadi.shu.entity.Employee;
import com.aadi.shu.execption.EmployeeNotFoundException;
import com.aadi.shu.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	EmpService empService;

	@PostMapping("/employee")
	public ResponseEntity<Employee> save( @RequestBody Employee emp){
		Employee save  = empService.save(emp);
		return new ResponseEntity<Employee>(save, HttpStatus.CREATED);
	}

	@PutMapping("/employee")
	public ResponseEntity<Employee> update(@RequestBody Employee emp){
		Employee update  =  empService.update(emp);
		return new ResponseEntity<Employee> (update, HttpStatus.OK);
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getbyId(@PathVariable ("id") Integer id){
		Employee getEmp	 = empService.getById(id);
		if(getEmp==null) {
			throw new EmployeeNotFoundException("Employee Not exit with given id "+id);
		}
		return new ResponseEntity<Employee>(getEmp, HttpStatus.OK);
	}
 
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<Employee> deleteById(@PathVariable ("id") Integer id){
		empService.deleteById(id);
		
		return new ResponseEntity<Employee>(HttpStatus.OK);

	}







}
