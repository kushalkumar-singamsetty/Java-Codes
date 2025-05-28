package com.leetcode;
import java.util.regex.*;
public class Matchregularexp {
	public static void main(String[] args) {
		String s = "abc";
		String p = "a***abc";
		System.out.println(isMatch(s, p));
	}
	 public static boolean isMatch(String s1, String p) {
	        Pattern p1 = Pattern.compile(p);
			Matcher m = p1.matcher(s1);
			boolean flag = false;
			while(m.find())
			{
				String temp = m.group();
				System.out.println(temp);
				if(temp.equals(s1))
					{
						flag = true;
						break;
					}
			}
			return false;
	    }

}
