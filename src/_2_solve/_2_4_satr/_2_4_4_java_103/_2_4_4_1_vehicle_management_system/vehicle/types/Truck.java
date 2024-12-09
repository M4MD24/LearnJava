package _2_solve._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle.types;

import _2_solve._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle.Vehicle;

public class Truck extends Vehicle {
    private int capacity;

    public Truck() {
        setType(Truck.class.getSimpleName());
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void displayInformation() {
        System.out.println(getType() + ", " + getModel() + ", " + getYear() + ", " + getCountry() + ", Capacity: " + getCapacity());
    }
}