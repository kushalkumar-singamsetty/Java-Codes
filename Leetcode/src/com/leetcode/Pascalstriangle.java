package com.leetcode;

public class Pascalstriangle {
	 public static void main(String[] args) {
	        int rows = 5; // Number of rows in Pascal's triangle

	        // Create Pascal's triangle
	        int[][] triangle = new int[rows][];
	        for (int i = 0; i < rows; i++) {
	            triangle[i] = new int[i + 1];
	            triangle[i][0] = 1; // First element in each row is 1
	            triangle[i][i] = 1; // Last element in each row is 1

	            // Calculate the values in between
	            for (int j = 1; j < i; j++) {
	                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
	            }
	        }

	        // Print Pascal's triangle
	        for (int i = 0; i < rows; i++) {
	            // Print spaces to align the triangle
	            for (int k = 0; k < rows - i; k++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j <= i; j++) {
	                System.out.print(triangle[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
