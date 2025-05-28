package com.leetcode;

public class Techm {

	public static void main(String[] args) {
		String s="alphxxdida";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		int ans=0;
		for(int i=0;i<rev.length();i++)
		{
			if(s.charAt(i)==rev.charAt(i)) ans++;
		}
		System.out.println(ans);
	}
	

}
