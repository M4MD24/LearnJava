package _1_learning._1_2_testing;

public class TestingExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(new TestingExample().sumTwoNumbers(12, 12));
        System.out.print(new TestingExample().dayWeek(7));
    }

    protected int sumTwoNumbers(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return FIRST_NUMBER + SECOND_NUMBER;
    }

    protected String dayWeek(final int DAY_NUMBER) {
        return switch (DAY_NUMBER) {
            case 1 -> "Saturday";
            case 2 -> "Sunday";
            case 3 -> "Monday";
            case 4 -> "Tuesday";
            case 5 -> "Wednesday";
            case 6 -> "Thursday";
            case 7 -> "Friday";
            default -> "Enter a number between 1:7";
        };
    }
}