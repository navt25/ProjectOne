package com.learnitweb.qsetter.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.learnitweb.qsetter.request.Select_createCriteria;

@Controller

public class FrontControllerPageViews {
	
	@RequestMapping("/")//   /welcome
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("HomePage");//default
		model.addObject("welcomeMessage", "");
		System.out.println("inside controller");
		return model;
	}
	@RequestMapping("/create")
	public String contactinfo() {
		System.out.println("you are in create");
	    return "create";
	  }
	@RequestMapping("/searchTag")
	public String searchinfo() {
		System.out.println("you are in search");
	    return "searchTag";	
	}
	
	
}


