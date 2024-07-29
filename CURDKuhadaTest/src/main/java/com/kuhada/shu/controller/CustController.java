package com.kuhada.shu.controller;

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

import com.kuhada.shu.entity.Customer;
import com.kuhada.shu.service.CustService;

@RestController
public class CustController {
	
	@Autowired
	private CustService custService;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> save(@RequestBody Customer customer){
		Customer cust = custService.save(customer);
		return new ResponseEntity<Customer>(cust, HttpStatus.CREATED);
	}
	
	@PutMapping("/customer")
	public ResponseEntity<Customer> update(@RequestBody Customer customer){
		Customer cust = custService.update(customer);
		return new ResponseEntity<Customer>(cust, HttpStatus.CREATED);	
	}
	
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<Customer> delete(@PathVariable ("id") Integer id){
		custService.delete(id);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> get(@PathVariable ("id") Integer id){
		Customer cust = custService.get(id);
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
		
		
	}
	
}
