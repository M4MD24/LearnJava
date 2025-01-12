package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_4_builder_pattern.second_example;

import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_4_builder_pattern.second_example.model.car.Car;

public class Main {
    public static void main(final String[] PARAMETERS) {
        Car car = new Car().builder()
                .id(101)
                .brand("Toyota")
                .model("Corolla")
                .color("Red")
                .numberOfDoors(4)
                .glassType("Tempered")
                .weight(1300.5F)
                .height(1.45F)
                .build();
        car.printCarInformation();
    }
}