package com.learnitweb.qsetter.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learnitweb.qsetter.request.SearchCriteria;

@Controller

public class HelloController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("default");
		model.addObject("welcomeMessage", "helloworld");
		System.out.println("inside controller");
		return model;
	}		
}


