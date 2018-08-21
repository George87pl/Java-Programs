package com.timbuchalka;

public class Bank {

    private long number;
    private int balance;
    private String name;
    private String mail;
    private long phone;

    public void deposit(int money) {
        if(money > 0) {
            this.balance += money;
            System.out.println("Wpłcono " + money + " zł");
        }
    }

    public void withdraw(int money) {
        if(this.balance >= money) {
            this.balance -= money;
            System.out.println("Wypłacono " + money + " zł");
        }
    }

}
