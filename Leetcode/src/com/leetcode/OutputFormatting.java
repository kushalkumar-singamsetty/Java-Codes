package com.leetcode;

public class OutputFormatting {
	public static void main(String[] args) {
		System.out.println("Hello"+24+"world");
		System.out.printf("Hello%dworld%n", 24);
		System.out.printf("%.3f%n", 20.34);
		System.out.printf("'%c'%n",'k');
		System.out.printf("'%C'%n",'k');
		System.out.printf("'%S'%n","kushal");
		System.out.printf("%-10%n","kushal");
	}
	
}
