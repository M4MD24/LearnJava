package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern;

public class Main {
    public static void main(final String[] PARAMETERS) {
        Fan fan = new Fan();
        fan.turnUp();
        fan.turnUp();
        fan.turnDown();
        fan.turnDown();
    }
}