package com.jdbc.into;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class Program3 {

	public static void main(String[] args) {
		try
		{
			connection();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static void connection() throws SQLException
	{
		Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Rupesh@123");
		Statement st = mycon.createStatement();
		ResultSet res = st.executeQuery("SELECT * FROM employeedetails");
		addDetails(res);
		if(mycon != null)mycon.close();
		if(st != null)st.close();
		if(res != null)res.close();
	}
	public static void addDetails(ResultSet res)throws SQLException
	{
		TreeMap<Integer, Object> lhm = new TreeMap<Integer, Object>(); 
		while(res.next()) lhm.put(res.getInt("salary"),(create(res.getInt("id"),res.getString("name"),res.getString("email"),res.getString("dept"))));
		System.out.println(lhm);
		getHighsalary(lhm);
	}
	public static LinkedList<Object> create(Integer id,String name,String email,String dept)
	{
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(id);
		ll.add(name);
		ll.add(email);
		ll.add(dept);
		return ll;
	}
	public static void getHighsalary(TreeMap lhm)
	{
		int res = 0;
		Set ky = lhm.keySet();
		Iterator it = ky.iterator();
		while(it.hasNext())
		{
			Object temp = it.next();
			if((Integer)temp>res) res =(Integer)temp;
		}
		LinkedList<Object> l = new LinkedList<Object>();
		if(l instanceof Object) l =(LinkedList)lhm.get(res);
		for (int i = 0; i < l.size(); i++) {
			Object s = l.get(i);
			System.out.println(s);
		}
	}
}
