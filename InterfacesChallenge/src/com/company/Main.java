package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ISaveable player = new Players("Grzegorz", 7, 33.17);
        player.zapisz();

        player = new Players("Janusz", 11, 54.12);
        player.zapisz();

        player = new Monsters("Paweł z mackami", 1, 1, true);
        player.zapisz();

        System.out.println(player.wczytaj());

    }
}
