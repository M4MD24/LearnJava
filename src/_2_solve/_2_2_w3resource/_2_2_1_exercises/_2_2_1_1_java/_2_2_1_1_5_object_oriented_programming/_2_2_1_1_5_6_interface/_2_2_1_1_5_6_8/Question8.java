package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_6_interface._2_2_1_1_5_6_8;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGUMENTS) {
        final Playable FOOTBALL = new Football();
        FOOTBALL.play();

        final Playable VOLLEYBALL = new VolleyBall();
        VOLLEYBALL.play();

        final Playable BASKETBALL = new BasketBall();
        BASKETBALL.play();
    }
}

interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football!");
    }
}

class VolleyBall implements Playable {
    @Override
    public void play() {
        System.out.println("Playing VolleyBall!");
    }
}

class BasketBall implements Playable {
    @Override
    public void play() {
        System.out.println("Playing BasketBall!");
    }
}