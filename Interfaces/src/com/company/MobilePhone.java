package com.company;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobilny telefon się włącza");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Teraz dzwoni " + phoneNumber + " na mobilnym telefonie");
        } else {
            System.out.println("Telefon jest wyłączony");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Zgłaszam się na mobilnym telefonie");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melodyjny ring");
        } else {
            isRinging = false;
            System.out.println("Nie włączony albo pomyłka numerowa");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging () {
        return false;
    }
}
