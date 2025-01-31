package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_1_singleton_pattern;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(Singleton.getInstance("Java").getData());
        final Singleton SINGLETON = Singleton.getInstance("Kotlin");
        System.out.println(SINGLETON.getData());
        SINGLETON.setData("Kotlin");
        System.out.print(SINGLETON.getData());
    }
}