package com.simplilearn.arrays;

public class Employee {
	public int id;
	public String name;
	public String dept;
	public double salary;
	
	// Employee Constructor
			
	public Employee(int id, String name, String dept, double salary) {
	
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
	
}
