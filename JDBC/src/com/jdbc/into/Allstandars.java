package com.jdbc.into;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Allstandars {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "Rupesh@123";
		Connection mycon = null;
		Statement st = null;
		ResultSet res = null;
		try {
			mycon = DriverManager.getConnection(url, user, password);
			display(mycon, st, res);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mycon != null && st != null && res != null)
				errors(mycon, st, res);
		}
	}

	public static void display(Connection mycon, Statement st, ResultSet res) throws SQLException {
		st = mycon.createStatement();
		String query = "SELECT * FROM employeedetails";
		res = st.executeQuery(query);
		System.out.printf("------------------------------------------------------------------------------\n");
		System.out.printf("| %-5s | %-15s | %-25s | %-10s | %-8s |\n", "id", "name", "email", "dept", "salary");
		System.out.printf("------------------------------------------------------------------------------\n");
		while (res.next()) {
			int id = res.getInt("id");
			String name = res.getString("name");
			String email = res.getString("email");
			String dept = res.getString("dept");
			int salary = res.getInt("salary");
			System.out.printf("| %-5d | %-15s | %-25s | %-10s | %-8d |\n", id, name, email, dept, salary);
		}
		System.out.printf("------------------------------------------------------------------------------\n");
	}

	private static void errors(Connection mycon, Statement st, ResultSet res) {
		try {
			res.close();
			st.close();
			mycon.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
