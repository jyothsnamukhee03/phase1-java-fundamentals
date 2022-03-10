package com.simplilearn.arrays;
import java.util.Arrays;

public class EmployeeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee [] empList = new Employee[5];
				
		// insert data into employee array
		
		Employee emp1 = new Employee(1001,"jyo","Engineer",7500000.50);
		
		empList[0] = emp1;
		
		empList[1] = new Employee(1002,"Mani","Engineer",7500000.50);
		
		System.out.println(Arrays.toString(empList));
		
		System.out.println("-----------------------");
		
		// access data with iteration
		

		for(int index=0;index < empList.length;index++) {
			System.out.println("Element at index "+ index+" :> "+empList[index]);
		}
				
	}

}
