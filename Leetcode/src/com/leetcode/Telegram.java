package com.leetcode;

public class Telegram {
	public static void main(String[] args) {
		int p=6,q=2,r=9;
		q=1+r;
		if((r+q)<q) r=18+r;
		if((p-r)<(q+p)) r=(p+q)+r;
		else p=p+r;
		q=(p+9)+q;
		System.out.println(p+q+r);
	}
}
