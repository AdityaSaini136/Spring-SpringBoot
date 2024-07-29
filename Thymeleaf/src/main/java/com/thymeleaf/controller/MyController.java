package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thymeleaf.entites.Login;

@Controller
public class MyController {
	@RequestMapping("/demo")
	public String demo(@ModelAttribute Login login, Model model ) {
		model.addAttribute("login", login);
		// model.addAttribute("name", login.getPass());
		return"home";
	}
	@RequestMapping("/demo1")
	public String demo1() {
		return"home2";
	}

}
