package com.jdbc.into;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Program6 {
	public static void main(String[] args){
		String url = "jdbc:mysql://localhost:3306/banking";
		String username = "root";
		String password = "Rupesh@123";
		int accountno=0;
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "SELECT * from customerdetails where accid = 10002";
			Statement s = con.createStatement();
			ResultSet res = s.executeQuery(query);
			System.out.println(res);
			while(res.next())
			{
				accountno = res.getInt(1);
				System.out.println(res.getString("fullname"));
				System.out.println(res.getBigDecimal("phonenumber"));
				System.out.println(res.getString("Dateofbirth"));
				System.out.println(res.getString("balance"));
				System.out.println(res.getString("email"));
				System.out.println(res.getString("password"));
			}
			System.out.println(accountno);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally
		{
			
		}
	}
}
