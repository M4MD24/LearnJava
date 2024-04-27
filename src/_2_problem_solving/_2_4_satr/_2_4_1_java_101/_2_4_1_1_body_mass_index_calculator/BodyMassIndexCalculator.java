package _2_problem_solving._2_4_satr._2_4_1_java_101._2_4_1_1_body_mass_index_calculator;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        enterData();
    }

    private static void enterData() {
        System.out.print("Enter your height (Meter): ");
        final float HEIGHT = INPUT.nextFloat();
        System.out.print("Enter your weight (Kilogram): ");
        final float WEIGHT = INPUT.nextInt();

        calculateBodyMassIndex(HEIGHT, WEIGHT);
    }

    private static void calculateBodyMassIndex(final float HEIGHT, final float WEIGHT) {
        final float BODY_MASS_INDEX = WEIGHT / (HEIGHT * HEIGHT);
        System.out.printf("Your body mass index is: %.2f %s", BODY_MASS_INDEX, checkBodyMassIndexStatus(BODY_MASS_INDEX));
    }

    private static String checkBodyMassIndexStatus(final float BODY_MASS_INDEX) {
        if (BODY_MASS_INDEX < 18.5) return "(Under Weight)";
        if (BODY_MASS_INDEX < 24.9) return "(Normal Weight)";
        if (BODY_MASS_INDEX < 29.9) return "(Over Weight)";
        else return "(Obese)";
    }
}