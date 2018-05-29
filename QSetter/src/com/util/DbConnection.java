package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

public static Connection  getConnection() throws SQLException{
		
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",Constants.DB_USERNAME,Constants.DB_PASSWORD);
			/*Class.forName("oracle.jdbc.driver.ConstantFields.driver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ConstantFields.db_username","ConstantFields.db_password");*/
			return con;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;
	}
}

