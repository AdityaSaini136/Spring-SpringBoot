package com.androjavatech4u.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController3 {
	@RequestMapping("/userReg")
	public String userRegister(@RequestParam("name")  String firstName, @RequestParam("mobile") String mobileNum , 
			@RequestParam("email") String emailId, @RequestParam("pass") String password , Model model) {
		model.addAttribute("Name", firstName);
		model.addAttribute("Mobile", mobileNum);
		model.addAttribute("EmailId", emailId);
		model.addAttribute("Password", password);
		return "home.jsp";
	}
	@GetMapping("/getUser/{id}/{name}")
	public String getUser(@PathVariable int id,@PathVariable String name, String email,  Model model ) {
		model.addAttribute("email", id);
		model.addAttribute("name", name);
		return "home.jsp";
		
	}
}
