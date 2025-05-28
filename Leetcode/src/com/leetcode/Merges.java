package com.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Merges {
	public static void main(String[] args) {
		String s = "wwedwwresew";
		System.out.println(runLength(s));
	}
	public static String runLength(String s)
	{
		char[] arr = s.toCharArray();
		String res= "";
		for(int i=0;i<arr.length;i++)
		{
			char c = arr[i];
			int count = 0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]==c) count++;
				else
				{
					i=j-1;
					break;
				}
			}
			res+=count+""+c;
		}
		return res;
	}
}
