package com.leetcode;

public class Fact {
	public static void main(String[] args) {
		System.out.println(winGame(5));
	}
	public static int winGame(int num)
	{
		int answer=0;
		int fact=1;
		for(int i=1;i<=num;i++) fact*=i;
		while(fact>0)
		{
			if(fact%10==0) answer++;
			fact/=10;
		}
		return answer  ;
	}
}
