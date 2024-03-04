package _2_problem_solving._2_4_satr._2_4_3_java_103.vehicle.types;

import _2_problem_solving._2_4_satr._2_4_3_java_103.vehicle.Vehicle;

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