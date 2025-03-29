package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_102;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a given string to int, long, floating and double.</h2>
 */

public class Question102 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(convertTextToTargetNumericType("123456789", NumericType.Integer));
    }

    private static Number convertTextToTargetNumericType(final String TEXT, final NumericType NUMERIC_TYPE) {
        return switch (NUMERIC_TYPE) {
            case Byte -> Byte.parseByte(TEXT);
            case Short -> Short.parseShort(TEXT);
            case Integer -> Integer.parseInt(TEXT);
            case Long -> Long.parseLong(TEXT);
            case Float -> Float.parseFloat(TEXT);
            case Double -> Double.parseDouble(TEXT);
        };
    }
}