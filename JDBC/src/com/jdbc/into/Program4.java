package com.jdbc.into;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
public class Program4 {
	
	public static String url = "jdbc:mysql://localhost:3306/banking";
	public static String user = "root";
	public static String password = "Rupesh@123";
	static Connection con;
	static Statement st;
	static ResultSet res;
	public static void main(String[] args){
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection();
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			errors();
		}
	}
	private static void connection() throws SQLException {
		con = DriverManager.getConnection(url,user,password);
		st = con.createStatement();
		String query = getQuery();
		ResultSet res = st.executeQuery(query);
		while(res.next())
		{
			System.out.println(res.getInt("accountno"));
		}
	}
	public static void errors()
	{
		try
		{
			if(res != null) res.close();
			if(st != null) st.close();
			if(con != null) con.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public static String getQuery()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the QUERY");
		return s.nextLine();
	}
}
