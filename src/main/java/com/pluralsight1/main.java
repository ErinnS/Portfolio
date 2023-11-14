package com.pluralsight1;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.CreditCard;
import com.pluralsight.finance.Valuable;

public class main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", 124, 12500);
        Valuable account2 = new BankAccount("Gary", 456, 1500);
        for (int i = 0; i < 5; i++) {
            System.out.println(account1.deposit(100));
            System.out.println(account2.deposit(100));
        }

    }
}