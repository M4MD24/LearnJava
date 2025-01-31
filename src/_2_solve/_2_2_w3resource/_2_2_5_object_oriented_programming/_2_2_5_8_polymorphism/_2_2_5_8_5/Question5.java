package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_8_polymorphism._2_2_5_8_5;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a base class Electronic sport with a method called play(). Create three subclasses: Tik Tak Toe, Paper Wordle, Dots and Boxes and Battleship. Override the play() method in each subclass to play a specific statement for each electronic sport.</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final ElectronicSport ELECTRONIC_SPORT = new ElectronicSport();
        ELECTRONIC_SPORT.play();

        final ElectronicSport TIK_TAK_TOE = new TikTakToe();
        TIK_TAK_TOE.play();

        final ElectronicSport PAPER_WORDLE = new PaperWordle();
        PAPER_WORDLE.play();

        final ElectronicSport DOTS_AND_BOXES = new DotsAndBoxes();
        DOTS_AND_BOXES.play();
    }
}

class ElectronicSport {
    void play() {
        System.out.println("Playing electronic sport now!");
    }
}

class TikTakToe extends ElectronicSport {
    void play() {
        System.out.println("Playing tik tak toe now!");
    }
}

class PaperWordle extends ElectronicSport {
    void play() {
        System.out.println("Playing paper wordle now!");
    }
}

class DotsAndBoxes extends ElectronicSport {
    void play() {
        System.out.println("Playing dots and boxes now!");
    }
}