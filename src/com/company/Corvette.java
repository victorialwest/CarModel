package com.company;

public class Corvette  extends Car {
    private int year;
    private String make;
    private String model;
    private int speed = 0;
    private int gas = 100;

    public Corvette(int year, String make, String model, int speed, int gas) {
        super(year, make, model, speed, gas);
    }


    protected void getCorvetteInfo() {
        System.out.println("You are driving a " + " " + getYear() + " " +getMake() + " " + getModel() + ". It" +
                "is going " + getSpeed() + " MPH and has " + getGas() + "% of its gas left");

    }
}
