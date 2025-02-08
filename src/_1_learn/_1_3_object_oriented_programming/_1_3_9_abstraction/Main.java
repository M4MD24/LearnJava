package _1_learn._1_3_object_oriented_programming._1_3_9_abstraction;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        final Light LIGHT_REMOTE = new LightRemote();
        LIGHT_REMOTE.turnOn();
        LIGHT_REMOTE.turnOff();
    }
}