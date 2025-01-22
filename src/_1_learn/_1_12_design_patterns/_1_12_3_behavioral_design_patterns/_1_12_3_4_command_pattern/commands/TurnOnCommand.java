package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_4_command_pattern.commands;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_4_command_pattern.components.Light;

public class TurnOnCommand implements Command {
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}