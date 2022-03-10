package com.simplilearn.typecasting;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int integerNumber;
		System.out.println("Enter any Integer Value");
		integerNumber = sc.nextInt();
		float floatNumber1 = integerNumber;
		double doubleNumber1 =integerNumber;
		long longNumber1 = integerNumber;
		
		System.out.println("float of integer: "+floatNumber1);
		System.out.println("double of integer: "+doubleNumber1);
		System.out.println("long of integer:"+longNumber1);
		System.out.println("");
		

		byte byteNumber;
		System.out.println("Enter any Byte Value");
		byteNumber = sc.nextByte();
		float floatNumber2 = byteNumber;
		double doubleNumber2 = byteNumber;
		long longNumber2 = byteNumber;
		
		System.out.println("float of byte: "+floatNumber2);
		System.out.println("double of byte: "+doubleNumber2);
		System.out.println("long of byte:"+longNumber2);
		System.out.println();
		

		short shortNumber;
		System.out.println("Enter any Short Value");
		shortNumber = sc.nextShort();
		float floatNumber3 = shortNumber;
		double doubleNumber3 =shortNumber;
		long longNumber3 = shortNumber;
		
		System.out.println("float of short: "+floatNumber3);
		System.out.println("double of short: "+doubleNumber3);
		System.out.println("long of short:"+longNumber3);
		
		
	}

}
