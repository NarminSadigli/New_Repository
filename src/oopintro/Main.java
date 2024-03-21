package oopintro;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cars: ");
        int numberOfCar = scanner.nextInt();
        System.out.print("Enter the make: ");
        String make = scanner.next();
        System.out.print("Enter the model: ");
        String model = scanner.next();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        Car car = new Car(make, model, year);
        System.out.println("number of cars: " + numberOfCar);
        car.setMake(make);
        System.err.println("Make is " + car.getMake());
        car.setModel(model);
        System.err.println("Model of car is " + car.getModel());
        car.setYear(year);
        System.err.println("Year is " + car.getYear());
        car.displayInfo();
        System.err.println("Max speed of the car is " + Car.getMaxSpeedLimit());

    }
}
