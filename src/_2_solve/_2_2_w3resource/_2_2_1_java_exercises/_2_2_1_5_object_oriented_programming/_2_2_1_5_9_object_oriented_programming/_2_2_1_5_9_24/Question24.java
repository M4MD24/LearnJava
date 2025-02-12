package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_9_object_oriented_programming._2_2_1_5_9_24;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price. Implement methods to apply a discount and calculate the final price. Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.</h2>
 */

public class Question24 {
    public static void main(final String[] ARGUMENTS) {
        final WashingMachine WASHING_MACHINE = new WashingMachine("0987654321", "Fresh", 462, 5);
        WASHING_MACHINE.extendWarranty(3);
        System.out.printf("Id: %s%nName: %s%nPrice: £%f%nWarranty Period: %d%n",
                WASHING_MACHINE.getId(),
                WASHING_MACHINE.getName(),
                WASHING_MACHINE.getPrice(),
                WASHING_MACHINE.getWarrantyPeriod());
        WASHING_MACHINE.applyDiscount(50);
        System.out.print("Warranty Period: £" + WASHING_MACHINE.calculatePriceAfterDiscount());
    }
}

class ElectricProduct {
    private final String ID,
            NAME;
    private final float PRICE;
    private float percent;

    ElectricProduct(final String ID, final String NAME, final float PRICE) {
        this.ID = ID;
        this.NAME = NAME;
        this.PRICE = PRICE;
    }

    String getId() {
        return ID;
    }

    String getName() {
        return NAME;
    }

    float getPrice() {
        return PRICE;
    }

    void applyDiscount(final float PERCENT) {
        percent = PERCENT;
    }

    float calculatePriceAfterDiscount() {
        return (PRICE / 100) * percent;
    }
}

class WashingMachine extends ElectricProduct {
    private int warrantyPeriod;

    WashingMachine(final String ID, final String NAME, final float PRICE, final int WARRANTY_PERIOD) {
        super(ID, NAME, PRICE);
        warrantyPeriod = WARRANTY_PERIOD;
    }

    int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    void extendWarranty(final int WARRANTY_PERIOD) {
        warrantyPeriod += WARRANTY_PERIOD;
    }
}