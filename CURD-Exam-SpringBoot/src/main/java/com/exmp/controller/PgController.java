package com.exmp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.exmp.entity.PgBoys;
import com.exmp.service.PgService;

@Controller
public class PgController {

	@Autowired
	public PgService pgService;

	@PostMapping("/pgBoys")
	public ResponseEntity<PgBoys> save(@Valid @RequestBody PgBoys pgBoys ){
		PgBoys save = pgService.save(pgBoys);
		return new ResponseEntity<PgBoys>(save, HttpStatus.CREATED);
	}
	@DeleteMapping("/pgBoys/{id}")
	public ResponseEntity<PgBoys> delete(@PathVariable("id") Integer id){
		pgService.deleteById(id);
		return new ResponseEntity<PgBoys>(HttpStatus.OK);
	}
	@PutMapping("/pgBoys")
	public ResponseEntity<PgBoys> update(@Valid @RequestBody PgBoys pgBoys){
		 PgBoys updateAllDatails  = pgService.update(pgBoys);
		return new ResponseEntity<PgBoys>(updateAllDatails, HttpStatus.OK);
	}
	@GetMapping("/pgBoys/{id}")
	public ResponseEntity<PgBoys> getById(@PathVariable ("id") Integer id){
          PgBoys getPgBoysById  = pgService.getById(id);
		return new ResponseEntity<PgBoys>(getPgBoysById, HttpStatus.OK);
		
	}
	
}