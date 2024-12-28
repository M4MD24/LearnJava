package _1_learn._1_5_data_structures._1_5_36_enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public static void main(final String[] PARAMETERS) {
        final Vector<String> ELEMENTS = new Vector<>() {{
            add("Java");
            add("Python");
            add("C++");
            add("JavaScript");
        }};

        final Enumeration<String> ENUMERATION_ELEMENTS = ELEMENTS.elements();

        while (ENUMERATION_ELEMENTS.hasMoreElements())
            System.out.println(ENUMERATION_ELEMENTS.nextElement());
    }
}