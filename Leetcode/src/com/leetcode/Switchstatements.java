package com.leetcode;

public class Switchstatements {
	public static void main(String a[]) {
		int i = 1, j = -1;
		switch (i) {
		    case 0, 1: j = 1; /* Line 4 */
		    case 2: j = 2;
		    default: j = 0;
		}
		System.out.println("j = " + j);
	}
}
