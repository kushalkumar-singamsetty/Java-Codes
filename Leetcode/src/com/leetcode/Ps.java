package com.leetcode;

import java.util.Scanner;

public class Ps {
	public static void main(String[] args) 
	{ 
		String s1 = "sample";
		String s2 = "plesa";
		int i= 0;
		while(true)
		{
			try {
				char c = s2.charAt(i);
				s2 = s2.replace(c+"","");
				s2+=c;
				if(s1.equals(s2))
				{
					System.out.println(1);
					return;
				}
			}catch(IndexOutOfBoundsException E) 
			{
				i=0;
			}
		}
	}
}
