package com.company;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " dziuba");
    }

    @Override
    public void breathe() {
        System.out.println("Oddycha");
    }

    @Override
    public void fly() {
        System.out.println("Ja latam!");
    }
}
