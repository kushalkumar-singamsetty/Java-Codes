package com.leetcode;

public class ZigzagArray {
	    public static void main(String[] args) {
	        int[] arr = {4, 3, 7, 8, 6, 2, 1}; // Example array

	        // Convert the array to zigzag
	        convertToZigZag(arr);

	        // Print the zigzag array
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void convertToZigZag(int[] arr) {
	        boolean flag = true;

	        for (int i = 0; i < arr.length - 1; i++) {
	            if (flag) {
	                // If the flag is true, we expect arr[i] < arr[i+1]
	                if (arr[i] > arr[i + 1]) {
	                    swap(arr, i, i + 1);
	                }
	            } else {
	                // If the flag is false, we expect arr[i] > arr[i+1]
	                if (arr[i] < arr[i + 1]) {
	                    swap(arr, i, i + 1);
	                }
	            }
	            flag = !flag; // Flip the flag for the next iteration
	        }
	    }

	    public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

}
