package com.prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepared_St_std {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentJDBC","root","Vivek@123");
		PreparedStatement ps= con.prepareStatement("select * from student where id=?");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		ps.setInt(1, id);
//		ResultSet rs = ps.getResultSet();
//		ResultSet rs = ps.executeQuery();
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
		}
		ps.close();
		con.close();
		
	}
}
