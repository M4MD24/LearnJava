package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_7_encapsulation._2_2_1_1_5_7_11;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called House with private instance variables address, numberOfRooms, and area. Provide public getter and setter methods to access and modify these variables. Add a method called calculatePrice() that returns the price of the house based on its area and a price per square meter.</h2>
 */

public class Question11 {
    public static void main(final String[] ARGUMENTS) {
        final House HOUSE = new House();
        HOUSE.setAddress("The Address");
        HOUSE.setNumberOfRooms(3);
        HOUSE.setArea(110);
        System.out.printf("""
                        Address: %s
                        Number of Rooms: %d
                        Area: %f sqm
                        Price Per Square Meter: %f £""",
                HOUSE.getAddress(),
                HOUSE.getNumberOfRooms(),
                HOUSE.getArea(),
                HOUSE.calculatePrice(1200));
    }
}

class House {
    private String address;
    private int numberOfRooms;
    private float area;

    public String getAddress() {
        return address;
    }

    public void setAddress(final String ADDRESS) {
        this.address = ADDRESS;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(final int NUMBER_OF_ROOMS) {
        this.numberOfRooms = NUMBER_OF_ROOMS;
    }

    public float getArea() {
        return area;
    }

    public void setArea(final float AREA) {
        this.area = AREA;
    }

    float calculatePrice(final int pricePerSquareMeter) {
        return area * pricePerSquareMeter;
    }
}