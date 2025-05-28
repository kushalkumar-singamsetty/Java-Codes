package com.leetcode;

public class NoofOccurences_ {

	public static void main(String[] args) {
		String s = "abccba";
        int length = s.length();
		for (int len = 1; len <= length; len++) {
            for (int start = 0; start <= length - len; start++) {
                int end = start + len;
                String temp = s.substring(start, end);
                if(isPalindrome(temp)) System.out.println(temp);
            }
		}
    }
    public static boolean isPalindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

}
