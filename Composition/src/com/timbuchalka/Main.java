package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        Tv telewizorekGrzesia = new Tv("Panasonic", 125, true);
        Pc komputerekGrzesia = new Pc("LG", "Komputer stacjonarny");
        Wardrobe szafaGrzesia = new Wardrobe(300);

        Room pokojGrzesia = new Room(telewizorekGrzesia, komputerekGrzesia, szafaGrzesia);

        System.out.print("Telewizor ma model: ");
        pokojGrzesia.modelTelewizora();

    }
}
