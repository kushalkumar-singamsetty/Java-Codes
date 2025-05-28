package com.jdbc.into;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

public class Preparest {
	String url = "jdbc:mysql://localhost:3306/jdbc";
	String user = "root";
	String password = "Rupesh@123";
	Connection con;
	Statement st;
	ResultSet res;
	PreparedStatement st1;
	PreparedStatement st2;
	String query1 = "UPDATE `employeedetails` SET `name` = 'Kushal' ";
	String query2 = "UPDATE `employeedetails` SET `name` = 'kumar' ";
	String query3 = "UPDATE  `employeedetails` SET `name` = 'Kushal' ";
	String query4 = "UPDATE `employeedetails` SET `name` = 'cahrlie' WHERE `id` = 3";
	String queryp = "UPDATE `employeedetails` SET `name` = ? WHERE `id` = ?";
	String queryd = "DELETE FROM `employeedetails` WHERE `id` = ? ";
	String queryi = "INSERT INTO employeedetails VALUES(?,?,?,?,?)";
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Preparest p1 = new Preparest();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			p1.connection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} finally {
			p1.errors();
		}
	}

	public void connection() throws SQLException {
		con = DriverManager.getConnection(url, user, password);
		con.setAutoCommit(false);
//		addbatchs();
//		System.out.println("-------------------------");
//		preparest();
//		System.out.println("-------------------------");
//		delete();
		Allstandars.display(con, st, res);
		insert();
		Allstandars.display(con, st, res);
		rollback();
		Allstandars.display(con, st, res);
	}

	void addbatchs() throws SQLException {
		st = con.createStatement();
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		st.executeBatch();
		Allstandars.display(con, st, null);
	}

	void preparest() throws SQLException {
		st1 = con.prepareStatement(queryp);
		int count = checkQuestion(queryp);
		for (int i = 1; i <= count; i++) {
			Object temp = inputs(i);
			if (temp instanceof String)
				st1.setString(i, (String) temp);
			if (temp instanceof Integer)
				st1.setInt(i, (int) temp);
		}
		st1.executeUpdate();
		Allstandars.display(con, st, null);
	}

	void errors() {
		try {
			if (res != null)
				res.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	Object inputs(int i) {
		System.out.println("Enter the " + i + "input");
		return s.nextLine();
	}

	int checkQuestion(String query) {
		int count = 0;
		for (int i = 0; i < query.length(); i++)
			if (query.charAt(i) == '?')
				count++;
		return count;
	}

	void delete() throws SQLException {
		st2 = con.prepareStatement(queryd);
		int count = checkQuestion(queryd);
		for (int i = 1; i <= count; i++) {
			st2.setString(i, (String) inputs(i));
		}
		int ii = st2.executeUpdate();
		Allstandars.display(con, st, res);
	}

	void insert() throws SQLException {
		st2 = con.prepareStatement(queryi);
		int count = checkQuestion(queryi);
		for (int i = 1; i <= count; i++) {
			st2.setString(i, (String) inputs(i));
		}
		int ii = st2.executeUpdate();
		Allstandars.display(con, st, res);
	}

	void rollback() throws SQLException
	{
		if(con != null)
		{
			con.rollback();	
		}
		
	}
}
