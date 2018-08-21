package com.company;

public class Pingwin extends Bird {

    public Pingwin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("No nie za bardzo latam");
    }
}
