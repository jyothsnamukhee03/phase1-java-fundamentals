package com.simplilearn.typecasting;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double doubleNumber;
		System.out.println("Enter any Double Number: ");
		doubleNumber = sc.nextDouble();
		int intNumber1 = (int)doubleNumber;
		short shortNumber1 = (short)doubleNumber;
		byte byteNumber1 = (byte)doubleNumber;
		float floatNumber1 = (float)doubleNumber;
		System.out.println("Double to integer: "+intNumber1);
		System.out.println("Double to short: "+shortNumber1);
		System.out.println("Double to byte: "+byteNumber1);
		System.out.println("Double to float: "+floatNumber1);
		System.out.println();
		
		long longNumber;
		System.out.println("Enter any Long Number: ");
		longNumber = sc.nextLong();
		int intNumber2 = (int)longNumber;
		short shortNumber2 = (short)longNumber;
		byte byteNumber2 = (byte)longNumber;
		float floatNumber2 = (float)longNumber;
		System.out.println("Long to integer: "+intNumber2);
		System.out.println("Long to short: "+shortNumber2);
		System.out.println("Long to byte: "+byteNumber2);
		System.out.println("Long to float: "+floatNumber2);
		System.out.println();
	}
	
}
