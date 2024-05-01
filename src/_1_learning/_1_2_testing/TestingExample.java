package _1_learning._1_2_testing;

public class TestingExample {
    public static void main(final String[] ARGS) {
    }

    int sumTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }

    String dayWeek(int dayNumber) {
        while (true) {
            if (dayNumber != 0) {
                return switch (dayNumber) {
                    case 1 -> "Saturday";
                    case 2 -> "Sunday";
                    case 3 -> "Monday";
                    case 4 -> "Tuesday";
                    case 5 -> "Wednesday";
                    case 6 -> "Thursday";
                    case 7 -> "Friday";
                    default -> "Enter a number between 1:7";
                };
            } else break;
        }
        return null;
    }
}