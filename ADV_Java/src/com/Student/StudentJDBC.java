package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentJDBC {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {

//		step 1: load and register driver class
		System.out.println("Step-1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		step 2: create connection
		System.out.println("Step-2");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentJDBC","root","Vivek@123");
		System.out.println("con = "+con);
		System.out.println("Connection sucsseful");
		
//		step 3: Create statement
		System.out.println("Step-3");
		System.out.println("create Statement");
		Statement st = con.createStatement();
		
//		step-4: execute query
		System.out.println("Step-4");
		String query = "insert into Student(id, name, percentage) values(103,'Amruta',93)";
		String UpdateQuery ="update Student set id=105 where name = 'Amruta'";
		String DeleteQuery = "delete from student where name = 'Amruta'";
		st.executeUpdate(UpdateQuery);
		st.executeUpdate(DeleteQuery);
//		int row = st.executeUpdate(query);
//		System.out.println(row+"affected rows...");
		
		
		//step-5: Closing Statement
		st.close();
		
		System.out.println("closed");
	}
	
}
