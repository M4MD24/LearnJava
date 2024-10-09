package _2_solving._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system;

import _2_solving._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle.Vehicle;
import _2_solving._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle.types.Car;
import _2_solving._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle.types.Motorcycle;
import _2_solving._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle.types.Truck;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleManagementSystem {
    private static final Scanner INPUT = new Scanner(System.in);
    private static boolean isOn = true,
        onUpdateLine = false;
    private static int choice;
    private static String type;
    private static final String CAR = "Car",
        MOTORCYCLE = "Motorcycle",
        TRUCK = "Truck";
    private static final GarageManagement GARAGE_MANAGEMENT = new GarageManagement();

    public static void main(final String[] PARAMETERS) {
        while (isOn) mainMenu();
    }

    private static void displayMainMenu() {
        System.out.println("0. End Program");
        System.out.println("1. Add Vehicle");
        System.out.println("2. Update Vehicle");
        System.out.println("3. Show All Vehicles");
        System.out.println("4. Show Vehicle Details");
        System.out.println("5. Delete Vehicle");
        System.out.print("Select number: ");
    }

    private static void mainMenu() {
        displayMainMenu();
        try {
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
                    if (GARAGE_MANAGEMENT.vehicles.isEmpty()) System.out.println("Nothing to update!\n");
                    else {
                        onUpdateLine = true;
                        System.out.println();
                        searchMenu();
                    }
                    break;
                case 3:
                    GARAGE_MANAGEMENT.displayAllVehicles();
                    System.out.println();
                    break;
                case 4:
                    if (GARAGE_MANAGEMENT.vehicles.isEmpty()) System.out.println("Nothing to show!\n");
                    else {
                        System.out.println();
                        searchMenu();
                    }
                    break;
                case 5:
                    if (GARAGE_MANAGEMENT.vehicles.isEmpty()) System.out.println("Nothing to delete!\n");
                    else {
                        System.out.println();
                        deleteMenu();
                    }
                    break;
                default:
                    System.out.println("Select valid number from list!\n");
                    break;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Select valid number from list!\n");
            INPUT.next();
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
        try {
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
                default:
                    System.out.println("Select valid number from list!\n");
                    addMenu();
                    break;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Select valid number from list!\n");
            INPUT.next();
            addMenu();
        }
    }

    private static void addVehicleDetails(Vehicle vehicle) {
        System.out.print("Enter model: ");
        vehicle.setModel(INPUT.next());

        System.out.print("Enter year: ");
        try {
            vehicle.setYear(INPUT.nextInt());
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            System.out.print("Enter valid year: ");
            vehicle.setYear(INPUT.nextInt());
        }

        System.out.print("Enter country: ");
        vehicle.setCountry(INPUT.next());
    }

    private static void addCar() {
        Car car = new Car();
        addCarDetails(car);
        GARAGE_MANAGEMENT.addVehicle(car);
    }

    private static void addCarDetails(Car car) {
        addVehicleDetails(car);

        System.out.print("Enter seats: ");
        try {
            car.setNumberOfSeats(INPUT.nextByte());
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            System.out.print("Enter valid seats: ");
            car.setNumberOfSeats(INPUT.nextByte());
        }
    }

    private static void addMotorcycle() {
        Motorcycle motorcycle = new Motorcycle();
        addMotorCycleDetails(motorcycle);
        GARAGE_MANAGEMENT.addVehicle(motorcycle);
    }

    private static void addMotorCycleDetails(Motorcycle motorcycle) {
        addVehicleDetails(motorcycle);

        System.out.print("Enter engine capacity: ");
        try {
            motorcycle.setEngineCapacity(INPUT.nextInt());
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            System.out.print("Enter valid engine capacity: ");
            motorcycle.setEngineCapacity(INPUT.nextInt());
        }
    }

    private static void addTruck() {
        Truck truck = new Truck();
        addTruckDetails(truck);
        GARAGE_MANAGEMENT.addVehicle(truck);
    }

    private static void addTruckDetails(Truck truck) {
        addVehicleDetails(truck);

        System.out.print("Enter capacity: ");
        try {
            truck.setCapacity(INPUT.nextInt());
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            System.out.print("Enter valid capacity: ");
            truck.setCapacity(INPUT.nextInt());
        }

        System.out.print("Enter capacity: ");
        truck.setCapacity(INPUT.nextInt());
    }

    private static void displaySearchMenu() {
        System.out.println("0. Back to Main Menu");
        System.out.println("1. Search by Index");
        System.out.println("2. Search by Model");
        System.out.print("Select number: ");
    }

    private static void searchMenu() {
        GARAGE_MANAGEMENT.displayAllVehicles();
        System.out.println("---");
        displaySearchMenu();
        try {
            choice = INPUT.nextInt();
            switch (choice) {
                case 0:
                    onUpdateLine = false;
                    backToMainMenu();
                    break;
                case 1:
                    searchByIndex();
                    break;
                case 2:
                    searchByModel();
                    break;
                default:
                    System.out.println("Select valid number from list!\n");
                    searchMenu();
                    break;
            }

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Select valid number from list!\n");
            INPUT.next();
            searchMenu();
        }
    }

    private static void searchByIndex() {
        System.out.print("Choose valid number from vehicles list: ");
        try {
            Vehicle vehicle = GARAGE_MANAGEMENT.searchByIndex(INPUT.nextInt());
            if (onUpdateLine) {
                showSelectedVehicle(vehicle);
                configureVehicleType(vehicle);
            } else {
                vehicle.displayInformation();
                backToMainMenu();
            }
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            searchByIndex();
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            searchByIndex();
        }
    }

    private static void searchByModel() {
        Vehicle vehicle = null;
        while (vehicle == null) {
            System.out.print("Enter valid model from vehicles list: ");
            vehicle = GARAGE_MANAGEMENT.searchByModel(INPUT.next());
        }
        showSelectedVehicle(vehicle);
        if (onUpdateLine) {
            showSelectedVehicle(vehicle);
            configureVehicleType(vehicle);
        } else {
            vehicle.displayInformation();
            backToMainMenu();
        }
    }

    private static void showSelectedVehicle(Vehicle vehicle) {
        System.out.println();
        vehicle.displayInformation();
        System.out.println("---");
    }

    private static void configureVehicleType(Vehicle vehicle) {
        type = vehicle.getType();
        updateMenu(vehicle);
    }

    private static void displayUpdateMenu() {
        System.out.println("0. Back to Main Menu");
        System.out.println("1. update model");
        System.out.println("2. update year");
        System.out.println("3. update country");
        System.out.print("4. update ");
        switch (type) {
            case CAR:
                System.out.println("seats");
                break;
            case MOTORCYCLE:
                System.out.println("engine capacity");
                break;
            case TRUCK:
                System.out.println("capacity");
                break;
        }
        System.out.print("Select number: ");
    }

    private static void updateMenu(Vehicle vehicle) {
        displayUpdateMenu();
        try {
            choice = INPUT.nextInt();
            switch (choice) {
                case 0:
                    onUpdateLine = false;
                    backToMainMenu();
                    break;
                case 1:
                    updateModel(vehicle);
                    break;
                case 2:
                    updateYear(vehicle);
                    break;
                case 3:
                    updateCountry(vehicle);
                    break;
                case 4:
                    switch (type) {
                        case CAR:
                            updateSeats((Car) vehicle);
                            break;
                        case MOTORCYCLE:
                            updateEngineCapacity((Motorcycle) vehicle);
                            break;
                        case TRUCK:
                            updateCapacity((Truck) vehicle);
                            break;
                    }
            }
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            System.out.println("Select valid number from list!\n");
            updateMenu(vehicle);
        }
    }

    private static void updateModel(Vehicle vehicle) {
        System.out.print("Update model: ");
        vehicle.setModel(INPUT.next());
        System.out.println("Done update (Model)!");
        onUpdateLine = false;
        backToMainMenu();
    }

    private static void updateYear(Vehicle vehicle) {
        System.out.print("Update valid year: ");
        try {
            vehicle.setYear(INPUT.nextInt());
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            updateYear(vehicle);
        }
        System.out.println("Done update (Year)!");
        onUpdateLine = false;
        backToMainMenu();
    }

    private static void updateCountry(Vehicle vehicle) {
        System.out.print("Update country: ");
        vehicle.setCountry(INPUT.next());
        System.out.println("Done update (Country)!");
        onUpdateLine = false;
        backToMainMenu();
    }

    private static void updateSeats(Car vehicle) {
        System.out.print("Update valid seats: ");
        try {
            vehicle.setNumberOfSeats(INPUT.nextByte());
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            updateSeats(vehicle);
        }
        System.out.println("Done update (Seats)!");
        onUpdateLine = false;
        backToMainMenu();
    }

    private static void updateEngineCapacity(Motorcycle vehicle) {
        System.out.print("Update valid engine capacity: ");
        try {
            vehicle.setEngineCapacity(INPUT.nextInt());
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            updateEngineCapacity(vehicle);
        }
        System.out.println("Done update (Engine Capacity)!");
        onUpdateLine = false;
        backToMainMenu();
    }

    private static void updateCapacity(Truck vehicle) {
        System.out.println("Update valid capacity: ");
        try {
            vehicle.setCapacity(INPUT.nextInt());
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            updateCapacity(vehicle);
        }
        System.out.println("Done update (Capacity)!");
        onUpdateLine = false;
        backToMainMenu();
    }

    private static void displayDeleteMenu() {
        System.out.println("0. Back to Main Menu");
        System.out.println("1. Delete by Index");
        System.out.println("2. Delete by Model");
    }

    private static void deleteMenu() {
        GARAGE_MANAGEMENT.displayAllVehicles();
        System.out.println("---");
        displayDeleteMenu();
        System.out.print("Select number: ");
        try {
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
                default:
                    System.out.println("Select valid number from list!\n");
                    deleteMenu();
                    break;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Select valid number from list!\n");
            INPUT.next();
            deleteMenu();
        }
    }

    private static void deleteByIndex() {
        System.out.print("Choose valid number from vehicles list: ");
        try {
            GARAGE_MANAGEMENT.removeByIndex(INPUT.nextInt());
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            deleteByIndex();
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            deleteByIndex();
        }
    }

    private static void deleteByModel() {
        System.out.print("Enter valid model from vehicles list: ");
        try {
            GARAGE_MANAGEMENT.removeByModel(INPUT.next());
        } catch (InputMismatchException inputMismatchException) {
            INPUT.next();
            deleteByModel();
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            deleteByModel();
        }
    }

    private static void backToMainMenu() {
        System.out.println();
        mainMenu();
    }
}