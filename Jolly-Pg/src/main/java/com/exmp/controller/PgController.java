package com.exmp.controller;

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

import com.exmp.entity.PgBoys;
import com.exmp.exception.DataNotFoundException;
import com.exmp.service.PgService;

@RestController
public class PgController {

	@Autowired PgService pgService;

	@PostMapping("/pgBoys")
	public ResponseEntity<PgBoys> save(@Valid @RequestBody PgBoys pgBoys){
		PgBoys save =  pgService.save(pgBoys);
		return new ResponseEntity<PgBoys>(save,HttpStatus.CREATED);
	}
	@GetMapping("/pgBoys/{id}")
	public ResponseEntity<PgBoys> getById(@PathVariable("id") Integer id) throws DataNotFoundException{
		PgBoys getData  = pgService.findById(id);
		if(getData==null) {
			throw new DataNotFoundException("Not Data to given ID....!! :>> "+id);
		}
		return new ResponseEntity<PgBoys>(getData, HttpStatus.OK);
	}
	@GetMapping("/pgBoys-list")
	public ResponseEntity<List<PgBoys>> getAll(){
		//List<PgBoys> getAll =  pgService.findAll(pgBoys);
		return new ResponseEntity<>(this.pgService.findAll(), HttpStatus.OK);
	}
	@PutMapping("/pgBoys")
	public ResponseEntity<PgBoys> updateById(@Valid @RequestBody PgBoys pgBoys){
		PgBoys updateData = pgService.updateById(pgBoys);
		return new ResponseEntity<PgBoys>(updateData, HttpStatus.OK);
	}
	@DeleteMapping("/pgBoys/{id}")
	public ResponseEntity<PgBoys> deleteById(@PathVariable("id") Integer id){
		pgService.deleteById(id);		
		return new ResponseEntity<PgBoys>(HttpStatus.OK);
	}
}