package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_1_observer_pattern;

class WeatherDisplay implements ObserverService {
    private String displayName;

    WeatherDisplay(String name) {
        this.displayName = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(float temperature) {
        System.out.println(displayName + " updated: Temperature is now " + temperature + "°C");
    }
}