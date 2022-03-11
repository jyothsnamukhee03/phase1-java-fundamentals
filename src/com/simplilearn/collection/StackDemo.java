package com.company;

import java.util.Stack;
import  java.util.List;
import  java.util.Iterator;

public class StackDemo {

    public static void main(String[] args) {

        List<String> mylist3 = new Stack<String>(); // backed by dynamic array , not thread safe,read operations.

        // inserting the data

        mylist3.add("India");
        mylist3.add("Egypt");
        mylist3.add("Iraq");
        mylist3.add("Iran");
        mylist3.add("Greece");

        System.out.println(mylist3);
        System.out.println("The element in index 0: "+mylist3.get(0));
        System.out.println("The element in index 4: "+mylist3.get(4));

        System.out.println("--------------------------------------");

        // adding elemt to list

        mylist3.add(2,"janu");

        System.out.println(mylist3);

        // deleting element from list

        mylist3.remove(4);

        System.out.println(mylist3);

        System.out.println("-------------------------------------");

        // iteration over list
        Iterator<String> itr= mylist3.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("-------------------------------------");

        // for loop with counter
        for(int index = 0; index < mylist3.size();index ++){
            System.out.println("The element at index "+index+" is "+mylist3.get(index));
        }

        System.out.println("-------------------------------------");

        // enhance for loop

        for (String name : mylist3){
            System.out.println("THe name: "+name);
        }



    }

}