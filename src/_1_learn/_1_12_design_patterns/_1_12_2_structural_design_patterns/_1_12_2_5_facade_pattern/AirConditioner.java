package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_5_facade_pattern;

class AirConditioner implements DeviceControlService {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is OFF");
    }
}