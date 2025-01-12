package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_4_builder_pattern.first_example.model.car;

public interface Builder {
    Builder id(final int ID);

    Builder brand(final String BRAND);

    Builder model(final String MODEL);

    Builder color(final String COLOR);

    Builder numberOfDoors(final int NUMBER_OF_DOORS);

    Builder glassType(final String GLASS_TYPE);

    Builder weight(final double WEIGHT);

    Builder height(final double HEIGHT);
}