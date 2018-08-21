package com.timbuchalka;

public class Printer {

    private int tonerLevel;
    private int numberPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberPages, boolean isDuplex) {
        if(this.tonerLevel < 0 || this.tonerLevel > 100){
            System.out.println("Tusz musi być w przedziale 0 - 10. Ustawiam na 50%");
            this.tonerLevel = 50;
        }
        else{
            this.tonerLevel = tonerLevel;
            this.numberPages = numberPages;
            this.isDuplex = isDuplex;
        }
    }

    public void fillToner(){
        this.tonerLevel = 100;
    }

    public boolean printPage(){

        if(this.tonerLevel == 0) {
            System.out.println("Zabrakło tuszu!");
            return false;
        }
        else {
            if (this.isDuplex) this.tonerLevel -= 2;
            else this.tonerLevel -= 1;
            this.numberPages += 1;
            return true;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public boolean getisDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        if(duplex == true || duplex == false) this.isDuplex = duplex;
        else System.out.println("Błędna wartość");
    }

    public void fillUp() {
        this.tonerLevel = 100;
    }
}
