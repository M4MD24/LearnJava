package _1_learn._1_3_object_oriented_programming._1_3_24_anonymous_inner_class;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AnonymousClassExample {
    public static void main(final String[] ARGUMENTS) {
        final List<Integer> NUMBERS = new ArrayList<>() {{
            // Content of Anonymous Inner Class
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        final Predicate<Integer> IS_EVEN = number -> number % 2 == 0;
        final List<Integer> EVEN_NUMBERS = new ArrayList<>() {{
            // Content of Anonymous Inner Class
            for (Integer number : NUMBERS)
                if (IS_EVEN.test(number))
                    add(number);
        }};
        System.out.println(EVEN_NUMBERS);
    }
}