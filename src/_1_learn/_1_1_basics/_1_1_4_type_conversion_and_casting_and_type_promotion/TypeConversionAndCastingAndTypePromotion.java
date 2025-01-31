package _1_learn._1_1_basics._1_1_4_type_conversion_and_casting_and_type_promotion;

public class TypeConversionAndCastingAndTypePromotion {
    public static void main(final String[] ARGUMENTS) {
        int intVariable = 2_147_483_647;
        long longVariable = 9_223_372_036_854_775_807L;
        longVariable = intVariable; // Conversion
        System.out.println(longVariable);

        int intVariable2 = (int) longVariable; // Casting
        System.out.println(intVariable2);

        /* It isn't possible to make a conversion that a value of a small type is equal to a value of a large type! */
        /* ↓ Example
        int intVariable = 2_147_483_647;
        long longVariable = 9_223_372_036_854_775_807L;
        intVariable = longVariable;
        System.out.println(longVariable);
        */

        byte byteVariable = 5;
        byte byteVariable2 = 10;
        float floatVariable = byteVariable + byteVariable2; // Type Promotion
        System.out.print(floatVariable);
    }
}