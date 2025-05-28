package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mimaxsum {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(9);
		l1.add(3);
		l1.add(7);
		l1.add(5);
		l1.add(1);
		check(l1);
	}
	public static void check(List<Integer> arr)
	{
		Collections.sort(arr);
		long m = 0,n=0;
		for(int i=0;i<arr.size()-1;i++) m+=arr.get(i);
		for(int i=arr.size()-1;i>0;i--) n+=arr.get(i);
		System.out.println(m+" "+n);
	}

}
