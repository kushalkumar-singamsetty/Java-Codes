package com.leetcode;

import java.util.Scanner;

public class sumafterbaseconv {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int sum=0;
		while(n>0)
		{
			sum+=n%k;
			n=n/k;
		}
		System.out.println(sum);
				
	}
}
