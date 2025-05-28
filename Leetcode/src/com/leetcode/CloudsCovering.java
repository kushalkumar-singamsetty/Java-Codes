package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CloudsCovering {

	public static void main(String[] args) {
		ArrayList<Integer> population = new ArrayList<Integer>();
		population.add(10);
		population.add(100);
		
		ArrayList<Integer> locationonaxis = new ArrayList<Integer>();
		locationonaxis.add(5);
		locationonaxis.add(10);
		ArrayList<Integer> cloudlocationonaxis = new ArrayList<Integer>();
		cloudlocationonaxis.add(4);
		ArrayList<Integer> rangeofcloudonaxis = new ArrayList<Integer>();
		rangeofcloudonaxis.add(1);
		maximumPeople(population, locationonaxis, cloudlocationonaxis, rangeofcloudonaxis);
	}

	public static void maximumPeople(List<Integer> population, List<Integer> locationaxis,
			List<Integer> cloudlocationonaxis, List<Integer> rangeofcloudonaxis) {
		// Return the maximum number of people that will be in a sunny town after
		// removing exactly one cloud.
		System.out.println(population);
		System.out.println(locationaxis);
		System.out.println(cloudlocationonaxis);
		System.out.println(rangeofcloudonaxis);
	}
}
