package _1_learn._1_3_object_oriented_programming._1_3_9_abstraction;

class LightRemote extends Light {
    @Override
    void turnOn() {
        System.out.println("Light is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}