package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_2_static_members._2_2_5_2_5;

/**
 * <h3>Static Block for Initialization</h3>
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called Configuration with a static block that initializes a static variable 'configValue' from a configuration file (simulated with a default value). Print the value of 'configValue' in the main method.</h2>
 */

public class Question5 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(Configuration.configValue);
    }
}

class Configuration {
    static final String configValue;

    static {
        configValue = "Default Config Value";
        System.out.println("Static block executed: configValue initialized");
    }
}