package com.learnitweb.qsetter.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
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
import com.learnitweb.response.CustomResponse;
import com.util.DbConnection;

@Controller
public class HelloController2 {
	@ResponseBody
	@RequestMapping("/welcomenew")
	public ArrayList helloWorld(@RequestBody SearchCriteria b) {
		String s = b.getSearch();
		System.out.println(b.getSearch());
		ModelAndView model = new ModelAndView("default");
		model.addObject("welcomeMessage", "helloworld");
		System.out.println("inside controllertwo");

		ArrayList l1 = new ArrayList();
		// System.out.println("al");
		if (s.equals("sub")) {
			l1.add("Math");
			l1.add("English");
			l1.add("Science");
			System.out.println(l1);
		} else if (s.equals("lang")) {
			l1.add("Gujarati");
			l1.add("Marathi");
			l1.add("Tamil");
			System.out.println(l1);
		}
		return l1;

	}

	@ResponseBody
	@RequestMapping("/welcomenew2")
	public CustomResponse helloWorld2(@RequestBody SearchCriteria x) {
		// SearchCriteria gender;

		ModelAndView model = new ModelAndView("success");
		model.addObject("welcomeMessage", "helloworld");
		System.out.println("inside controller5");
		String name = x.getName();
		String gender = x.getGender();
		String date = x.getDate();
		String details = x.getDetails();

		// ArrayList additionalDetails=x.getAdditionalDetails();
		ArrayList interest = x.getInterest();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < interest.size(); i++) {
			sb.append(interest.get(i));
			if (i != interest.size() - 1) {
				sb.append(",");
			}
		}
		System.out.println(sb);

		System.out.println(x.getName());
		System.out.println(x.getGender());
		System.out.println(x.getDate());

		System.out.println(x.getInterest());
		System.out.println(interest);

		System.out.println(details);
		// System.out.println(additionalDetails);
		CustomResponse c;
		Connection con = null;
		Statement stmt = null;
		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// con =
			// DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","navneet");
			con = DbConnection.getConnection();
			stmt = con.createStatement();
		 //stmt.executeQuery("SELECT SEQ_USER.NEXTVAL FROM dual");
String query = "insert into Electrical values('" + name + "','" + gender + "','" + date + "','" + sb + "','"+ details +  "','"+ 120 +  "')";
			System.out.println("query :" + query);                                    /*,'"+ "SEQ_USER.NEXTVAL" + "' insert into class values('ftre',SEQ_USER.NEXTVAL);*/
			stmt.executeUpdate(query);
			System.out.println("query complete");
			c = new CustomResponse("success", "result achieved");
			System.out.println(c.toString());
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
			c = new CustomResponse("failure", "result not achieved");
		}
		// System.out.println("query complete 2 "+model);
		return c;
	}

}
