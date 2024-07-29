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
import org.springframework.web.bind.annotation.RestController;

import com.exm.entites.Product;
import com.exm.execption.ProductNotFoundExecption;
import com.exm.service.Product_Service;

@RestController
public class Product_Controller {
	
	@Autowired
	private Product_Service product_Service;
	
	@PostMapping("/product")
	public ResponseEntity<Product> save( @RequestBody Product product){
		Product save = product_Service.save(product);
		return new ResponseEntity<Product>(save, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<Product> deleteById(@PathVariable("id") Integer id){
		     product_Service.delete(id);
		 return new ResponseEntity<Product>(HttpStatus.OK);
	}
	
	@PutMapping("/product")
	public ResponseEntity<Product> update(@RequestBody Product product){
		 Product update = product_Service.update(product);
		return new ResponseEntity<Product>(update, HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getById(@PathVariable ("id") Integer id){
		Product byId = product_Service.getById(id);
		if(byId==null) {
			throw new ProductNotFoundExecption("Product Not Exit with given Id :>> "+byId);
		}
		return new ResponseEntity<Product>(byId, HttpStatus.OK);
	}
}
