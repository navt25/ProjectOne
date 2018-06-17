package com.learnitweb.qsetter.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.learnitweb.qsetter.dao.GetDao;
import com.learnitweb.qsetter.request.Select_createCriteria;
import com.learnitweb.response.CustomResponse;
import com.util.DbConnection;

@Controller
public class Select_detail_CreateController {
	GetDao gd1 = new GetDao();

	@ResponseBody
	@RequestMapping("/welcomenew")
	public ArrayList Select_detail(@RequestBody Select_createCriteria b) {
		ArrayList l1 = new ArrayList();
		ModelAndView model = new ModelAndView("create");
		model.addObject("welcomeMessage", "helloworld");
		ArrayList p = gd1.Select_detail(b);
		return p;
	}

	@ResponseBody
	@RequestMapping("/welcomenew2")
	public CustomResponse createMethod(@RequestBody Select_createCriteria x) {
		System.out.println("create method");
		ModelAndView model = new ModelAndView("success");
		model.addObject("welcomeMessage", "helloworld");
		CustomResponse c = gd1.create(x);
		return c;
	}
}
