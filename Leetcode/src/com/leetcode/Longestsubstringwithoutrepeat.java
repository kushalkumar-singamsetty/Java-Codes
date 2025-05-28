package com.leetcode;

public class Longestsubstringwithoutrepeat {
	public static void main(String[] args) {
		String s="";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			String temp="";
			for(int j=i;j<s.length();j++)
			{
				char ch=s.charAt(j);
				if(temp.indexOf(ch)!=-1) break;
				else temp+=ch;
			}
			if(s1.length()<temp.length()) s1=temp;
		}
		System.out.println(s1);
	}
}
