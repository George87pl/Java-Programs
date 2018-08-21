package com.company;

import java.util.ArrayList;

public class Customers {

    private String name;
    private ArrayList<Double> transactions;

    public Customers(String name, double kwota) {
        this.name = name;
        this.transactions =  new ArrayList<Double>();
        this.transactions.add(kwota);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(double kwota) {
        this.transactions.add(kwota);
    }
}
