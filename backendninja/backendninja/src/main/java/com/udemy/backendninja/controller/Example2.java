package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2 {

	public static final String EXAMPLE2_VIEW = "example2";
	private static final String EXAMPLE_VIEW = null;
	
	//localhost:8080/example2/request1?nm=JON
	//localhost:8080/example2/request1?nm=MIKEL
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm")String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		return mav;
		
		
		
	}
}
