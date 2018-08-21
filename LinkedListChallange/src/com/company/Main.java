package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<Song> listaPrzebojow = new LinkedList<Song>();

        Album baby = new Album("Baby One More Time");
        baby.dodajDoAlbumu("...Baby One More Time", 430);
        baby.dodajDoAlbumu("The Beat Goes On", 310);
        baby.dodajDoAlbumu("I Will Be There", 567);
        baby.dodajDoAlbumu("Soda Pop", 201);

        Album moderat = new Album("Moderat ");
        moderat.dodajDoAlbumu("The Wake-Up", 123);
        moderat.dodajDoAlbumu("Ice Age", 333);
        moderat.dodajDoAlbumu("How Long?", 115);

        Album comune = new Album("Commune ");
        comune.dodajDoAlbumu("Talk to God", 457);
        comune.dodajDoAlbumu("Goatslaves", 444);

        listaPrzebojow.add(baby.getSong(1));
        listaPrzebojow.add(baby.getSong(3));
        listaPrzebojow.add(comune.getSong(1));
        listaPrzebojow.add(moderat.getSong(1));
        listaPrzebojow.add(moderat.getSong(2));

        odtwarzaj(listaPrzebojow);

    }


    private static void odtwarzaj(LinkedList playlista) {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        boolean doPrzodu = true;
        ListIterator<Song> listIterator = playlista.listIterator();

        if (playlista.isEmpty()) {
            System.out.println("Brak piosenek");
        } else {
            printMenu();
            System.out.println("Odtwarzam: " + listIterator.next().getTitle());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Koniec słuchania muzyki");
                    quit = true;
                    break;

                case 1:
                    if (listIterator.hasNext()) {
                        if (!doPrzodu) {
                            listIterator.next();
                            doPrzodu = true;
                        }
                        System.out.println("Odtwarzam: " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Doszliśmy do końca listy");
                    }
                    break;

                case 2:
                    if (listIterator.hasPrevious()) {
                        if (doPrzodu) {
                            listIterator.previous();
                            doPrzodu = false;
                        }
                        System.out.println("Odtwarzam: " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("Doszliśmy do początku listy");
                    }
                    break;

                case 3:
                    printSongs(playlista);
                    break;

                case 4:
                    if (doPrzodu){
                        if(listIterator.hasPrevious())
                        listIterator.previous();
                        System.out.println("Odtwarzam: " +listIterator.next().getTitle());

                    }else{
                        listIterator.next();
                        System.out.println("Odtwarzam: " +listIterator.previous().getTitle());
                    }
                    break;

                case 5:
                    if (doPrzodu){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                            listIterator.remove();
                            System.out.println("Usunięto wybrany utwór");
                        }else {
                            System.out.println("Jesteś na początku listy, nie można tu nic usunąć");
                        }


                    }else{
                        if(listIterator.hasNext()){
                            listIterator.next();
                            listIterator.remove();
                        }else {
                            System.out.println("Jesteś na końcu listy, nie można tu nic usunąć");
                        }

                    }
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("0-wyjdź, 1-następna, 2-poprzednia, 3-lista piosenek, 4-replay, 5-usuń");
    }

    private static void printSongs(LinkedList<Song> lista) {
        for (Song piosenka : lista) {
            System.out.println(piosenka.getTitle() + " - " + piosenka.getDuration());
        }
    }
}
