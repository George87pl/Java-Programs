package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        Car auto1 = new Car(1, "Osobowy", "500 kg", "Maluch");
        System.out.println("Nazwa: " + auto1.getName());
        System.out.println("Typ: " + auto1.getType());
        System.out.println("Waga: " + auto1.getWight());
        System.out.println("Szybkość: " + auto1.getSpeed());
        System.out.println("Części zamienne: " + auto1.getChangingGear());
        auto1.setChangingGear(0);
        System.out.println("Części zamienne: " + auto1.getChangingGear());

    }
}
