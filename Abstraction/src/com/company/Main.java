package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Pies");
        dog.breathe();
        dog.eat();

        Parrot ptak = new Parrot("Dziubek papuga");
        ptak.breathe();
        ptak.eat();
        ptak.fly();

        Pingwin pingwin = new Pingwin("Lodek");
        pingwin.breathe();
        pingwin.eat();
        pingwin.fly();


    }
}
