package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern;

public class Request {
    private final Priority PRIORITY;

    public Request(Priority priority) {
        this.PRIORITY = priority;
    }

    public Priority getPriority() {
        return PRIORITY;
    }
}