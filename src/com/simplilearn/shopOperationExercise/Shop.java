package com.simplilearn.shopOperationExercise;
import java.util.*;

public class Shop {
	public String shopname = "MJ Super Market";
	public int buy(Operation op) {
		if(op != null) {
			System.out.println( "Ready to buy");
			return op.price;
		}else {
			System.out.println("Not Available");
			return 0;
		}
	}
	public double sell(Operation op,double gst) {
		if(gst > 0) {
			op.price += gst;;
			return op.price;
		}else {
			System.out.println("not selling");
			return 0;
		}
	}
	
	public double show(Operation op,double discount) {
		if(discount > 0) {
			op.price -= discount;
			System.out.println("the total");
			return op.price;
		}else {
			System.out.println("not selling");
			return 0;
		}
	}
	
}
