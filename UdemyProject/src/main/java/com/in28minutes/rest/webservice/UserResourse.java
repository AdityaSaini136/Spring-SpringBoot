package com.in28minutes.rest.webservice;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservice.execption.UserNotFoundException;
@RestController
public class UserResourse {
	
	@Autowired 
	private UserDaoService service;
	
	@GetMapping(path="/users")
	public List<User> retrieveAllUser(){
		return service.findAll();
	}
	@GetMapping(path="/users/{id}")
	public User retrieveUser(@PathVariable int id ){
	User user = service.findOne(id);
	if(user==null) {
		throw new UserNotFoundException("Given id user are not found id:>> "+id);
	}
	return user;
	
	}
	@PostMapping("/users")
	public void  createUser(@Valid  @RequestBody User user) {
		User savedUser = service.save(user);
	}
    @DeleteMapping("/users/{id}")
    public void deletreById(@PathVariable int id) {
    	User deleteBYId = service.deleteBYId(id);
    	if(deleteBYId==null) {
    		throw new UserNotFoundException(" Sorry ..! This Id are not here id:>> "+id);
    	}
    	
    }
	
}
