package com.example.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.User;
import com.example.jpa.repository.UserRepository;
import com.example.jpa.service.ServiceImpl;
import com.example.jpa.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
//For Data save Purpose if you are send the Data In HTML page so this method are use....... 	
    //@PostMapping("/user")
	public void doregister(@ModelAttribute User user) {
    	userService.save(user);
	}
//For Data save Purpose if you are send the Data In Postman so this method are also use.......    
    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody User user){
    	User save = userService.save(user);
		return new ResponseEntity<User>(save, HttpStatus.CREATED);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id ){
    	User user = userService.getById(id);
    	return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    @PutMapping("/user")
    public ResponseEntity<User> update(@RequestBody User user){
    	User update = userService.update(user);
    	return  new ResponseEntity<User> (update, HttpStatus.OK);
    }
    @DeleteMapping("/user")
    public ResponseEntity<User> delete(@RequestBody User user){
    	userService.delete(user);
		return new ResponseEntity<User>(HttpStatus.OK);
    }
}