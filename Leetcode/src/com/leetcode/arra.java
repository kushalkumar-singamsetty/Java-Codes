package com.leetcode;

import java.util.Scanner;
public class arra {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		int high=0;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			temp=arr[i];
			if(high<temp) 
			high=temp;
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(high==arr[i]) 
				count++;
		}
		System.out.println(count);
	}
}
