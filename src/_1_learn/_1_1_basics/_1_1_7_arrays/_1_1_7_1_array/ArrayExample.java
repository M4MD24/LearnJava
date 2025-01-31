package _1_learn._1_1_basics._1_1_7_arrays._1_1_7_1_array;

public class ArrayExample {
    public static void main(final String[] ARGUMENTS) {
//        1D Dimensional Array
        byte[] byteArrayVariable = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println("byte Array Variable = " + byteArrayVariable[0]);
        byte[] byteArrayVariable2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("byte Array Variable 2 = " + byteArrayVariable2[0]);

        short[] shortArrayVariable = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000};
        System.out.println("short Array Variable = " + shortArrayVariable[0]);
        short[] shortArrayVariable2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("short Array Variable 2 = " + shortArrayVariable2[0]);

        int[] intArrayVariable = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000};
        System.out.println("int Array Variable = " + intArrayVariable[0]);
        int[] intArrayVariable2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("int Array Variable 2 = " + intArrayVariable2[0]);

        long[] longArrayVariable = {100000000, 200000000, 300000000, 400000000, 500000000, 600000000, 700000000, 800000000, 900000000};
        System.out.println("long Array Variable = " + longArrayVariable[0]);
        long[] longArrayVariable2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("long Array Variable 2 = " + longArrayVariable2[0]);

        boolean[] booleanArrayVariable = {true, false};
        System.out.println("boolean Array Variable = " + booleanArrayVariable[0]);

        char[] charArrayVariable = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("char Array Variable = " + charArrayVariable[0]);
        char[] charArrayVariable2 = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000};
        System.out.println("char Array Variable 2 = " + charArrayVariable2[0]);

        String[] stringArrayVariable = {"Aa", "Bb", "Cc", "Dd", "Ee", "Ff", "Gg", "Hh", "Ii", "Jj", "Kk", "Ll", "Mm", "Nn", "Oo", "Pp", "Qq", "Rr", "Ss", "Tt", "Uu", "Vv", "Ww", "Xx", "Yy", "Zz"};
        System.out.println("string Array Variable = " + stringArrayVariable[0]);

//        Edit Array:
        int[] array = {45, 32, 68};
        System.out.println("Before Edit: " + array[0]);
        array[0] = 5;
        System.out.println("After Edit: " + array[0]);
    }
}