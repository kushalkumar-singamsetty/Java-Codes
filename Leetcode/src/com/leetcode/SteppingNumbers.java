package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SteppingNumbers {

	public static void main(String[] args) {
		int r1 = 100;
		int r2 = 500;
		System.out.println(new SteppingNumbers().findNumbers(r1, r2));
	}

	public List findNumbers(int r1, int r2) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=r1;i<=r2;i++)
		{
			String t = Integer.toString(i);
			boolean key = false;
			for(int j=0;j<t.length()-1;j++)
			{
				if(!(key = (Math.abs((t.charAt(j)-t.charAt(j+1)))==1)?true:false)) break;
			}
			if(key) al.add(i);
		}
		return al;
	}
}
//101, 121, 123, 210, 212, 232, 234, 321, 323, 343, 345, 432, 434