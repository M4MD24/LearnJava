package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_4_builder_pattern.first_example.model.car;

public class Director {
    public void buildSeat(CarBuilder builder) {
        builder.brand("Seat");
    }

    public void buildToyota(CarBuilder builder) {
        builder.brand("Toyota");
    }
}