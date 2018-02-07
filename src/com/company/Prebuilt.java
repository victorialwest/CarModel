package com.company;

public class Prebuilt {


    public int year;
    public String make;
    public String model;
    private int speed = 0;
    private int gas = 100;

    public Prebuilt(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
}


