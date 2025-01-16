package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_5_facade_pattern;

class HomeAutomationSystem {
    private final Light LIGHT;
    private final AirConditioner AIR_CONDITIONER;

    public HomeAutomationSystem() {
        this.LIGHT = new Light();
        this.AIR_CONDITIONER = new AirConditioner();
    }

    public void startSleepMode() {
        System.out.println("Starting Sleep Mode...");
        LIGHT.turnOff();
        AIR_CONDITIONER.turnOn();
    }

    public void stopSleepMode() {
        System.out.println("Stopping Sleep Mode...");
        LIGHT.turnOn();
        AIR_CONDITIONER.turnOff();
    }
}