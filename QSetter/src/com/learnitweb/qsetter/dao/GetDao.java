package com.learnitweb.qsetter.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.learnitweb.qsetter.controllers.SearchController;
import com.learnitweb.qsetter.request.SearchCriteria;
import com.learnitweb.qsetter.request.Search;
import com.learnitweb.response.CustomResponse;
import com.util.DbConnection;

public class GetDao {
	public CustomResponse srchController(Search x) {
		String name=x.getName();
		String gender=x.getGender();
		String dte=x.getDate();
		String interest=x.getInterest();
		String details=x.getDetails();
		String id=x.getIdentity();
     	CustomResponse c;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String nameOfsearch = null;
		try {
			con = DbConnection.getConnection();
			stmt = con.createStatement();
			 List l1 = new ArrayList();
			    if(name!=null)
			    l1.add(name);
			    if(gender!=null)
			    l1.add("gender");
			    if(dte!=null)
			    l1.add("dte");
			    if(interest!=null)
			    l1.add("interest");
			    if(details!=null)
			    l1.add("details");
			    if(id!=null)
			    l1.add("id");
StringBuffer query2 =new StringBuffer("SELECT name, gender, dte, interest,details,id FROM Student_details ");
if(name != null || gender != null || dte != null || interest!= null || details!= null || 
					id != null) {
				query2 = query2.append("where");}
			    for(int i=0;i<l1.size();i++) {
			    	if(l1.get(i)!=null) {
			    		query2.append("'"+l1.get(i)+"' like '%"+l1.get(i)+"%'and");	
			    	}
			    	
			    	if(name!=null)
					    l1.add(name);
					    if(gender!=null)
					    l1.add(gender);
					    if(dte!=null)
					    l1.add(dte);
					    if(interest!=null)
					    l1.add(interest);
					    if(details!=null)
					    l1.add(details);
					    if(id!=null)
					    l1.add(id);   	
  if(l1.get(i)!=null) {
		query2.append("'"+l1.get(i)+"' like '%"+l1.get(i)+"%'and");	
}		    		    	
			    }
			    String query3 = query2.toString();
		    	/*if(query3.endsWith("and")) {
		    		query3 = query3.substring(query3.);
		    		//query3 = query3.substring(0, query3.length() - 3);	
		    	}*/
			System.out.println(query3);
			rs = stmt.executeQuery(query3);
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
			e.printStackTrace();
			c = new CustomResponse("failure", "result not achieved");
		}
		finally{
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }
		      try{
		         if(con!=null)
		        	con.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		return c;	
	}
	public ArrayList srchViewController(SearchCriteria b) {                                   
		String s = b.getSearch();
		System.out.println(b.getSearch()); 	
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
	public CustomResponse srchViewController2(@RequestBody SearchCriteria x) {
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
			con = DbConnection.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT SEQ_USER.NEXTVAL FROM dual";
			ResultSet rs = stmt.executeQuery(sql);
			int id=0;
			while (rs.next()) {
				 id = rs.getInt("NEXTVAL");}
			 String query = "insert into Student_details values('" + name + "','" + gender +
			"','" + date + "','" + sb + "','"+ details + "','"+ id + "')";
			 System.out.println("query :" + query);
			 stmt.executeUpdate(query);
			System.out.println("query complete");
			c = new CustomResponse("success", "result achieved");
			System.out.println(c.toString());
			
			  rs.close();
		      stmt.close();
		      con.close();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
			c = new CustomResponse("failure", "result not achieved");
		}
		finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(con!=null)
		        	con.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		// System.out.println("query complete 2 "+model);
		return c;
	}
	
   
}
