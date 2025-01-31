package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_5_facade_pattern;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        HomeAutomationSystem homeSystem = new HomeAutomationSystem();
        homeSystem.startSleepMode();
        System.out.println("=".repeat(30));
        homeSystem.stopSleepMode();
    }
}