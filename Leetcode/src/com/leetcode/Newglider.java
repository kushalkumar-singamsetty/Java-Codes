package com.leetcode;
public class Newglider {
	public static void main(String[] args) {
		String s1 = "SAM";
		String s2 = "JOHN";
		String s3 = "SAMJOHN";
		String temp = s1+s2;
		System.out.println(check(s3, temp));
	}
	public static String check(String s3,String temp)
	{
		while(true)
		{
			if(s3.length()!=temp.length()) return "No";
			if(s3.length()==0&&temp.length()==0) return "yes";
			char c = s3.charAt(0);
			s3 = s3.replace(c+"","");
			temp = temp.replace(c+"","");
		}
	}
}
