package com.leetcode;

import java.util.Scanner;

public class PasswordStrength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		System.out.println(checkPassword(s1));
	}
	public static String checkPassword(String s)
	{
		if(s.length()<6) return "Weak";
		int cap=0,no=0,sp=0;
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				if(c>='a'&&c<='z') continue;
				if(c>='A'&&c<='Z') cap++;
				else if(c>='0'&&c<='9') no++;
				else sp++;
			}
		if(s.length()>=6)
			if(cap>0 && no>0 && sp>0) return "Strong";
			if(cap>0 && no==0 && sp==0) return "Medium";
			if(cap>0 && no>0 && sp==0) return "Good";
		return "";
	}

}
