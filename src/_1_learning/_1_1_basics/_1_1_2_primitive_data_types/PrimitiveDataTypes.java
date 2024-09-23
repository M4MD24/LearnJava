package _1_learning._1_1_basics._1_1_2_primitive_data_types;

public class PrimitiveDataTypes {
    public static void main(final String[] PARAMETERS) {
        /* Primitive Data Types And Sizes! */
        /* Integer -> byte (1 byte),
         *            short (2 bytes),
         *            int (4 bytes),
         *            long (8 bytes)
         * Float -> float (4 bytes),
         *          double (8 bytes)
         * Boolean -> false, true (1 byte)
         * Character -> char (2 bytes)
         */

//        Integer
        byte byteVariable = 127;
        System.out.println("\nbyteVariable                  : " + byteVariable);
        byte byteVariable2 = 'A';
        System.out.println("byteVariable2                 : " + byteVariable2);

        short shortVariable = 32_767;
        System.out.println("\nshortVariable                 : " + shortVariable);
        short shortVariable2 = 'A';
        System.out.println("shortVariable2                : " + shortVariable2);

        int intVariable = 2_147_483_647;
        System.out.println("\nintVariable                   : " + intVariable);
        int intVariable2 = 'A';
        System.out.println("intVariable2                  : " + intVariable2);

        long longVariable = 9_223_372_036_854_775_807L;
        System.out.println("\nlongVariable                  : " + longVariable);
        long longVariable2 = 'A';
        System.out.println("longVariable2                 : " + longVariable2);

//        Float
        float floatVariable = 3.4028235E38F;
        System.out.println("\nfloatVariable                 : " + floatVariable);
        float floatVariable2 = 'A';
        System.out.println("floatVariable2                : " + floatVariable2);

        double doubleVariable = 1.7976931348623157E308;
        System.out.println("\ndoubleVariable                : " + doubleVariable);
        double doubleVariable2 = 'A';
        System.out.println("doubleVariable2               : " + doubleVariable2);

//        Boolean
        boolean booleanVariable = true;
        System.out.println("\nbooleanVariable               : " + booleanVariable);
        boolean booleanVariable2 = false;
        System.out.println("booleanVariable2              : " + booleanVariable2);

//        Character
        char charVariable = 'A';
        System.out.println("\ncharVariable                  : " + charVariable);
        char charVariable2 = '\uFFFF';
        System.out.println("charVariable2                 : " + charVariable2);
        char charVariable3 = 65535;
        System.out.println("charVariable3                 : " + charVariable3);

        var intVar = 100; // int
        System.out.println("intVar                        : " + intVar);

        var doubleVar = 1.90; // double
        System.out.println("doubleVar                     : " + doubleVar);

        var charVar = 'a'; // char
        System.out.println("charVar                       : " + charVar);

        var stringVar = "Aa"; // string
        System.out.println("stringVar                     : " + stringVar);

        var booleanVar = true; // boolean
        System.out.println("booleanVar                    : " + booleanVar);
    }
}