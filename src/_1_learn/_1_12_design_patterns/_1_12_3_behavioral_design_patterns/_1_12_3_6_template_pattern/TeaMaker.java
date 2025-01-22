package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_6_template_pattern;

class TeaMaker extends BeverageMaker {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}