package com.company;

import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeSet {


        public static void main(String[] args) {

            Employee emp1 = new Employee(1001,"Jyo","CSE",724637);
            Employee emp2 = new Employee(1002,"Janu","EEE",724637);
            Employee emp3 = new Employee(1003,"mani","ECE",724637);
            Employee emp4 = new Employee(1004,"suthee","mech",724637);
            Employee emp5 = new Employee(1005,"pechu","Civil",724637);

            // create employee list

            Set<Employee> empSet = new LinkedHashSet<Employee>();

            empSet.add(emp1);
            empSet.add(emp2);
            empSet.add(emp3);
            System.out.println(empSet);
            //insert data at index

            //  empSet.add(3,emp4);

            // Access data with iteration
            for(Employee emp : empSet) {
                System.out.println(emp.id);
                System.out.println(emp.name);
                System.out.println(emp.dept);
                System.out.println(emp3.salary);
                System.out.println("-------------------------------");
            }
        }
}
1

