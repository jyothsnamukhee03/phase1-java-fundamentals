package com.company.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

        public static void main(String[] args) {

            //Set is child  interfacein collection
            // set do not store duplicate values
            // Implementation class : Hashset,LinkedHashset,Treeset

            //declaration

            Set<String> uniquieBrands = new LinkedHashSet<String >();

            uniquieBrands.add("nike");
            uniquieBrands.add("adidas");
            uniquieBrands.add("Bata");
            uniquieBrands.add("flite");
            uniquieBrands.add("paragon");

            System.out.println("-------------------------");


            System.out.println(uniquieBrands);

            System.out.println("-------------------------");

            //iterator

            for (String brand : uniquieBrands){
                System.out.println("THe Company name is : "+brand);
            }


        }

}
