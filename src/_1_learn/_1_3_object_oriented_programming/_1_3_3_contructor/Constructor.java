package _1_learn._1_3_object_oriented_programming._1_3_3_contructor;

public class Constructor {
    private String text;

    Constructor() { // Constructor without Argument
        text = "Constructor";
        System.out.println(text);
    }

    Constructor(String text) { // OverLoading Constructor with Parameter
        System.out.println(text);
    }

    public static void main(final String[] PARAMETERS) {
        new Constructor(); // Default Constructor
        new Constructor("Overloading Constructor"); // Parameterized Constructor
    }
}