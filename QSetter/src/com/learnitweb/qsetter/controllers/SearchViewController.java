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
import com.learnitweb.qsetter.request.SearchCriteria;
import com.learnitweb.response.CustomResponse;
import com.util.DbConnection;

@Controller
public class SearchViewController {
	GetDao svc =new GetDao();
	@ResponseBody
	@RequestMapping("/welcomenew")
	public void helloWorld(@RequestBody SearchCriteria b) {
		ModelAndView model = new ModelAndView("default");
		model.addObject("welcomeMessage", "helloworld");
		svc.srchViewController(b);
	}
	@ResponseBody
	@RequestMapping("/welcomenew2")
	public void helloWorld2(@RequestBody SearchCriteria x) {
		// SearchCriteria gender;
		ModelAndView model = new ModelAndView("success");
		model.addObject("welcomeMessage", "helloworld");
		svc.srchViewController2(x);

}}
