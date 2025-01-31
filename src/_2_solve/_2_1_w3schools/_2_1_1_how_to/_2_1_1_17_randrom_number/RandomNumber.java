package _2_solve._2_1_w3schools._2_1_1_how_to._2_1_1_17_randrom_number;

public class RandomNumber {
    public static void main(final String[] ARGUMENTS) {
        printRandomNumberFromFirstNumberToSecondNumber(5, 10);
    }

    private static void printRandomNumberFromFirstNumberToSecondNumber(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        System.out.print(
                FIRST_NUMBER +
                        (int) (
                                Math.random() *
                                        (
                                                SECOND_NUMBER -
                                                        FIRST_NUMBER +
                                                        1
                                        )
                        )
        );
    }
}