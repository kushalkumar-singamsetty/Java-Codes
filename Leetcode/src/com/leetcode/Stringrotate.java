package com.leetcode;

public class Stringrotate {

	public static void main(String[] args) {
		String s="sample";
		System.out.println(totalEnergy(2,3,3));
		
	}
	public static int totalEnergy(int initialEnergy,int rate, int timeN)
	{
		int answer=initialEnergy;//2,7,13
		int temp=initialEnergy;//2+3=5,5+3=8
		for(int i=1;i<timeN;i++)
		{
			temp=temp+rate;
			answer+=temp;
		}
		return answer;
	}
}
