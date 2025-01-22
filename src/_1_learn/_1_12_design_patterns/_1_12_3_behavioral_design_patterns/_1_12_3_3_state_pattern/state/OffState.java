package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern.state;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern.Fan;

public class OffState implements State {
    public void turnUp(Fan fan) {
        fan.setState(new LowState());
        System.out.println("Fan is on Low Speed");
    }
    public void turnDown(Fan fan) {
        System.out.println("Fan is already Off");
    }
}