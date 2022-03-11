package com.simplilearn.collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        // list -> order cdollection of data with duplicate elements;
        // list (interface) -> imp classes -> ArrayList, LinkedList,Stack,Vector
        List<String> list1 = new ArrayList<String>(); // backed by dynamic array , not thread safe,read operations.
        List<String> list2 = new LinkedList<String>(); // backed by doubly linked list, not thread safe -> insert,delete,replace
        List<String> list3 = new Stack<String>();    // thread safe collections
        List<String> list4 = new Vector<String>();    // thread safe collections

        List<String> mylist = new ArrayList<>();

        // inserting the data

        mylist.add("Jyo");
        mylist.add("Mani");
        mylist.add("suthee");
        mylist.add("pratyu");
        mylist.add("ganesh");

        System.out.println(mylist);
        System.out.println("The element in index 0: "+mylist.get(0));
        System.out.println("The element in index 4: "+mylist.get(4));

        System.out.println("--------------------------------------");

        // adding elemt to list

        mylist.add(2,"janu");

        System.out.println(mylist);

        // deleting element from list

        mylist.remove(4);

        System.out.println(mylist);

        System.out.println("-------------------------------------");

        // iteration over list
        Iterator<String> itr= mylist.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("-------------------------------------");

        // for loop with counter
        for(int index = 0; index < mylist.size();index ++){
            System.out.println("The element at index "+index+" is "+mylist.get(index));
        }

        System.out.println("-------------------------------------");

        // enhance for loop

        for (String name : mylist){
            System.out.println("THe name: "+name);
        }



    }

}
