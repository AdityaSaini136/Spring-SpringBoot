package SpringMVC.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Aditya saini");
		model.addAttribute("id", 122);
		List<String> friends = new ArrayList<String>();
		friends.add("Shubham");
		friends.add("Sandeep");
		friends.add("Kaka");
		friends.add("Rohan");
		model.addAttribute("f", friends);
		System.out.println("This Is Home Url.......");
		return "index";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("Help Controller Page is go...");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("a", "Aditya saini");
		modelAndView.addObject("b", "Basant");
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("date", now);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
