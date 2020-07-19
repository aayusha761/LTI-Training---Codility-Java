package com.lti.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			//Step 1 : Loading the JDBC Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Establishing connection with database
			String url="jdbc:oracle:thin:@localhost:1521:ORCLCDB";
			String user="dummy";
			String password="dummy";
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection successful");
			
			
			//For Crud operation, there are two ways:
			//1. Statement
			//2. PreparedStatement
			
			//For ex: if we want to call stored procedure or function
			//1. Callable Statement
			
			Statement st = conn.createStatement();
			st.execute("INSERT INTO STUDENT VALUES (1, 'John', '10-07-1998')");
			
			//The problem with Statement object 
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO student VALUES(?,?,?)");
			pst.setInt(1, 222); //replacing ? with actual value
			pst.setString(2, "Smith");
			pst.setString(3, "10-JUN-1995");
			pst.executeUpdate();

		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
