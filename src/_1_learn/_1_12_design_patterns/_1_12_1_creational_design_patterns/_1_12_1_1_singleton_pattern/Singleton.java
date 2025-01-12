package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_1_singleton_pattern;

public class Singleton {
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }

    String getData() {
        return data;
    }

    void setData(String data) {
        this.data = data;
    }
}