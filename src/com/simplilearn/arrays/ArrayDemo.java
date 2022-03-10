package com.simplilearn.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring array directly with initializing the data to it
		int[] numbers = {10,20,30,40,50};
		
		// below will generate garbase value
		System.out.println(numbers);
		
		// it should be decl;ared as below to get the valid output
		System.out.println(Arrays.toString(numbers));

		
		// Access Elements by their Index
		
		System.out.println("Element at index 0 :> "+numbers[0]);
		//System.out.println("Element at index 5 :> "+numbers[5]);
		
		//lengt or last element in tha array is
		System.out.println("length of the array is :> "+numbers.length);
		
		System.out.println("Element at last index :> "+numbers[numbers.length - 1]);
		
		// access the element beyond the length it raises the exception 
		// exception: array indexout of the box
		
		//System.out.println("Element at index 6 :> "+numbers[6]);
		
		for(int index=0;index < numbers.length;index++) {
			System.out.println("Element at index "+ index+" :> "+numbers[index]);
		}
	
		
	}

}
