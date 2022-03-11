package com.company.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

        public static void main(String[] args) {

            //Set is child  interfacein collection
            // set do not store duplicate values
            // Implementation class : Hashset,LinkedHashset,Treeset

            //declaration

            Set<String> uniquieNames = new TreeSet<String>();

            uniquieNames.add("nike");
            uniquieNames.add("adidas");
            uniquieNames.add("Bata");
            uniquieNames.add("flite");
            uniquieNames.add("paragon");

            System.out.println("-------------------------");


            //ascending order
            System.out.println(uniquieNames);

            System.out.println("Descending order");

            System.out.println(uniquieNames);

            System.out.println("-------------------------");

            //iterator

            for (String name : uniquieNames){
                System.out.println("THe Unique name is : "+name);
            }


        }

}
