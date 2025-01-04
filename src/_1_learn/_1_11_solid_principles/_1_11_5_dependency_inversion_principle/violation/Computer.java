package _1_learn._1_11_solid_principles._1_11_5_dependency_inversion_principle.violation;

class Computer {
    private Keyboard keyboard;
    private Monitor monitor;

    public Computer() {
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
    }
}
