package com.androjavatech4u.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.androjavatech4u.entites.User;

@Controller
@RestController
public class UserController4 {
	@GetMapping("/doreg")
	public String doRegister(@RequestParam String name,
			                 @RequestParam String mobile,
			                 @RequestParam String email,
			                 @RequestParam String pass , Model model ){
//      model.addAttribute("name", name);
//      model.addAttribute("mobile", mobile);
//      model.addAttribute("email", email);
//      model.addAttribute("pass", pass);
      User user = new User();
      user.setName(name);
      user.setMobile(mobile);
      user.setEmail(email);
      user.setPass(pass);
      model.addAttribute("user", user);
		return "home.jsp";
	}
	@GetMapping("/userReg")
	public String userReg(@RequestBody User user, Model model) {
		model.addAttribute("msg", "Welcome Message");
		return"home.jsp";
	}
	
	
	
}
