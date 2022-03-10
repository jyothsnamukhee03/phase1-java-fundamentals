package com.simplilearn.typecasting;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Enter any String");
		input = sc.nextLine();
		int intInput = (int)Integer.parseInt(input);
		short shortInput = (short)Short.parseShort(input);
		byte byteInput = (byte)Byte.parseByte(input);
		long longInput = (long)Long.parseLong(input);
		float floatInput = (float)Float.parseFloat(input);
		double doubleInput = (double)Double.parseDouble(input);
	
		System.out.println("String to Int: "+intInput);
		System.out.println("String to Short: "+shortInput);
		System.out.println("String to Byte: "+byteInput);
		System.out.println("String to Long: "+longInput);
		System.out.println("String to Float: "+floatInput);
		System.out.println("String to Double: "+doubleInput);
	}
}
