package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void createCar() {

            System.out.println("What kind of car would you like to create?");
            System.out.println("1. Custom \n2. Ready to go \n3. Exit ");

            try {
                switch (input.nextInt()) {
                    case 1:
                        Car car = new Car();
                        car.getCarInfo();
                        menu(car);
                        break;
                    case 2:
                        Corvette corvette;
                        corvette = new Corvette (2003, "Corvette", "206", 0, 100);
                        corvette.getCorvetteInfo();
                        break;
                    case 3:
                        //exit
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please enter a number between 1 and 3.");
                        createCar();

                }

            } catch (InputMismatchException ime) {
                input.nextLine();
                System.out.println("Please enter a number between 1 and 3.");
                createCar();

            }
        }



    public void menu(Car car) {

        System.out.println("What would you like to do with the " + car.getMake() + " " + car.getModel() + "?");
        System.out.println("1. Accelerate \n2. Decelerate \n3. Fill up with gas \n4. Exit ");

        try {
            switch (input.nextInt()) {
                case 1:
                    //accelerate
                    car.driveCar(car);
                case 2:
                    //decelerate
                    car.slowCar(car);
                case 3:
                    //fill w gas
                    car.addGas(car);
                case 4:
                    //exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
                    menu(car);

            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number between 1 and 4.");
            menu(car);

        }
    }
}