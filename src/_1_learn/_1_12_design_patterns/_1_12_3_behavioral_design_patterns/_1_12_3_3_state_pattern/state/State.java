package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern.state;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern.Fan;

public interface State {
    void turnUp(Fan fan);
    void turnDown(Fan fan);
}