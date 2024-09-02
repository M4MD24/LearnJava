package _2_solving._2_4_satr._2_4_3_java_103._2_4_3_1_vehicle_management_system;

import _2_solving._2_4_satr._2_4_3_java_103._2_4_3_1_vehicle_management_system.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GarageManagement {
    final List<Vehicle> vehicles;

    public GarageManagement() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Done add (" + vehicle.getModel() + ")!\n");
    }

    public void removeByIndex(int index) {
        vehicles.remove(index);
        System.out.println("Done delete (" + index + ")!\n");
    }

    public void removeByModel(String model) {
        for (int index = 0; index < vehicles.size(); index++) {
            if (vehicles.get(index).getModel().equals(model)) {
                vehicles.remove(index);
                break;
            }
        }
        System.out.println("Done delete (" + model + ")!\n");
    }

    public Vehicle searchByIndex(int index) {
        return vehicles.get(index);
    }

    public Vehicle searchByModel(String model) {
        for (Vehicle vehicle : vehicles)
            if (vehicle.getModel().equals(model)) return vehicle;
        return null;
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) System.out.println("Nothing to show!");
        else {
            for (int index = 0; index < vehicles.size(); index++) {
                System.out.print(index + ", ");
                vehicles.get(index).displayInformation();
            }
        }
    }
}