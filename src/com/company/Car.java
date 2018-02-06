package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.mainMenu;

public class Car extends Prebuilt {

    private Scanner input = new Scanner(System.in);
    private int year;
    private String make;
    private String model;
    private int speed = 0;
    private int gas = 100;

    public Car() {
        setYear(input.nextInt());
        setMake(input.nextLine());
        setModel(input.nextLine());
        setSpeed(0);
        setGas(100);


    }


    public Car(int year, String make, String model, int speed, int gas) {
        super(year, make, model, speed, gas);
        this.speed = speed;
        this.gas = gas;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        System.out.println("What is the year of the car you would like to make?");
        try{
            year = input.nextInt();
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number for the year.");
            setYear(input.nextInt());
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
        System.out.println("What is the make of the car you would like to make?");
        try{
            make = input.nextLine();
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a make.");
            setMake(input.nextLine());
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("What is the model of the car you would like to make?");
        try{
            model = input.nextLine();
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a model.");
            setModel(input.nextLine());
        }
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

    public void getCarInfo() {
        System.out.println("The " + getMake() + " " + getModel() + " is going " + getSpeed() + " MPH" +
                " and has " + getGas() + "% of its gas left. ");
    }

    public void driveCar(Car car) {
        for(int seconds = 0; seconds <=5; seconds ++) {
            //get current gas
            //get current speed

            car.setSpeed(car.getSpeed() + 1);
            car.setGas(car.getGas() - 1);

            System.out.println("The " + car.getMake() + " " + car.getModel() + " is going " + car.getSpeed() + "MPH" +
                    "and has " + car.getGas() + "% of its gas left. ");
        }

        mainMenu.menu(car);
    }
    public void slowCar(Car car) {
        for(int seconds = 0; seconds <=5; seconds --) {
            //get current gas
            //get current speed

            car.setSpeed(car.getSpeed() - 1);
            car.setGas(car.getGas() - 1);

            System.out.println("The " + car.getMake() + " " + car.getModel() + " is going " + car.getSpeed() + "MPH" +
                    "and has " + car.getGas() + "% of its gas left. ");
        }
    }

    public void addGas(Car car) {
        car.setGas(100);
        System.out.println("The" + car.getMake()  + car.getModel() + "now has a full tank of gas.");
    }

}



