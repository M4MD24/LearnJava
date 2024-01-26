package _1_learning._1_2_oop._1_2_3_contructor;

public class Constructor {
    private String text;

    Constructor() { // Constructor
        text = "Constructor";
        System.out.println(text);
    }

    Constructor(String text) { // OverLoading Constructor
        System.out.println(text);
    }

    public static void main(String[] args) {
        new Constructor(); // Default Constructor
        new Constructor("Overloading Constructor");
    }
}