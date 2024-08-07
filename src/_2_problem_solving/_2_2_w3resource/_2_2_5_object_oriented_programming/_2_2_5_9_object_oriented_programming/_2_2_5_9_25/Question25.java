package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_25;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "Building" with attributes for address, number of floors, and total area. Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like number of apartments for residential and office space for commercial buildings. Implement a method to calculate the total rent for each subclass.</h2>
 */

public class Question25 {
    public static void main(final String[] ARGS) {
        final Building RESIDENTIAL_BUILDING = new ResidentialBuilding("Address1, Address1, Address1", 5, 150, 5, 30);
        RESIDENTIAL_BUILDING.printInformation();

        System.out.println();

        final Building COMMERIAL_BUILDING = new CommercialBuilding("Address2, Address2, Address2", 8, 250, 8, 50);
        COMMERIAL_BUILDING.printInformation();
    }
}

class Building {
    private final String ADDRESS;
    private final int NUMBER_OF_FLOORS;
    private final float TOTAL_AREA;

    Building(final String ADDRESS, final int NUMBER_OF_FLOORS, final float TOTAL_AREA) {
        this.ADDRESS = ADDRESS;
        this.NUMBER_OF_FLOORS = NUMBER_OF_FLOORS;
        this.TOTAL_AREA = TOTAL_AREA;
    }

    String getAddress() {
        return ADDRESS;
    }

    int getNumberOfFloors() {
        return NUMBER_OF_FLOORS;
    }

    float getTotalArea() {
        return TOTAL_AREA;
    }

    void printInformation() {
        System.out.printf(
                "Address: %s%nNumber of Floors: %s%nTotal Area: %.3f Square Meter%n",
                getAddress(),
                getNumberOfFloors(),
                getTotalArea()
        );
    }
}

class ResidentialBuilding extends Building {
    private final int NUMBER_OF_APARTMENTS;
    private final float RENT_PER_NUMBER_OF_APARTMENTS;

    ResidentialBuilding(final String ADDRESS, final int NUMBER_OF_FLOORS, final float TOTAL_AREA, final int NUMBER_OF_APARTMENTS, final float RENT_PER_OFFICE_SPACE) {
        super(ADDRESS, NUMBER_OF_FLOORS, TOTAL_AREA);
        this.NUMBER_OF_APARTMENTS = NUMBER_OF_APARTMENTS;
        this.RENT_PER_NUMBER_OF_APARTMENTS = RENT_PER_OFFICE_SPACE;
    }

    int getNumberOfApartments() {
        return NUMBER_OF_APARTMENTS;
    }

    private float getRentPerNumberOfApartments() {
        return RENT_PER_NUMBER_OF_APARTMENTS;
    }

    float calculateTotalRent() {
        return NUMBER_OF_APARTMENTS * getRentPerNumberOfApartments();
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.printf(
                "Number of Apartments: %d%nTotal Rent: £%f%n",
                getNumberOfApartments(),
                calculateTotalRent()
        );
    }
}

class CommercialBuilding extends Building {
    private final int OFFICE_SPACE;
    private final float RENT_PER_OFFICE_SPACE;

    CommercialBuilding(final String ADDRESS, final int NUMBER_OF_FLOORS, final float TOTAL_AREA, final int OFFICE_SPACE, final float RENT_PER_OFFICE_SPACE) {
        super(ADDRESS, NUMBER_OF_FLOORS, TOTAL_AREA);
        this.OFFICE_SPACE = OFFICE_SPACE;
        this.RENT_PER_OFFICE_SPACE = RENT_PER_OFFICE_SPACE;
    }

    int getOfficeSpace() {
        return OFFICE_SPACE;
    }

    private float getRentPerOfficeSpace() {
        return RENT_PER_OFFICE_SPACE;
    }

    float calculateTotalRent() {
        return OFFICE_SPACE * getRentPerOfficeSpace();
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.printf(
                "Office Space: %d%nTotal Rent: £%f%n",
                getOfficeSpace(),
                calculateTotalRent()
        );
    }
}