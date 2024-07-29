package com.androjavatech4u.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController2 {
	@RequestMapping(value="/register1")
	public String registerMap(String name, String mobile, String email, String pass, Map<String,String>map){
		map.put("name", name);
		map.put("mobile", mobile);
		map.put("email", email);
		map.put("pass", pass);
		return "home.jsp";
	}
	@RequestMapping("/register2")
	public String registerModel(String name, String mobile , String email, String pass, Model model){
		model.addAttribute("name", name);
		model.addAttribute("mobile", mobile);
		model.addAttribute("email", email);
		model.addAttribute("pass", pass);
		return "home.jsp";
	}
	@RequestMapping("/register3")
	public String registerModelMap(String name, String mobile , String email, String pass, ModelMap model){
		model.addAttribute("name", name);
		model.addAttribute("mobile", mobile);
		model.addAttribute("email", email);
		model.addAttribute("pass", pass);
		return "home.jsp";
	}
	@RequestMapping("/register4")
	public ModelAndView registerModelView(String name, String mobile , String email, String pass, Map<String, String> map){
		map.put("name", name);
		map.put("mobile", mobile);
		map.put("email", email);
		map.put("pass", pass);
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		modelAndView.addObject(map);
		return modelAndView;
	}
}
