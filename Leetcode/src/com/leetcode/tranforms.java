package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class tranforms {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(4);
		l.add(7);
		l.add(5);
		l.add(2);
		l.add(6);
		int n = 3;
		System.out.println(oddEvenTransform(l, n));
	}

	public static List<Integer> oddEvenTransform(List<Integer> arr, int transform) {
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 1; i < arr.size(); i++) {
			Integer t = arr.get(i);
			res.add(t);
		}
		System.out.println(res);
		for (int i = 0; i < transform; i++) {
			for (int j = 0; j < res.size(); j++) {
				int temp = res.get(j);
				if (temp % 2 == 0) {
					temp -= 3;
				} else {
					temp += 3;
				}
				res.remove(j);
				res.add(j, temp);
			}
		}
		return res;
	}
}
