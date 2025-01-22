package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_7_interpreter_pattern;

class Number implements Expression {
    private final int value;

    public Number(int value) {
        this.value = value;
    }

    public int interpret() {
        return value;
    }
}