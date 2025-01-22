package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_6_template_pattern;

class CoffeeMaker extends BeverageMaker {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}