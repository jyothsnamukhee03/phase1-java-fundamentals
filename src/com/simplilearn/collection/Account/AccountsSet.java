package com.company.Account;

import java.util.HashSet;
import java.util.Set;

public class AccountsSet {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            //
            Set<Accounts> accset = new HashSet<Accounts>();
            // insert data into Accounts array

            Accounts acc1 = new Accounts(1001, "Savings", 7500000.50);

            Accounts acc2 = new Accounts(1002, "Current", 7600000.50);
            Accounts acc3 = new Accounts(1003, "Savings", 6600000.50);
            Accounts acc4 = new Accounts(1004, "Current", 5600000.50);
            Accounts acc5 = new Accounts(1005, "savings", 4600000.50);

            accset.add(acc1);
            accset.add(acc2);
            accset.add(acc3);


            System.out.println("-----------------------");

            // access data with iteration

            for (Accounts acc : accset) {
                System.out.println(acc.accid);
                System.out.println(acc.acctype);
                System.out.println(acc.balance);
                System.out.println("-------------------------------");
            }

        }
}
