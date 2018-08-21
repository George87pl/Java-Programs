package com.timbuchalka;

public class VipCustomer {

    private String name;
    private double credit;
    private String mail;

    public VipCustomer(){
        this("Unknow", 0.0, "brak");
    }

    public VipCustomer(String name) {
        this(name, 0.0, "brak");
    }

    public VipCustomer(String name, double credit){
        this(name, credit, "brak");
    }

    public VipCustomer(String name, String mail){
        this(name, 0.0, mail);
    }

    public VipCustomer(String name, double credit, String mail){
        this.name = name;
        this.credit = credit;
        this.mail = mail;
        System.out.println("Name: " + this.name + " Credit: " + this.credit + " Mail: " +this.mail);
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getMail() {
        return mail;
    }
}
