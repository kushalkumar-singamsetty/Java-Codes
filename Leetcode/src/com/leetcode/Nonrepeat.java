package com.leetcode;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Nonrepeat {
	public static void main(String[] args) {
		int[][] arr = {{1,20},{9,19}};
		int[] res = countNumbers(arr);
		for (int i : res) {
			System.out.println(i);
		}
	}

	public static int[] countNumbers(int[][] arr) {
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = arr[i][0]; j <=arr[i][arr[i].length-1]; j++) {
				TreeSet<Character> ts = new TreeSet<>();
				String s = Integer.toString(j);
				for (int k = 0; k < s.length(); k++) {
					ts.add(s.charAt(k));
				}
				if ((s.length() == ts.size())) {
					count++;
				}
			}
			res[i] = count;
		}
		return res;
	}
}
