package com.leetcode;

public class ConvertTime {

	public static void main(String[] args) {
		String s = "01:05:45PM";
		System.out.println(covert(s));
	}
	public static String covert(String s)
	{
		String hours = s.substring(0,2);
	     String check = s.substring(8,10);
	        int hrs = Integer.parseInt(hours);
	        if(check.equals("PM")&& (hrs>=1&& hrs<=11))
	        {
	            return (hrs+12)+s.substring(2,s.length()-2);
	        }
	        if(check.equals("AM") && hrs==12)
	        {
	            return "00"+s.substring(2,s.length()-2);
	        }
	        return hours+s.substring(2,s.length()-2);
	}

}
