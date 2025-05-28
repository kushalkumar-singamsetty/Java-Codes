package com.leetcode;
import java.util.regex.*;
public class Allsubstrings {

	public static void main(String[] args) {
		String s = "abc"; // a b c ab bc abc 01 02 03 12 13 23 
							//               01 12 23 02 13 03 
		int length = s.length();
		for (int len = 1; len <= length; len++) {
            for (int start = 0; start <= length - len; start++) {
                int end = start + len;
                String substring = s.substring(start, end);
                System.out.println(substring +" "+ start +" "+ end);
            }
		}
	}

}