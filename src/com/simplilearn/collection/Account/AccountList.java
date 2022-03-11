package com.company.Account;

import java.util.List;

import java.util.LinkedList;

public class AccountList {



        public static void main(String[] args) {
            // TODO Auto-generated method stub

            //
            List<Accounts> acclist = new LinkedList<Accounts>();
            // insert data into employee array

            Accounts acc1 = new Accounts(1001,"Savings",7500000.50);

            Accounts acc2 = new Accounts(1002,"Current",7600000.50);
            Accounts acc3 = new Accounts(1003,"Savings",6600000.50);
            Accounts acc4 = new Accounts(1004,"Current",5600000.50);
            Accounts acc5= new Accounts(1005,"savings",4600000.50);

            acclist.add(acc1);
            acclist.add(acc2);
            acclist.add(acc3);

            // insert with index
            acclist.add(3,acc4);

            System.out.println("-----------------------");

            // access data with iteration

            for(Accounts acc : acclist) {
                System.out.println(acc.accid);
                System.out.println(acc.acctype);
                System.out.println(acc.balance);
                System.out.println("-------------------------------");
            }
        }
}
