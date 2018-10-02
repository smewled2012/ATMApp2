package com.seme.atm.org;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("ATM Application !");
        Scanner input = new Scanner(System.in);

        for(int i=0;i<3;i++) {

            Account account1 = new Account();
            ATM atm = new ATM();
            System.out.println("Please Enter your Account number: ");
            String accnum = input.nextLine();
            account1.setAccountNumber(accnum);
            System.out.println("Please Enter your PIN ");
            String pin = input.nextLine();
            // validate pin
            atm.validatePin(accnum,pin);
            if(true){
                //method of menu
                System.out.println(exit 0);
            }
            else{
                // try again
                if(i==2)
                    //block the account
                    System exit;
            }

        }

 // if validation true

        if()








    }
}
