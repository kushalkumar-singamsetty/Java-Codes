package com.leetcode;

public class Palindrome {
	public static void main(String[] args) {
		int n = 1221;
		int temp = n;
		int res = 0;
		while(n>0)
		{
			res =res*10+(n%10);
			n/=10;
		}
		if(res == temp)
		{
			System.out.println("palindrome"+temp);
		}
		else
		{
			System.out.println("Not palindrome");
		}
		System.out.println(stringpal("madam"));
	}
	public static boolean stringpal(String s)
	{
		char[] arr = s.toCharArray();
		int i = 0 , j = arr.length-1;
		while(i<j)
		{
			if(arr[i]!=arr[j]) return false;
			i++;
			j--;
		}
		return true;
	}
}
