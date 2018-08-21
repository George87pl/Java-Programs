package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        Printer drukarkaGrzesia = new Printer(75, 10, true);

        drukarkaGrzesia.printPage();
        System.out.println("Licznik stron: " + drukarkaGrzesia.getNumberPages() + " Poziom tuszu: " + drukarkaGrzesia.getTonerLevel() + "% Duplex: " + drukarkaGrzesia.getisDuplex());

        drukarkaGrzesia.setDuplex(false);

       drukarkaGrzesia.printPage();
        System.out.println("Licznik stron: " + drukarkaGrzesia.getNumberPages() + " Poziom tuszu: " + drukarkaGrzesia.getTonerLevel() + "% Duplex: " + drukarkaGrzesia.getisDuplex());

        while(drukarkaGrzesia.printPage()){
            System.out.println("Licznik stron: " + drukarkaGrzesia.getNumberPages() + " Poziom tuszu: " + drukarkaGrzesia.getTonerLevel() + "% Duplex: " + drukarkaGrzesia.getisDuplex());
        }

        drukarkaGrzesia.fillUp();
        drukarkaGrzesia.setDuplex(true);
        System.out.println("Licznik stron: " + drukarkaGrzesia.getNumberPages() + " Poziom tuszu: " + drukarkaGrzesia.getTonerLevel() + "% Duplex: " + drukarkaGrzesia.getisDuplex());

    }
}
