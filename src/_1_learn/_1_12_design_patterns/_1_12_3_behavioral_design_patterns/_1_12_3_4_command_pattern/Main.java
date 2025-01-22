package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_4_command_pattern;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_4_command_pattern.commands.Command;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_4_command_pattern.commands.TurnOffCommand;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_4_command_pattern.commands.TurnOnCommand;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_4_command_pattern.components.Light;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_4_command_pattern.components.RemoteControl;

public class Main {
    public static void main(final String[] PARAMETERS) {
        Light light = new Light();
        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOn);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOff);
        remoteControl.pressButton();
    }
}