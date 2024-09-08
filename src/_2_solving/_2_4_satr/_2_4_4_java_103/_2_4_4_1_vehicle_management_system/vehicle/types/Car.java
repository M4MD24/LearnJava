package _2_solving._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle.types;

import _2_solving._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle.Vehicle;

public class Car extends Vehicle {
    private byte numberOfSeats;

    public Car() {
        setType(Car.class.getSimpleName());
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(byte numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInformation() {
        System.out.println(getType() + ", " + getModel() + ", " + getYear() + ", " + getCountry() + ", Seats: " + getNumberOfSeats());
    }
}