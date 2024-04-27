package _1_learning._1_4_object_oriented_programming._1_4_3_contructor;

public class Constructor {
    private String text;

    Constructor() { // Constructor without Argument
        text = "Constructor";
        System.out.println(text);
    }

    Constructor(String text) { // OverLoading Constructor with Parameter
        System.out.println(text);
    }

    public static void main(final String[] ARGS) {
        new Constructor(); // Default Constructor
        new Constructor("Overloading Constructor"); // Parameterized Constructor
    }
}