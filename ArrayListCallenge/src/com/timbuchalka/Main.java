package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        MobilePhone telefonGrzesia = new MobilePhone();

        telefonGrzesia.showMenu();
        while(true){
            telefonGrzesia.chooseMenu();
        }
    }
}
