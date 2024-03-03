package _2_problem_solving._2_4_satr._2_4_3_java_103.vehicle.types;

import _2_problem_solving._2_4_satr._2_4_3_java_103.vehicle.Vehicle;

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
    public void displayInfo() {
        System.out.println(getType() + ", " + getModel() + ", " + getYear() + ", " + getCountry() + ", Engine Capacity: " + getEngineCapacity());
    }
}