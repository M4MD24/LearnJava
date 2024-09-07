package _2_solving._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle.types;

import _2_solving._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle.Vehicle;

public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle() {
        setType(Motorcycle.class.getSimpleName());
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInformation() {
        System.out.println(getType() + ", " + getModel() + ", " + getYear() + ", " + getCountry() + ", Engine Capacity: " + getEngineCapacity());
    }
}