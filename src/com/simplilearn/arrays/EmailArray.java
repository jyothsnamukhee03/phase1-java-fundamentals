package com.simplilearn.arrays;

public class EmailArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails = new String[5];
		
		// insert dta into email string array
		
		emails[0] = "jyothsnamukhee03@gmail.com";
		emails[1] = "abc@gmail.com";
		emails[2] = "xyz@gmail.com";
		
		// access data from the array
		
		System.out.println("Email at index 0 :> "+emails[0]);
		System.out.println("Email at index 3 :> "+emails[3]);
		
		System.out.println("----------------------------");
		
		// Access data with iteration
		
		for(int index=0;index < emails.length;index++) {
			System.out.println("Element at index "+ index+" :> "+emails[index]);
		}
	}

}
