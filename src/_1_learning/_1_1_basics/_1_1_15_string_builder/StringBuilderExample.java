package _1_learning._1_1_basics._1_1_15_string_builder;

public class StringBuilderExample {
    public static void main(final String[] PARAMETERS) {
        StringBuilder one = new StringBuilder("One");
        StringBuilder two = new StringBuilder("Two");
        StringBuilder three = new StringBuilder("Three");
        StringBuilder comma = new StringBuilder(", ");

        one.append(comma).append(three);
        System.out.println(".append() after        : " + one);

        one.insert(3, comma).insert(5, two);
        System.out.println(".insert() after        : " + one);

        one.setLength(8);
        System.out.println(".setLength() after     : " + one);

        System.out.println(".capacity()            : " + one.capacity());

        one.ensureCapacity(100);
        System.out.println(".ensureCapacity() after: " + one.capacity());

        System.out.println(".reverse()             : " + one.reverse());
    }
}