package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.udemy.backendninja.model.person;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.Servlet.ModelAndView;

@Controller
@RequestMapping("/HelloWorld")
public class HelloWorldController {
		
		@GetMapping("/helloWorld")
		public String helloWorld(Model model) {
			model.addAttribute("person",new person("Jon",23));
			return "HelloWorld";
		}
	
}
