package com.learnitweb.qsetter.controllers;

import java.util.ArrayList;/*new*/
import java.util.List;
import java.util.ListIterator;
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

import com.learnitweb.qsetter.request.SearchCriteria;
import com.learnitweb.qsetter.dao.GetDao;
import com.learnitweb.qsetter.request.Search;
import com.learnitweb.response.CustomResponse;
import com.util.DbConnection;

@Controller
public class SearchController {
	@ResponseBody
	@RequestMapping("/welcomesearch")
	public void helloWorld2(@RequestBody Search x) {
		System.out.println("value 1 of search");
		ModelAndView model = new ModelAndView("searchTag");
		model.addObject("searchMessage", "helloworld of id.");
		System.out.println("inside controller of search");
		GetDao sc =new GetDao();
		sc.srchController(x);
		 
	}
}
