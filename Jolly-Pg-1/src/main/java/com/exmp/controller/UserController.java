package com.exmp.controller;

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

import com.exmp.entity.User;
import com.exmp.service.UserService;

@RestController
public class UserController {

	@Autowired 
	UserService userService;

	@PostMapping("/users")
	public ResponseEntity<User> save(@RequestBody User user){
		User user1  = userService.save(user);
		return new ResponseEntity<User>(user1, HttpStatus.CREATED);
	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<User> getById(@PathVariable("userId") Integer id){
		User user = userService.getById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity <List<User>> getAll (){
		userService.getAll();
		return new ResponseEntity<>(this.userService.getAll(),HttpStatus.OK);
	}
	Integer userId = null;
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<User> deleteById(@PathVariable("userId") Integer id) throws Exception{
		userService.deleteById(id);
		if(id==userId) {
			throw new Exception("Given Id data is deleted..!");
		}
		return new ResponseEntity<User>( HttpStatus.OK);
	}

	@PutMapping("/users")
	public ResponseEntity<User> updateById(@RequestBody User user ){
		User user1  = userService.updateById(user);
		return new ResponseEntity<User>(user1, HttpStatus.OK);
	}
}
