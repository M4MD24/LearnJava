package _1_learn._1_11_solid_principles._1_11_5_dependency_inversion_principle.compliance;

class Computer {
    private InputDevice inputDevice;
    private DisplayDevice displayDevice;

    public Computer(InputDevice inputDevice, DisplayDevice displayDevice) {
        this.inputDevice = inputDevice;
        this.displayDevice = displayDevice;
    }
}