package _1_learn._1_3_object_oriented_programming._1_3_13_interface;

class LightRemote implements Light {
    @Override
    public void turnOn() {
        System.out.println("Light is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}