package com.company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1001,"Jyo","CSE",724637);
        Employee emp2 = new Employee(1002,"Janu","EEE",724637);
        Employee emp3 = new Employee(1003,"mani","ECE",724637);
        Employee emp4 = new Employee(1004,"suthee","mech",724637);
        Employee emp5 = new Employee(1005,"pechu","Civil",724637);

        // create employee list

        List<Employee> empList = new ArrayList<Employee>();

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        //insert data at index

        empList.add(3,emp4);

        //replace data

        empList.set(2,emp4);

        // Access data with iteration
        for(Employee emp : empList) {
            System.out.println(emp.id);
            System.out.println(emp.name);
            System.out.println(emp.dept);
            System.out.println(emp3.salary);
            System.out.println("-------------------------------");
        }
    }

}
