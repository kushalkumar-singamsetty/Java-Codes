package com.jdbc.into;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class program1 {
	public static void main(String[] args){
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "Rupesh@123";
		try {
			Connection mycon = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally
		{
			System.out.println("hey");
		}
		System.out.println("Hello its connected");
	}
}
