package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_7_encapsulation._2_2_1_5_7_6;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only provide a getter method for the mileage variable.</h2>
 */

public class Question6 {
    private static final Car CAR = new Car();

    public static void main(final String[] ARGUMENTS) {
        addDataCar();
        getInformationCar();
    }

    private static void getInformationCar() {
        System.out.printf("Company Name: %s%nYear: %d%nMileage: %f",
                CAR.getCompanyName(),
                CAR.getYear(),
                CAR.getMileage());
    }

    private static void addDataCar() {
        CAR.setCompanyName("Toyota");
        CAR.setYear(2018);
        CAR.setMileage(50_000);
    }
}

class Car {
    private String companyName;
    private int year;
    private float mileage;

    String getCompanyName() {
        return companyName;
    }

    void setCompanyName(final String COMPANY_NAME) {
        companyName = COMPANY_NAME;
    }

    int getYear() {
        return year;
    }

    void setYear(final int YEAR) {
        year = YEAR;
    }

    float getMileage() {
        return mileage;
    }

    void setMileage(final float MILEAGE) {
        mileage = MILEAGE;
    }
}