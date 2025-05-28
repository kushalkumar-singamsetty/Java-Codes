package com.leetcode;

import java.math.BigInteger;
import java.util.Scanner;

public class divby90large {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] k=new int[n];
		for(int i=0;i<k.length;i++)
		{
			k[i]=s.nextInt();
		}
		long res=0;
			long temp=k[0];
			for(int j=1;j<k.length;j++)
			{
				long a=temp*10+k[j];
				if(a%90==0)
				{
					if(a>res) res=a;
				}
				System.out.println(res);
				temp=a;
			}
//		System.out.println(res);
	}
}
