package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_4_builder_pattern.second_example.model.car;

public class Car {
    private final CarData CAR_DATA = new CarData();

    public Car() {

    }

    Car(
            final int ID,
            final String BRAND,
            final String MODEL,
            final String COLOR,
            final int NUMBER_OF_DOORS,
            final String GLASS_TYPE,
            final double WEIGHT,
            final double HEIGHT
    ) {
        CAR_DATA.id = ID;
        CAR_DATA.brand = BRAND;
        CAR_DATA.model = MODEL;
        CAR_DATA.color = COLOR;
        CAR_DATA.numberOfDoors = NUMBER_OF_DOORS;
        CAR_DATA.glassType = GLASS_TYPE;
        CAR_DATA.weight = WEIGHT;
        CAR_DATA.height = HEIGHT;
    }

    public CarBuilder builder() {
        return new CarBuilder();
    }

    public void printCarInformation() {
        System.out.printf("""
                        ID: %d
                        Brand: %s
                        Model: %s
                        Color: %s
                        Number of Doors: %d
                        Glass Type: %s
                        Weight: %f
                        Height: %f
                        """,
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