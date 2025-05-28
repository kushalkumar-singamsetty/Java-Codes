package com.leetcode;

public class New {
	int i;
	static int j;
	public static void main(String[] args) {
		New n1 = new New();
		n1=null;
		System.out.println(n1.j); // in java static members can be referred with null reference
		New n2 = new New();
		n2.check(1,2);
		System.out.println(n2.i+""+j);
	}
	public  void check(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
}
