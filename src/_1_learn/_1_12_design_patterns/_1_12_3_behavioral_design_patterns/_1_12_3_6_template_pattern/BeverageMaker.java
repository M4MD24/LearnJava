package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_6_template_pattern;

abstract class BeverageMaker {
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}