package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        System.out.println("Co chcesz zrobić?");
        System.out.println("1 - Dodaj oddział");
        System.out.println("2 - Dodaj klienta");
        System.out.println("3 - Dokonaj tranzakcji klientowi");
        System.out.println("4 - Wyświetl dane");
        System.out.println("5 - Wyjdź");

        int wybor=0;
        double kwota=0.0;
        int oddzial=0;
        String nazwa;
        boolean flag = true;

        while(flag){

            System.out.println("Co chcesz zrobić?: ");
            Scanner scanner = new Scanner(System.in);

            try{
                wybor = scanner.nextInt();
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("To nie cyfra...");
            }

            switch(wybor){

                case 1:
                    bank.addNewBranch();
                    System.out.println("Oddział dodany i ma wartość " + bank.getBranchesArrayList().size());
                    break;

                case 2:
                    System.out.println("Podaj numer oddziału: ");
                    scanner = new Scanner(System.in);
                    oddzial = scanner.nextInt();

                    System.out.println("Podaj nazwe klienta: ");
                    scanner = new Scanner(System.in);
                    nazwa = scanner.nextLine();

                    System.out.println("Podaj kwotę początkową: ");
                    scanner = new Scanner(System.in);
                    kwota = scanner.nextDouble();
                    bank.getBranchesArrayList().get(oddzial).dodajKlienta(nazwa, kwota);
                    break;

                case 3:
                    System.out.println("Podaj numer oddziału: ");
                    scanner = new Scanner(System.in);
                    oddzial = scanner.nextInt();

                    System.out.println("Podaj nazwe klienta: ");
                    scanner = new Scanner(System.in);
                    nazwa = scanner.nextLine();

                    System.out.println("Podaj kwotę tranzakcji: ");
                    scanner = new Scanner(System.in);
                    kwota = scanner.nextDouble();
                    bank.getBranchesArrayList().get(oddzial).wplacKase(nazwa, kwota);
                    break;

                case 4:
                    for(Branches branches : bank.getBranchesArrayList()){
                        for(Customers customers : branches.getCustomersArrayList()){
                            System.out.println(customers.getName());
                            for(double kasa : customers.getTransactions()){
                                System.out.println("-->" + kasa);
                            }
                            System.out.println("********************************");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Pa Pa!");
                    flag = false;
                    break;


                default:

            }
        }





//        bank.addNewBranch();
//        ArrayList<Branches> branches = bank.getBranchesArrayList();
//
//        branches.get(0).dodajKlienta("Paweł", 17.3);
//        branches.get(0).wplacKase("Paweł", 2.0);
//        branches.get(0).wplacKase("Zenek", 7.0);
//        branches.get(0).wplacKase("Paweł", 62.0);
//
//        ArrayList<Customers> customers = branches.get(0).getCustomersArrayList();
//        ArrayList<Double> konto = customers.get(0).getTransactions();
//
//        for(double i : konto){
//            System.out.println("Kwota: " + i);
//        }

    }
}
