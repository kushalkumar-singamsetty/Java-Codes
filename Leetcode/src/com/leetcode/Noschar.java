package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Noschar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();  
		char[] arr= new char[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)s.next().charAt(0);
		}
		char[] res=new char[n+(n-1)];
		int index=0;
		for(int i=0;i<arr.length-1;i++)
		{
			res[index++]=(char)(arr[i]);
			int temp=arr[i]*arr[i+1];
			if(temp%2!=0) res[index++]='*';
			else if((arr[i]-arr[i+1])%2!=0) res[index++]='$';
			else res[index++]='#';
		}
		res[index]=(char)(arr[arr.length-1]);
		System.out.println(Arrays.toString(res));
		
		for(char temp:res)
		{
			System.out.print(temp);
		}
	}
}
