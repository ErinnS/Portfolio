package com.pluralsight.finance;

public class BankAccount implements Valuable{
    private String name;
    private int accountNumber;
    private double balance;

    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    @Override
    public double deposit(int i) {
        System.out.println("$" + i + " Has been deposited ");
        return deposit(i);
    }
    public double withdraw() {
        return withdraw();
    }
    public double getValue() {
        return getValue();
    }
}
