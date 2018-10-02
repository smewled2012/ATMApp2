package com.seme.atm.org;

import java.util.ArrayList;
import java.util.HashMap;

public class ATM {

    private double amount;
    private double total_balance;
    ArrayList<Account> myAccount;
    private  String pin;

    String a = "44567-5 1234";
    String b = "12345-6 4321 ";
    String c = "43216-0 2413 ";

    public static String validatePin(String acctNum, String pin){
        String result;

       /* if (acctNum.equals(a.substring(0, a.indexOf(" "))) &&
                pin.equals(a.lastIndexOf(" ") +))
            return result = a.substring(a.lastIndexOf(" ") + 1);

        if (acctNum.equals(b.substring(0, b.indexOf(" "))) &&
                pwd.equals(b.substring(b.indexOf(" ")+1,b.lastIndexOf(" "))))
            return result = b.substring(b.lastIndexOf(" ") + 1);

        if (acctNum.equals(c.substring(0, c.indexOf(" "))) &&
                pwd.equals(c.substring(c.indexOf(" ") + 1,c.lastIndexOf(" "))))
            return result = c.substring(c.lastIndexOf(" ") + 1);
*/
       return result;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotal_balance() {
        return total_balance;
    }

    public void setTotal_balance(double total_balance) {
        this.total_balance = total_balance;
    }
    public int validatePin(java.lang.String accnum, int pin){




    }


    public ArrayList<Account> getMyAccount() {
        return myAccount;
    }

    public void setMyAccount(ArrayList<Account> myAccount) {
        this.myAccount = myAccount;
    }

    public void deposit(double amount){
       total_balance=total_balance+amount;

   }
   public void withdraw(double amount){
       total_balance=total_balance-amount;
   }

   public void showBalance(){
       System.out.println("Total current Balance :"+ total_balance);
   }

}
