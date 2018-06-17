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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.learnitweb.qsetter.request.Select_createCriteria;
import com.learnitweb.qsetter.dao.GetDao;
import com.learnitweb.qsetter.request.Search;
import com.learnitweb.response.CustomResponse;
import com.util.DbConnection;

@Controller
public class SearchController {
	GetDao sc =new GetDao();
	@ResponseBody
	@RequestMapping(value="/welcomesearch")//"/welcomesearch"
	public ArrayList<Search> helloWorld2(@RequestBody Search x) {
		System.out.println("value 1 of search");
		ModelAndView model = new ModelAndView("searchTag");
		model.addObject("searchMessage", "helloworld of id.");
		System.out.println("inside controller of search");
		ArrayList<Search> p = sc.srchController(x);
		return p;
	}     
	
	@ResponseBody
	@RequestMapping("/Update")//   
	public ModelAndView poststate( Search x ,@RequestParam("id") String id , @RequestParam("name") String name,
			@RequestParam("gender") String gender , @RequestParam("date") String date,
			@RequestParam("interest") String interest , @RequestParam("details") String details){
		ModelAndView model = new ModelAndView("Update");//default
		
		System.out.println("id:"+id+", name:"+name+", gender:"+gender+", date:"+date+", interest:"+interest+", details:"+details);
		
		Search search = new Search(name, gender, date, interest, details, id);
		System.out.println(search);
		model.addObject("data", search );
		System.out.println("inside controller update");
		System.out.println("gendereeee="+gender);
		System.out.println("nameeee="+name);
		return model;
	}
	
}




          