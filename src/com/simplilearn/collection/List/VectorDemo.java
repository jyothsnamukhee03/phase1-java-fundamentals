package com.company;

import java.util.Vector;
import  java.util.List;
import  java.util.Iterator;

public class VectorDemo {

    public static void main(String[] args) {

        List<String> mylist4 = new Vector<>(); // backed by dynamic array , not thread safe,read operations.

        // inserting the data

        mylist4.add("India");
        mylist4.add("Egypt");
        mylist4.add("Iraq");
        mylist4.add("Iran");
        mylist4.add("Greece");

        System.out.println(mylist4);
        System.out.println("The element in index 0: "+mylist4.get(0));
        System.out.println("The element in index 4: "+mylist4.get(4));

        System.out.println("--------------------------------------");

        // adding elemt to list

        mylist4.add(2,"janu");

        System.out.println(mylist4);

        // deleting element from list

        mylist4.remove(4);

        System.out.println(mylist4);

        System.out.println("-------------------------------------");

        // iteration over list
        Iterator<String> itr= mylist4.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("-------------------------------------");

        // for loop with counter
        for(int index = 0; index < mylist4.size();index ++){
            System.out.println("The element at index "+index+" is "+mylist4.get(index));
        }

        System.out.println("-------------------------------------");

        // enhance for loop

        for (String name : mylist4){
            System.out.println("THe name: "+name);
        }



    }

}
