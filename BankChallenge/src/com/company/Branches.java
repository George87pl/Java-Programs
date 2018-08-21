package com.company;

import java.util.ArrayList;

public class Branches {

   private ArrayList<Customers> customersArrayList = new ArrayList<Customers>();

    public boolean dodajKlienta(String nazwa, double kwota){
       return this.customersArrayList.add(new Customers(nazwa, kwota));
   }

   public boolean wplacKase(String nazwa, double kwota){

       for(Customers customers : customersArrayList){
           if(customers.getName().equals(nazwa)){
               customers.setTransactions(kwota);
               return true;
           }
       }
       return false;
   }

    public ArrayList<Customers> getCustomersArrayList() {
        return customersArrayList;
    }
}
