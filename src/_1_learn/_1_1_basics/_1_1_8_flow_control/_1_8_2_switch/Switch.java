package _1_learn._1_1_basics._1_1_8_flow_control._1_8_2_switch;

public class Switch {
    public static void main(final String[] ARGUMENTS) {
        int number = 1;

//        With Shorthand Notation
        String day1 = switch (number) {
            case 1 -> "Saturday";
            case 2 -> "Sunday";
            case 3 -> "Monday";
            case 4 -> "Tuesday";
            case 5 -> "Wednesday";
            case 6 -> "Thursday";
            case 7 -> "Friday";
            default -> "Error";
        };
        System.out.println(day1);

//        Without Shorthand Notation
        String day2;
        switch (number) {
            case 1, 11:
                day2 = "Saturday";
                break;
            case 2, 22:
                day2 = "Sunday";
                break;
            case 3, 33:
                day2 = "Monday";
                break;
            case 4, 44:
                day2 = "Tuesday";
                break;
            case 5, 55:
                day2 = "Wednesday";
                break;
            case 6, 66:
                day2 = "Thursday";
                break;
            case 7, 77:
                day2 = "Friday";
                break;
            default:
                day2 = "Error";
                break;
        }
        System.out.println(day2);

//        Switch with yield: Similar to 'return'
        String day3 = switch (number) {
            case 1:
                yield "Saturday";
            case 2:
                yield "Sunday";
            case 3:
                yield "Monday";
            case 4:
                yield "Tuesday";
            case 5:
                yield "Wednesday";
            case 6:
                yield "Thursday";
            case 7:
                yield "Friday";
            default:
                yield "Error";
        };
        System.out.println(day3);
    }
}