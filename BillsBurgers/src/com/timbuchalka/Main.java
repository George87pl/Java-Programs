package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

       // BaseBurger burger1 = new BaseBurger("Standardowy", "Przenna", "Wołowe");
        HealthyBurger burger2 = new HealthyBurger("Przenna", "Wołowe");
//        burger1.addAdditions("Cebula");
//        burger1.addAdditions("Papryka");
//        burger1.addAdditions("Bekon");
//        burger1.addAdditions("Cebula");
//        burger1.addAdditions("Ogórek");
//        burger1.getPrice();

          burger2.addAdditions("Ananas");
          burger2.addAdditions("Fasola");
          burger2.addAdditions("Cebula");
        burger2.addAdditions("Papryka");
        burger2.addAdditions("Bekon");
        burger2.addAdditions("Cebula");
        burger2.addAdditions("Ogórek");
          burger2.getPrice();
    }
}
