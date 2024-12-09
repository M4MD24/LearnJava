package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_63_covariant_return_types;

import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_63_covariant_return_types.files <h2>Question</h2>
 */

abstract class Flower {
    abstract String whatsYourName();
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lutas extends Flower {
    @Override
    String whatsYourName() {
        return "Lotus";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

abstract class Region {
    abstract Flower yourNationalFlower();
}

class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}

public class CovariantReturnTypes {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = new Scanner(System.in).nextLine();
        switch (TEXT) {
            case "WestBengal" -> System.out.print(new WestBengal().yourNationalFlower().whatsYourName());
            case "AndhraPradesh" -> System.out.print(new AndhraPradesh().yourNationalFlower().whatsYourName());
        }
    }
}