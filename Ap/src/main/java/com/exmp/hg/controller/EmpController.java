package com.exmp.hg.controller;

import java.util.List;

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

import com.exmp.hg.entity.Employee;
import com.exmp.hg.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	@PostMapping("/save")
	public ResponseEntity<Employee> save (@RequestBody Employee emp){
		Employee save = empService.save(emp);
		return new ResponseEntity<Employee>(save, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> delete(@PathVariable("id") Integer id){
		empService.deleteById(id);
		return new ResponseEntity<Employee>(HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Employee> update(@RequestBody Employee emp){
		Employee res = empService.update(emp);
		return new ResponseEntity<Employee>(res, HttpStatus.CREATED);
	}
    @GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAll(){
    	List<Employee> getAll = empService.getAll();
		return new ResponseEntity<List<Employee>>(getAll,HttpStatus.OK);

	}

}
