package com.leetcode;

public class Sumofodd {
	public static int calculateDiscount(int billAmount)
	{
		int answer = 0;
		while(billAmount>0)
		{
			int temp = billAmount%10;
			if(temp%2!=0)
			{
				answer+=temp;
			}
			billAmount/=10;
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(calculateDiscount(2514795));
	}
}
