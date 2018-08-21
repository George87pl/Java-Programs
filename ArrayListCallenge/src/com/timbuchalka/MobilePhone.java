package com.timbuchalka;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private Scanner wczytaj = new Scanner(System.in);
    private ArrayList<Contacts> listaKontaktow = new ArrayList<Contacts>();

    public void showMenu(){
        System.out.println();
        System.out.println("**********************");
        System.out.println("1 - print list of contacts");
        System.out.println("2 - add contact");
        System.out.println("3 - update contact");
        System.out.println("4 - to remove contact");
        System.out.println("5 - to find contact");
        System.out.println("6 - to close program");
        System.out.println("**********************");
        System.out.println();
    }

    public void chooseMenu(){
        System.out.println("Wybierz opcję: ");
        int numer = wczytaj.nextInt();
        wczytaj.nextLine();
        switch(numer){
            case 1:
                printContacts();
                break;
            case 2:
                addContact();
                break;
            default:
                System.out.println("Jeszcze nie działa");
                break;

        }
    }

    private void addContact(){
        System.out.println("Wprowadź nazwę nowego kontaktu");
        String nazwa = wczytaj.nextLine();
        System.out.println("Wprowadź numer dla kontaktu " + nazwa);
        int foneNumer = wczytaj.nextInt();
        wczytaj.nextLine();
        listaKontaktow.add(new Contacts(nazwa, foneNumer));
    }

    private void removeContact(String item){
        int position = findItem(item);
        if(position >= 0) {
            removeItem(position);
        }
    }

    private void removeItem(int position){
        listaKontaktow.remove(position);
    }

    private int findItem(String searchItem) {
        return listaKontaktow.indexOf();
    }

    private void printContacts() {
        System.out.println("You have " + listaKontaktow.size() + " contacts in your phone");
        for (int i = 0; i < listaKontaktow.size(); i++) {
            System.out.println((i + 1) + ". " + (listaKontaktow.get(i)).getContact());
        }
    }

}
