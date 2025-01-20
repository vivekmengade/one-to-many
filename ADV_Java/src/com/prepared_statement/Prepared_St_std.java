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
		PreparedStatement ps = con.prepareStatement("update student set name=? where id = ?");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name updated of student");
		String name = sc.nextLine();
		System.out.println("enter id of student");
		int id = sc.nextInt();
		ps.setString(1, name);
		ps.setInt(2, id);
		int rwupdate = ps.executeUpdate();
		System.out.println(rwupdate);
		PreparedStatement ps2= con.prepareStatement("select * from student where id=?");
		ps2.setInt(1,id);
//		ResultSet rs = ps.getResultSet();
		ResultSet rs = ps2.executeQuery();
//		ResultSet rs = ps.executeUpdate();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
		}
		ps.close();
		ps2.close();
		con.close();
		sc.close();
	}
}
