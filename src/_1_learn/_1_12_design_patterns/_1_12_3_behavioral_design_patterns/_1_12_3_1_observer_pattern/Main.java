package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_1_observer_pattern;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        WeatherStation station = new WeatherStation();
        
        ObserverService phoneDisplay = new WeatherDisplay("Phone Display");
        ObserverService lcdScreen = new WeatherDisplay("LCD Screen");

        station.addObserver(phoneDisplay);
        station.addObserver(lcdScreen);

        station.setTemperature(25.5f);
        System.out.println("=".repeat(50));
        station.setTemperature(30.0f);
    }
}