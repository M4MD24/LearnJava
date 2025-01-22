package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_1_observer_pattern;

import java.util.ArrayList;
import java.util.List;

class WeatherStation {
    private final List<ObserverService> OBSERVERS = new ArrayList<>();
    private float temperature;

    void addObserver(ObserverService observer) {
        OBSERVERS.add(observer);
    }

    void removeObserver(ObserverService observer) {
        OBSERVERS.remove(observer);
    }

    void setTemperature(float newTemperature) {
        this.temperature = newTemperature;
        System.out.println("Weather Station: New temperature recorded: " + temperature + "°C");
        notifyObservers();
    }

    private void notifyObservers() {
        for (ObserverService observer : OBSERVERS)
            observer.update(temperature);
    }
}