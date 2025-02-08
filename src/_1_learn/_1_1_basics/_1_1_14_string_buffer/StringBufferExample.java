package _1_learn._1_1_basics._1_1_14_string_buffer;

public class StringBufferExample {
    public static void main(final String[] ARGUMENTS) {
        StringBuffer one = new StringBuffer("One");
        StringBuffer two = new StringBuffer("Two");
        StringBuffer three = new StringBuffer("Three");
        StringBuffer comma = new StringBuffer(", ");

        one.append(comma).append(three);
        System.out.println(".append() after        : " + one);

        one.insert(3, comma).insert(5, two);
        System.out.println(".insert() after        : " + one);

        one.setLength(8);
        System.out.println(".setLength() after     : " + one);

        System.out.println(".capacity()            : " + one.capacity());

        one.ensureCapacity(100);
        System.out.println(".ensureCapacity() after: " + one.capacity());

        System.out.print(".reverse()             : " + one.reverse());
    }
}