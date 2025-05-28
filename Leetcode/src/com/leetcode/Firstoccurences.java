package com.leetcode;

public class Firstoccurences {

	public static void main(String[] args) {
		String s1="CORPORATION";
		String s2="6PRT";
		int least=Integer.MAX_VALUE;
		int highest=Integer.MIN_VALUE;
		for(int i=0;i<s2.length();i++) 
		{
			int temp=s1.indexOf(s2.charAt(i));
			if(temp<0) continue;
			if(temp>highest) highest=temp;
			if(temp<least) least=temp;
		}
		System.out.println(highest+" "+least);
		String res="";
		for(int i=least;i<=highest;i++) res+=s1.charAt(i);
		System.out.println(res);
	}

}
