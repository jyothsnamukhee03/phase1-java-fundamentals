package com.company.Event;

import java.util.PriorityQueue;

public class EventQueue {

        public static void main(String[] args) {

            PriorityQueue<Event1> numbers = new PriorityQueue<Event1>();

            Event1 ev1 = new Event1(101,"Webinar","Online","11-03-2022 9:00 AM","11-03-2022 11:00AM","Simplilearn");
            Event1 ev2 = new Event1(101,"Webinar","Online","12-01-2022 2:00 PM","12-01-2022 04:00PM","Wipro");
            Event1 ev3 = new Event1(101,"Webinar","Online","09-03-2022 9:00 AM","09-03-2022 11:00AM","Capgemini");
            Event1 ev4 = new Event1(101,"Webinar","Online","15-05-2022 04:00 AM","15-05-2022 06:00PM","MVGR");
            Event1 ev5 = new Event1(101,"Webinar","Online","19-03-2022 9:00 AM","19-03-2022 11:00AM","IPL");

            numbers.add(ev1);
            numbers.add(ev2);
            numbers.add(ev3);
            numbers.add(ev4);
            numbers.add(ev5);

            System.out.println(numbers);

            System.out.println("Peek event is: "+numbers.peek());

            System.out.println("****************");


       /* // iteration over list
        Iterator<Event> itr= numbers.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            System.out.println("----------------------------------");
        }  */


        }

}
