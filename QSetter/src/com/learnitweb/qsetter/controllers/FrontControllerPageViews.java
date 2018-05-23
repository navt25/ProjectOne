package com.learnitweb.qsetter.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.learnitweb.qsetter.request.SearchCriteria;

@Controller

public class FrontControllerPageViews {
	
	@RequestMapping("/")//   /welcome
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("HomePage");//default
		model.addObject("welcomeMessage", "");
		System.out.println("inside controller");
		return model;
	}
	/*@RequestMapping("/default")//   /welcome
	public ModelAndView helloCountry() {
		ModelAndView model = new ModelAndView("default");//default
		model.addObject("welcomeMessageCountry", "hellocountry");
		System.out.println("inside controller country");
		return model;
	}
	@RequestMapping("/searchTag")//   /welcome
	public ModelAndView helloState() {
		ModelAndView model = new ModelAndView("searchTag");//default
		model.addObject("welcomeMessageState", "hellostate");
		System.out.println("inside controller state");
		return model;
	}*/
	@RequestMapping("/default")
	public String contactinfo() {
		System.out.println("you are in create");
	    return "default";
	  }
	@RequestMapping("/searchTag")
	public String searchinfo() {
		System.out.println("you are in search");
	    return "searchTag";	
	}



}


