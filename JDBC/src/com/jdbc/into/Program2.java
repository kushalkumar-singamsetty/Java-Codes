package com.jdbc.into;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.TreeMap;
import java.lang.NullPointerException;
public class Program2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sys";
		String username = "root";
		String password = "Rupesh@123";
		TreeMap<Integer,String> lhs = new TreeMap<Integer,String>(); 
		Connection con=null;
		Statement st = null;
		ResultSet res = null;
		try
		{
			con = DriverManager.getConnection(url,username,password);
			 st = con.createStatement();
			String query = "SELECT * from swiggy";
			res = st.executeQuery(query);
			while(res.next()) lhs.put(res.getInt("price"),res.getString("ordername"));
		}catch(SQLException e)
		{
			e.printStackTrace();
		}  
		finally
		{
			try
			{
				res.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				st.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println(lhs);
	}

}
