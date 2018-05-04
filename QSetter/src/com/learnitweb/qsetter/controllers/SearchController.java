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

import com.learnitweb.qsetter.request.SearchCriteria;
import com.learnitweb.qsetter.request.Srchid;
import com.learnitweb.response.CustomResponse;
import com.util.DbConnection;

@Controller
public class SearchController {
	
	@ResponseBody
	
	@RequestMapping("/welcomesearch")
	public CustomResponse helloWorld2(@RequestBody Srchid x) {
		System.out.println("value 1 of search");
		ModelAndView model = new ModelAndView("searchTag");
		model.addObject("searchMessage", "helloworld of id.");
		System.out.println("inside controller of rollno");
		int idofStudent = x.getIdentity();
		System.out.println(idofStudent);
     	CustomResponse c;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String nameOfsearch = null;
		try {
			con = DbConnection.getConnection();
			stmt = con.createStatement();
			String query= "select * from Electrical where id = '"+idofStudent+"'";
			System.out.println("query :" + query);	
			System.out.println("value 2 of search");
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				     nameOfsearch = rs.getString("name");
				     System.out.println("value 3 of search");
	                System.out.println(nameOfsearch);
	                System.out.println("value 4 of search");
			}
			
			 c = new CustomResponse("success", "result achieved");
			 System.out.println(c.toString());
		} 
		catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
			c = new CustomResponse("failure", "result not achieved");
		}
		// System.out.println("query complete 2 "+model);
		return c;
	}

}
