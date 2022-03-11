package com.company.set;

import java.sql.SQLOutput;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        //Set is child  interfacein collection
        // set do not store duplicate values
        // Implementation class : Hashset,LinkedHashset,Treeset

        //declaration
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();

        Set<String> uniquieCompanies = new HashSet<String >();

        uniquieCompanies.add("Wipro");
        uniquieCompanies.add("tcs");
        uniquieCompanies.add("Capgemini");
        uniquieCompanies.add("Simplilearn");
        uniquieCompanies.add("Infosys");

        System.out.println("-------------------------");

        System.out.println(uniquieCompanies);

        System.out.println("-------------------------");

        //iterator

        for (String name : uniquieCompanies){
            System.out.println("THe Company name is : "+name);
        }


    }

}

