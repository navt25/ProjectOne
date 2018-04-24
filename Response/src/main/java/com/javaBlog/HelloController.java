package com.javaBlog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {
	
	@RequestMapping(value="/InputForm.html", method = RequestMethod.GET)
	public ModelAndView getInputForm() {
		ModelAndView model = new ModelAndView("InputForm");
	
		return model;
	}
	
	@RequestMapping(value="/InputSuccess.html", method = RequestMethod.POST)
	public ModelAndView getInputSuccess(@RequestParam("comments") String comment, @RequestParam("name")String Name) {
		ModelAndView model = new ModelAndView("InputSuccess");
		model.addObject("msg","details submitted:comment" +comment+ ", NAME:" + Name);
	
		return model;
	}
	
	
	}

