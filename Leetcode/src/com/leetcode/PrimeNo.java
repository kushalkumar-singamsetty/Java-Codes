package com.leetcode;

public class PrimeNo {
	public static void main(String[] args) {
		int a = 75;
		if(a<=1) 
		{
			System.out.println("Not prime");
			return;
		}
		boolean flag = true;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i == 0)
			{
				flag = false;
				System.out.println("Not prime");
				break;
			}
		}
		if(flag)
		{
			System.out.println("prime no "+a);
		}
		System.out.println(checkPrime(2,75));
	}
	public static boolean checkPrime(int i,int num)
	{
		if(i>num/2) return true;
		if(num%i == 0) return false;
		return checkPrime(i+1, num);
	}
}
