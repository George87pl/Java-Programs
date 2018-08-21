package com.company;

public class Main {

    public static void main(String[] args) {

        Items przedmiot0 = new Items(0);
        Items przedmiot1 = new Items(4);
        Items przedmiot2 = new Items(7);

        przedmiot1.setNextItem(przedmiot2);
        przedmiot1.setPrevItem(przedmiot0);

        System.out.println(przedmiot1.value);
        System.out.println(przedmiot1.moveToNextItem().getValue());

    }
}
