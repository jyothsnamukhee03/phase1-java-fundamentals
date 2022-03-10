package com.simplilearn.arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] numbers = {{10,20,30,40,50},{1,2,3,4,5}};
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println("--------------------");
		for(int row = 0;row < numbers.length;row++) {
			System.out.println(Arrays.toString(numbers[row]));
			for(int col = 0;col < numbers[row].length;col++) {
				System.out.println("["+row+","+col+"] : "+numbers[row][col]);
			}
		}
	}
	
}
