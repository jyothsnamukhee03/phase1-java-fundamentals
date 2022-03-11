package com.company.Account;

import java.util.Arrays;

public class AccountsArray {
        public static void main(String[] args) {
            // TODO Auto-generated method stub

            Accounts [] acclist = new Accounts[5];

            // insert data into employee array

            Accounts acc1 = new Accounts(1001,"Savings",7500000.50);

            acclist[0] = acc1;

            acclist[1] = new Accounts(1002,"Current",7600000.50);
            acclist[2] = new Accounts(1003,"Savings",6600000.50);
            acclist[3] = new Accounts(1004,"Current",5600000.50);
            acclist[4] = new Accounts(1005,"savings",4600000.50);

            System.out.println(Arrays.toString(acclist));

            System.out.println("-----------------------");

            // access data with iteration


            for(int index=0;index < acclist.length;index++) {
                System.out.println("Element at index "+ index+" :> "+acclist[index]);
            }

        }
    }
