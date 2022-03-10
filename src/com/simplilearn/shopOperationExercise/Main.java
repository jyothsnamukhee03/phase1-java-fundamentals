package com.simplilearn.shopOperationExercise;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new Operation(2000,1,"Jyothsna","L");
		Shop sp = new Shop();
		System.out.println("The Shop Name is "+sp.shopname);
		System.out.println("The Buying cost: "+sp.buy(op));
		System.out.println("The selling cshop: "+sp.sell(op,200));
		System.out.println("The details are: "+sp.show(op,200));
	}

}
