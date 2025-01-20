package com.Select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectQuery {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentJDBC","root","Vivek@123");
		Statement st= con.createStatement();
		String Query = "select * from Student";
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getDouble(3));
		}
		Statement st2= con.createStatement();
		String Query2 = "select name from student where id = 101";
		ResultSet rs2 = st2.executeQuery(Query2);
		while(rs2.next()) {
			System.out.println(rs2.getString("name"));
		}
		
		
		st.close();
		con.close();
	}
}
