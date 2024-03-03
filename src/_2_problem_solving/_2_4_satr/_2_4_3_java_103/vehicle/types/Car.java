package _2_problem_solving._2_4_satr._2_4_3_java_103.vehicle.types;

import _2_problem_solving._2_4_satr._2_4_3_java_103.vehicle.Vehicle;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car() {
        setType(Car.class.getSimpleName());
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println(getType() + ", " + getModel() + ", " + getYear() + ", " + getCountry() + ", Seats: " + getNumberOfSeats());
    }
}