package com.pluralsight.finance;



public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double charge() {
        return charge();
    }
    public double pay() {
        return pay();
    }
    public double getValue() {
        System.out.println("Getting value");
        return 0;
    }

    @Override
    public double deposit(int i) {
        return 0;
    }


}
