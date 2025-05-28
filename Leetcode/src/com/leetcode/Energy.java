package com.leetcode;

public class Energy {
	public static void main(String[] args) {
		int initial = 4;
		int rate = 3;
		int time=5;
		int answer = initial;
		for(int i=1;i<time;i++)
		{
			answer+=rate;
		}
		System.out.println(answer);
	}
	
}
