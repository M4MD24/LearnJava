package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_4_builder_pattern.first_example;

import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_4_builder_pattern.first_example.model.car.Car;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_4_builder_pattern.first_example.model.car.CarBuilder;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_4_builder_pattern.first_example.model.car.Director;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.id(101)
                .model("Corolla")
                .color("Red")
                .numberOfDoors(4)
                .glassType("Tempered")
                .weight(1300.5F)
                .height(1.45F);
        Director director = new Director();
        director.buildToyota(carBuilder);
        Car car = carBuilder.build();
        car.printCarInformation();
    }
}