package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentJDBC {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {

//		step: load and register driver class
		System.out.println("Step-1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		step: create connection
		System.out.println("Step-2");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentJDBC","root","Vivek@123");
		System.out.println("con = "+con);
		System.out.println("END");
		System.out.println("Connection sucsseful");
	}
	
}
