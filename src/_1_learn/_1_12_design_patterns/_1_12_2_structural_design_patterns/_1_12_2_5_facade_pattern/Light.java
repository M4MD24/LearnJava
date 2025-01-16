package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_5_facade_pattern;

class Light implements DeviceControlService {
    @Override
    public void turnOn() {
        System.out.println("Lights are ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights are OFF");
    }
}