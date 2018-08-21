package com.timbuchalka;

class Car{

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String color;
    private boolean ismanual;
    private String name;
    private int speed;

    public Car(String color, boolean ismanual, String name, int cylinders) {
        this.engine = false;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.color = color;
        this.ismanual = ismanual;
        this.name = name;
        this.speed = 0;
    }

    public void startEngine() {
        if(this.engine == true) System.out.println("Już odpalony!");
        else {
            System.out.println("Engine started!");
            this.engine = true;
        }
    }

    public void accelerate() {
        if(engine == false) System.out.println("Nie da rady bo silnik nie włączony!");
        else {
            this.speed += 1;
            System.out.println("Accelerating! Pędzimy z szybkością " + this.speed);
        }
    }

    public void breaking() {
        this.speed = 0;
        this.engine = false;
        System.out.println("Is breaking!");
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setSpeed(){
        this.speed += 1;
    }
}

class Maluszek extends Car{

    public Maluszek(String color, boolean ismanual, String name, int cylinders) {
        super(color, ismanual, name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Nie chce odpalić!");
    }
}

class Ferrari extends Car {

    public Ferrari(String color, boolean ismanual, String name, int cylinders) {
        super(color, ismanual, name, cylinders);
    }

    @Override
    public void startEngine() {
        if (isEngine() == true) System.out.println("Już elegancko mruczy!");
        else {
            System.out.println("Mruczy aż miło!");
            setEngine(true);
        }
    }

    public void accelerate() {
        if(isEngine() == false) System.out.println("Nie da rady bo silnik nie włączony ale i tak wygląda zajebiście nawet jak nie jedzie!!1!1!");
        else {
            for(int i = 1; i < 100; i++) setSpeed();
            System.out.println("ZAPIERDALAMY!!!! Z szybkością " + getSpeed());
        }
    }
}
public class Main {

    public static void main(String[] args) {

        Maluszek rupiec = new Maluszek("Czerwony", true, "Szczała", 4);
        Ferrari wyscigowa = new Ferrari("Czarny", false, "Jastrząb Szybkości", 77);

     //   rupiec.startEngine();
     //   for(int i=0; i<10; i++) rupiec.accelerate();

      //  wyscigowa.startEngine();
        wyscigowa.accelerate();


    }
}
