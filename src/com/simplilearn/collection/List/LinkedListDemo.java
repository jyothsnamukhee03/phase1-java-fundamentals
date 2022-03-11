package com.company;

import java.util.LinkedList;
import  java.util.List;
import  java.util.Iterator;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<String> mylist2 = new LinkedList<String>(); // backed by dynamic array , not thread safe,read operations.

        // inserting the data

        mylist2.add("India");
        mylist2.add("Egypt");
        mylist2.add("Iraq");
        mylist2.add("Iran");
        mylist2.add("Greece");

        System.out.println(mylist2);
        System.out.println("The element in index 0: "+mylist2.get(0));
        System.out.println("The element in index 4: "+mylist2.get(4));

        System.out.println("--------------------------------------");

        // adding elemt to list

        mylist2.add(2,"janu");

        System.out.println(mylist2);

        // deleting element from list

        mylist2.remove(4);

        System.out.println(mylist2);

        System.out.println("-------------------------------------");

        // iteration over list
        Iterator<String> itr= mylist2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("-------------------------------------");

        // for loop with counter
        for(int index = 0; index < mylist2.size();index ++){
            System.out.println("The element at index "+index+" is "+mylist2.get(index));
        }

        System.out.println("-------------------------------------");

        // enhance for loop

        for (String name : mylist2){
            System.out.println("THe name: "+name);
        }



    }

}