package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern.state.OffState;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_3_state_pattern.state.State;

public class Fan {
    private State state = new OffState();

    public void setState(State state) {
        this.state = state;
    }
    
    public void turnUp() {
        state.turnUp(this);
    }
    
    public void turnDown() {
        state.turnDown(this);
    }
}