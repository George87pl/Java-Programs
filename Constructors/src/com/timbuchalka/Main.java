package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

//        Bank grzegorz = new Bank();
//        Bank kasia = new Bank();
//        grzegorz.deposit(500);
//        kasia.deposit(70);
//        grzegorz.withdraw(501);

        VipCustomer zenek = new VipCustomer("Zenon", 76.33);

        System.out.println("Stan na koncie " + zenek.getName() + " wynosi " + zenek.getCredit());


    }
}
