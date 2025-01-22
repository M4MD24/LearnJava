package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern.state;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern.Fan;

class HighState implements State {
    public void turnUp(Fan fan) {
        System.out.println("Fan is already on High Speed");
    }
    public void turnDown(Fan fan) {
        fan.setState(new LowState());
        System.out.println("Fan is on Low Speed");
    }
}