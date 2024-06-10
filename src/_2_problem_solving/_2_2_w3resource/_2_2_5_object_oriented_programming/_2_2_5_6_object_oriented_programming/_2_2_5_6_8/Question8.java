package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_6_object_oriented_programming._2_2_5_6_8;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGS) {
        final TrafficLight TRAFFIC_LIGHT = new TrafficLight(TrafficLightColors.Green, 60);
        System.out.printf("Color: %s%nDuration: %d Seconds%nIs Green Now? %b%n",
                TRAFFIC_LIGHT.getColor(),
                TRAFFIC_LIGHT.getDuration(),
                TRAFFIC_LIGHT.isGreen());
        TRAFFIC_LIGHT.changeColor(TrafficLightColors.Red);
        System.out.printf("Is Red Now? %b",
                TRAFFIC_LIGHT.isRed());
    }
}

class TrafficLight {
    private TrafficLightColors color;
    private final int DURATION_SECONDS;

    TrafficLight(final TrafficLightColors COLOR, final int DURATION_SECONDS) {
        color = COLOR;
        this.DURATION_SECONDS = DURATION_SECONDS;
    }

    TrafficLightColors getColor() {
        return color;
    }

    void changeColor(final TrafficLightColors COLOR) {
        color = COLOR;
    }

    int getDuration() {
        return DURATION_SECONDS;
    }

    boolean isGreen() {
        return color.equals(TrafficLightColors.Green);
    }

    boolean isRed() {
        return color.equals(TrafficLightColors.Red);
    }
}

enum TrafficLightColors {
    Green, Red
}