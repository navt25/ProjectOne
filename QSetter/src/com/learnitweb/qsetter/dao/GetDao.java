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
import com.learnitweb.qsetter.request.Select_createCriteria;
import com.learnitweb.qsetter.request.Search;
import com.learnitweb.response.CustomResponse;
import com.util.DbConnection;

public class GetDao {
	public ArrayList<Search> srchController(@RequestBody Search x) {
		String id = x.getId();
		System.out.println(id);
		CustomResponse c;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String name = null;
		String gender = null;
		String dte = null;
		String interest = null;
		String details = null;
		ArrayList<Search> studentList = new ArrayList<>();
		try {
			con = DbConnection.getConnection();
			stmt = con.createStatement();
			String query = "select * from Student_details where id = '" + id + "'";
			System.out.println("query :" + query);
			rs = stmt.executeQuery(query);
			System.out.println("true 0");
			while (rs.next()) {
				System.out.println("true 1");
				name = rs.getString("name");
				gender = rs.getString("gender");
				dte = rs.getString("dte");
				interest = rs.getString("interest");
				details = rs.getString("details");
				System.out.println("true 2");
				id = rs.getString("ID");
				System.out.println("id" + id);
				Search search = new Search(name, gender, dte, interest, details, id);
				studentList.add(search);
				System.out.println(studentList.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return studentList;

	}

	public ArrayList Select_detail(Select_createCriteria b) {
		String s = b.getSelect_detail();
		System.out.println("q1" + b.getSelect_detail());
		System.out.println("inside controllertwo");
		ArrayList l1 = new ArrayList();
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

	public CustomResponse create(@RequestBody Select_createCriteria x) {
		System.out.println("inside controller5");
		String name = x.getName();
		String gender = x.getGender();
		String date = x.getDate();
		String select_detail = x.getSelect_detail();
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

		CustomResponse c;
		Connection con = null;
		Statement stmt = null;
		try {
			con = DbConnection.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT SEQ_USER.NEXTVAL FROM dual";
			ResultSet rs = stmt.executeQuery(sql);
			int id = 0;
			while (rs.next()) {
				id = rs.getInt("NEXTVAL");
			}
			String query = "insert into Student_details values('" + name + "','" + gender + "','" + date + "','" + sb
					+ "','" + select_detail + "','" + id + "')";
			System.out.println("query :" + query);
			stmt.executeUpdate(query);
			System.out.println("query complete");
			c = new CustomResponse("success", "result achieved");
			System.out.println(c.toString());
		} catch (Exception e) {
			e.printStackTrace();
			c = new CustomResponse("failure", "result not achieved");
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return c;
	}

	public ArrayList<Search> srchControllertwo(@RequestBody Search x) {
		String id = x.getId();
		System.out.println(id);
		String gender = x.getGender();
		CustomResponse c;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String dte = null;
		String interest = null;
		String details = null;
		ArrayList<Search> studentList = new ArrayList<>();
		try {
			String name = x.getName();
			con = DbConnection.getConnection();
			stmt = con.createStatement();
			String sql = "UPDATE Student_details SET name='" + name + "',gender='" + gender + "' WHERE id ='" + id
					+ "'";
			stmt.executeUpdate(sql);
			System.out.println(("queryupdate=" + sql));
			sql = "select * from Student_details where id = '" + id + "';";
			System.out.println(("queryupdatesql=" + sql));
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println("true 1");
				name = rs.getString("name");
				gender = rs.getString("gender");
				dte = rs.getString("dte");
				interest = rs.getString("interest");
				details = rs.getString("details");
				System.out.println("true 2");
				Search search = new Search(name, gender, dte, interest, details, id);
				studentList.add(search);
				System.out.println(studentList.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return studentList;

	}
}