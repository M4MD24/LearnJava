package _2_problem_solving._2_4_satr._2_4_3_java_103;

import _2_problem_solving._2_4_satr._2_4_3_java_103.vehicle.types.Car;
import _2_problem_solving._2_4_satr._2_4_3_java_103.vehicle.types.Motorcycle;
import _2_problem_solving._2_4_satr._2_4_3_java_103.vehicle.types.Truck;

import java.util.Scanner;

public class VehicleManagementSystem {
    private static final Scanner INPUT = new Scanner(System.in);
    private static boolean isOn = true;
    private static int choice;
    private static final GarageManagement GARAGE_MANAGEMENT = new GarageManagement();

    public static void main(String[] args) {
        while (isOn) mainMenu();
    }

    private static void displayMainMenu() {
        System.out.println("0. End Program");
        System.out.println("1. Add Vehicle");
        System.out.println("2. Show Vehicles");
        System.out.println("3. Delete Vehicles");
        System.out.print("Select number: ");
    }

    private static void mainMenu() {
        displayMainMenu();
        choice = INPUT.nextInt();
        switch (choice) {
            case 0:
                isOn = false;
                return;
            case 1:
                System.out.println();
                addMenu();
                break;
            case 2:
                GARAGE_MANAGEMENT.displayAllVehicles();
                System.out.println();
                break;
            case 3:
                if (GARAGE_MANAGEMENT.vehicles.isEmpty()) System.out.println("Nothing to delete!\n");
                else deleteMenu();
                break;
        }
    }

    private static void displayAddMenu() {
        System.out.println("0. Back to Main Menu");
        System.out.println("1. Add Car");
        System.out.println("2. Add Motorcycle");
        System.out.println("3. Add Truck");
        System.out.print("Select number: ");
    }

    private static void addMenu() {
        displayAddMenu();
        choice = INPUT.nextInt();
        switch (choice) {
            case 0:
                backToMainMenu();
                break;
            case 1:
                addCar();
                break;
            case 2:
                addMotorcycle();
                break;
            case 3:
                addTruck();
                break;
        }
    }

    private static void addCar() {
        Car car = new Car();
        addCarDetails(car);
        GARAGE_MANAGEMENT.addVehicle(car);
    }

    private static void addCarDetails(Car car) {
        System.out.print("Enter model: ");
        String model = INPUT.next();
        car.setModel(model);

        System.out.print("Enter year: ");
        int year = INPUT.nextInt();
        car.setYear(year);

        System.out.print("Enter country: ");
        String country = INPUT.next();
        car.setCountry(country);

        System.out.print("Enter seats: ");
        int seats = INPUT.nextInt();
        car.setNumberOfSeats(seats);
    }

    private static void addMotorcycle() {
        Motorcycle motorcycle = new Motorcycle();
        addMotorCycleDetails(motorcycle);
        GARAGE_MANAGEMENT.addVehicle(motorcycle);
    }

    private static void addMotorCycleDetails(Motorcycle motorcycle) {
        System.out.print("Enter model: ");
        String model = INPUT.next();
        motorcycle.setModel(model);

        System.out.print("Enter year: ");
        int year = INPUT.nextInt();
        motorcycle.setYear(year);

        System.out.print("Enter country: ");
        String country = INPUT.next();
        motorcycle.setCountry(country);

        System.out.print("Enter engine capacity: ");
        int engineCapacity = INPUT.nextInt();
        motorcycle.setEngineCapacity(engineCapacity);
    }

    private static void addTruck() {
        Truck truck = new Truck();
        addTruckDetails(truck);
        GARAGE_MANAGEMENT.addVehicle(truck);
    }

    private static void addTruckDetails(Truck truck) {
        System.out.print("Enter model: ");
        String model = INPUT.next();
        truck.setModel(model);

        System.out.print("Enter year: ");
        int year = INPUT.nextInt();
        truck.setYear(year);

        System.out.print("Enter country: ");
        String country = INPUT.next();
        truck.setCountry(country);

        System.out.print("Enter capacity: ");
        int capacity = INPUT.nextInt();
        truck.setCapacity(capacity);
    }

    private static void displayDeleteMenu() {
        System.out.println("0. Back to Main Menu");
        System.out.println("1. Delete by Index");
        System.out.println("2. Delete by Model");
    }

    private static void deleteMenu() {
        System.out.println();
        GARAGE_MANAGEMENT.displayAllVehicles();
        System.out.println("---");
        displayDeleteMenu();
        System.out.print("Select number: ");
        choice = INPUT.nextInt();
        switch (choice) {
            case 0:
                backToMainMenu();
                break;
            case 1:
                deleteByIndex();
                break;
            case 2:
                deleteByModel();
                break;
        }
    }

    private static void deleteByIndex() {
        System.out.print("Choose number from vehicles list: ");
        GARAGE_MANAGEMENT.removeByIndex(INPUT.nextInt());
    }

    private static void deleteByModel() {
        System.out.print("Enter model from vehicles list: ");
        GARAGE_MANAGEMENT.removeByModel(INPUT.next());
    }

    private static void backToMainMenu() {
        System.out.println();
        mainMenu();
    }
}