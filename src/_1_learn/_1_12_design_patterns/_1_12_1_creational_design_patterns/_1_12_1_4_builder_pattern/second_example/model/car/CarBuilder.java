package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_4_builder_pattern.second_example.model.car;

public class CarBuilder implements Builder {
    private final CarData CAR_DATA = new CarData();

    @Override
    public CarBuilder id(final int ID) {
        CAR_DATA.id = ID;
        return this;
    }

    @Override
    public CarBuilder brand(final String BRAND) {
        CAR_DATA.brand = BRAND;
        return this;
    }

    @Override
    public CarBuilder model(final String MODEL) {
        CAR_DATA.model = MODEL;
        return this;
    }

    @Override
    public CarBuilder color(final String COLOR) {
        CAR_DATA.color = COLOR;
        return this;
    }

    @Override
    public CarBuilder numberOfDoors(final int NUMBER_OF_DOORS) {
        CAR_DATA.numberOfDoors = NUMBER_OF_DOORS;
        return this;
    }

    @Override
    public CarBuilder glassType(final String GLASS_TYPE) {
        CAR_DATA.glassType = GLASS_TYPE;
        return this;
    }

    @Override
    public CarBuilder weight(final double WEIGHT) {
        CAR_DATA.weight = WEIGHT;
        return this;
    }

    @Override
    public CarBuilder height(final double HEIGHT) {
        CAR_DATA.height = HEIGHT;
        return this;
    }

    public Car build() {
        return new Car(
                CAR_DATA.id,
                CAR_DATA.brand,
                CAR_DATA.model,
                CAR_DATA.color,
                CAR_DATA.numberOfDoors,
                CAR_DATA.glassType,
                CAR_DATA.weight,
                CAR_DATA.height
        );
    }
}