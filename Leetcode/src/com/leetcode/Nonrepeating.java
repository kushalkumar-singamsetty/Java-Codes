package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Nonrepeating {

	public static void main(String[] args) {
		int[][] arr = { { 1, 20 }, { 9, 19 } };
		int[] res = countNumbers(arr);
		for(int i : res)
		{
			System.out.println(i);
		}
	}

	public static int[] countNumbers(int[][] arr) {
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int start = arr[i][0];
			int end = arr[i][arr[i].length - 1];
			for (int k = start; k <= end; k++) {
				if (hasUniqueCharacters(k)) {
					count++;
				}
			}
			res[i] = count;
		}
		return res;
	}

	private static boolean hasUniqueCharacters(int number) {
		List<Integer> ls = new ArrayList<>();
		while (number > 0) {
			ls.add(number % 10);
			number /= 10;
		}
		for (int i = 0; i < ls.size(); i++) {
			if (Collections.frequency(ls, ls.get(i)) > 1) {
				return false;
			}
		}
		return true;
	}
//	LinkedHashSet<Character> lhs = new LinkedHashSet<>();
//	String s = Integer.toString(number);
//	for(int i=0;i<s.length();i++)
//	{
//		if(!(lhs.add(s.charAt(i))))
//		{
//			return false;
//		}
//	}
//	return true;
}
