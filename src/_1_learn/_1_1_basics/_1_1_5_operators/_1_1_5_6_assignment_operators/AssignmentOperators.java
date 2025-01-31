package _1_learn._1_1_basics._1_1_5_operators._1_1_5_6_assignment_operators;

public class AssignmentOperators {
    public static void main(final String[] ARGUMENTS) {
        /* Assignment Operators Types! */
        /* ( = ) Assignment
         * ( += ) Addition Assignment
         * ( -= ) Subtraction Assignment
         * ( *= ) Multiplication Assignment
         * ( /= ) Division Assignment
         * ( %= ) Modulus Assignment
         * ( &= ) Bitwise AND Assignment
         * ( |= ) Bitwise OR Assignment
         * ( ^= ) Bitwise XOR Assignment
         * ( >>= ) Right Shift Assignment
         * ( <<= ) Left Shift Assignment
         * */

        int number = 3;

//        Assignment
        int assignment = 10;
        assignment = number; // Assignment
        System.out.println("Assignment = " + assignment);

        int assignment2 = 10;
        int assignment3 = 20;
        assignment2 = assignment3 = number; // Assignment
        System.out.println("Assignment2 = " + assignment2 + "\nAssignment3 = " + assignment3);

//        Addition Assignment
        int additionAssignment = 10;
        additionAssignment += number; // Addition Assignment ( additionAssignment = additionAssignment + number )
        System.out.println("Addition Assignment = " + additionAssignment);

//        Subtraction Assignment
        int subtractionAssignment = 10;
        subtractionAssignment -= number; // Subtraction Assignment ( subtractionAssignment = subtractionAssignment - number )
        System.out.println("Subtraction Assignment = " + subtractionAssignment);

//        Multiplication Assignment
        int multiplicationAssignment = 10;
        multiplicationAssignment *= number; // Multiplication Assignment ( multiplicationAssignment = multiplicationAssignment * number )
        System.out.println("Multiplication Assignment = " + multiplicationAssignment);

//        Division Assignment
        int divisionAssignment = 10;
        divisionAssignment /= number; // Division Assignment ( divisionAssignment = divisionAssignment / number )
        System.out.println("Division Assignment = " + divisionAssignment);

//        Modulus Assignment
        int modulusAssignment = 10;
        modulusAssignment %= number; // Modulus Assignment ( modulusAssignment = modulusAssignment % number )
        System.out.println("Modulus Assignment = " + modulusAssignment);

        /* AND Assignment: Performs a bitwise AND operation and assigns the result to 'andAssignment'. */
        int andAssignment = 10;
        andAssignment &= number; // AND Assignment ( andAssignment = andAssignment & number )
        System.out.println("Bitwise AND Assignment = " + andAssignment);

        /* OR Assignment: Performs a bitwise OR operation and assigns the result to 'orAssignment'. */
        int orAssignment = 10;
        orAssignment |= number; // OR Assignment ( orAssignment = orAssignment | number )
        System.out.println("Bitwise OR Assignment = " + orAssignment);

        /* XOR Assignment: Performs a bitwise XOR operation and assigns the result to 'xorAssignment'. */
        int xorAssignment = 10;
        xorAssignment ^= number; // XOR Assignment ( xorAssignment = xorAssignment ^ number )
        System.out.println("Bitwise XOR Assignment = " + xorAssignment);

        /* Right Shift Assignment: Shifts the bits of 'rightShiftAssignment' to the right by 'number' positions and assigns the result to 'rightShiftAssignment'. */
        int rightShiftAssignment = 10;
        rightShiftAssignment >>= number; // Right Shift Assignment ( rightShiftAssignment = rightShiftAssignment >> number )
        System.out.println("Right Shift Assignment = " + rightShiftAssignment);

        /* Left Shift Assignment: Shifts the bits of 'leftShiftAssignment' to the left by 'number' positions and assigns the result to 'leftShiftAssignment'. */
        int leftShiftAssignment = 10;
        leftShiftAssignment >>= number; // Left Shift Assignment ( leftShiftAssignment = leftShiftAssignment << number )
        System.out.println("Left Shift Assignment = " + leftShiftAssignment);
    }
}