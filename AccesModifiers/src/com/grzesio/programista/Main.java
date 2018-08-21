package com.grzesio.programista;

public class Main {

    public static void main(String[] args) {

        Account grzegorzAccount = new Account("Grzegorz");
//        grzegorzAccount.deposit(1000);
//        grzegorzAccount.withdraw(500);
//        grzegorzAccount.withdraw(-200);
//        grzegorzAccount.deposit(-20);

        grzegorzAccount.calculateBalance();



        System.out.println("Balanc on account is " + grzegorzAccount.getBalance());

    }
}
