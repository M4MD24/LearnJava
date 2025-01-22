package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern.state;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern.Fan;

class LowState implements State {
    public void turnUp(Fan fan) {
        fan.setState(new HighState());
        System.out.println("Fan is on High Speed");
    }
    public void turnDown(Fan fan) {
        fan.setState(new OffState());
        System.out.println("Fan is turned Off");
    }
}