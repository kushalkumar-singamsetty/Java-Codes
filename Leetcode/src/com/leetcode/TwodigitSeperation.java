package com.leetcode;

public class TwodigitSeperation {
	public static void main(String[] args) {
		System.out.println(threeDot("daxbcdef"));
	}
	//question 1
	public static String changeStr(String s) {
		int last = s.length();
		int j=2;
		while(last>1) {
		String temp =s.substring(last-j,last);
		String t1 = s.substring(0,last-j);
		String t2 = s.substring(last);
		s=t1+"."+temp+t2;
		last-=2;
		}
		return s;
	}
	// question 2
	public static String threeDot(String s) {
		int last = s.length();
		int count = 1;
		int j;
		while(last>1) {
			if(count%2==0) j=2;
			else j=3;
			if(last<j) break;
			String temp =s.substring(Math.abs(last-j),last);
			String t1 = s.substring(0,Math.abs(last-j));
			String t2 = s.substring(last);
			s=t1+"."+temp+t2;
			last-=j;
			count++;
		}
		return s;
	}
}
