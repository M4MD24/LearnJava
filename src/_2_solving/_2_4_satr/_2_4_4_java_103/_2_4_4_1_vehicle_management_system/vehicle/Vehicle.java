package _2_solving._2_4_satr._2_4_4_java_103._2_4_4_1_vehicle_management_system.vehicle;

public abstract class Vehicle {
    private String type;
    private String model;
    private int year;
    private String country;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public abstract void displayInformation();
}