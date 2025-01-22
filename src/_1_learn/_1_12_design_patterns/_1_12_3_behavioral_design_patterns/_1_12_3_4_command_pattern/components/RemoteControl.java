package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_4_command_pattern.components;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_4_command_pattern.commands.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}