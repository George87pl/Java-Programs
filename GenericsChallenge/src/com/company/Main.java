package com.company;

public class Main {

    public static void main(String[] args) {

        Druzyna<PilkaNozna> kopacze = new Druzyna<>("Kopacze zadków", 10);
        Druzyna<PilkaNozna> mocarze = new Druzyna<>("Mocarne pojeby", 5);
        Druzyna<PilkaNozna> kiwacze = new Druzyna<>("Kiwiące świnie", 7);
        Druzyna<PilkaNozna> nudziarze = new Druzyna<>("Nudzący podawacze", 0);

        Druzyna<Siatkowka> reklamowki = new Druzyna<>("Satkowe reklamówy", 7);
        Druzyna<Siatkowka> przeszczepy = new Druzyna<>("Nieproporcjonalne przeszczepy", 1);
        Druzyna<Siatkowka> kurduple = new Druzyna<>("Kurduplowe krasnalki", 4);

        Druzyna<Koszykowka> grubasy = new Druzyna<>("Grubawi grubole", 6);
        Druzyna<Koszykowka> skoczki = new Druzyna<>("Skoczki zboczki", 0);

        TablicaRekordow<PilkaNozna> pilkaScore = new TablicaRekordow<>();
        pilkaScore.dodajDoTablicy(kopacze);
        pilkaScore.dodajDoTablicy(nudziarze);
        pilkaScore.dodajDoTablicy(mocarze);
        pilkaScore.dodajDoTablicy(kiwacze);
        pilkaScore.sortuj();
        pilkaScore.wyswietlTablice();

        System.out.println("**************************");

        TablicaRekordow<Siatkowka> siatkaScore = new TablicaRekordow<>();
        siatkaScore.dodajDoTablicy(reklamowki);
        siatkaScore.dodajDoTablicy(przeszczepy);
        siatkaScore.dodajDoTablicy(kurduple);
        siatkaScore.sortuj();
        siatkaScore.wyswietlTablice();

        System.out.println("**************************");

        TablicaRekordow<Koszykowka> koszScore = new TablicaRekordow<>();
        koszScore.dodajDoTablicy(grubasy);
        koszScore.dodajDoTablicy(skoczki);
        koszScore.sortuj();
        koszScore.wyswietlTablice();


    }
}
