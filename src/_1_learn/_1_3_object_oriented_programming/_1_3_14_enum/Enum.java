package _1_learn._1_3_object_oriented_programming._1_3_14_enum;

enum Size {

    /* The enum constants are usually represented in uppercase! */
    SMALL, MEDIUM, LARGE;

    String getSize() {
        return switch (this) {
            case SMALL -> "Small Size";
            case MEDIUM -> "MEDIUM Size";
            case LARGE -> "LARGE Size";
        };
    }

    public static void main(final String[] ARGUMENTS) {
        // getSize
        System.out.println("getSize: " + Size.SMALL.getSize());

        // ordinal() Method
        int smallOrdinal = Size.SMALL.ordinal();
        System.out.println("Ordinal of SMALL: " + smallOrdinal);

        // compareTo() Method
        int comparisonResult = Size.SMALL.compareTo(Size.MEDIUM);
        System.out.println("Comparison result between SMALL and MEDIUM: " + comparisonResult);

        // toString() Method
        String smallToString = Size.SMALL.toString();
        System.out.println("String representation of SMALL: " + smallToString);

        // name() Method
        String smallName = Size.SMALL.name();
        System.out.println("Name of SMALL: " + smallName);

        // valueOf() Method
        Size mediumEnum = Size.valueOf("MEDIUM");
        System.out.println("SortingStatus constant for MEDIUM: " + mediumEnum);

        // values() Method
        Size[] enumArray = Size.values();
        System.out.println("SortingStatus constants in Size enum:");
        for (Size size : enumArray) {
            System.out.println("" + size);
        }
    }
}