package _1_learn._1_5_data_structures._1_5_1_list._1_5_1_1_list;

import java.awt.List;
import java.util.*;

public class ListExample {
    public static void main(final String[] ARGUMENTS) {
        list();
    }

    private static void list() {
        List number = new List();

        number.add("1");
        number.add("2");
        number.add("3");
        System.out.println("List .getItems()        : " + Arrays.toString(number.getItems()));

        System.out.println("List .contains()        : " + Arrays.toString(number.getItems()).contains("1"));

        List additionalNumber = new List();
        additionalNumber.add("4");
        additionalNumber.add("5");

        for (String item : additionalNumber.getItems()) number.add(String.valueOf(item));
        System.out.println("List addAll with foreach: " + Arrays.toString(number.getItems()));

        System.out.println("List .getItem()         : " + number.getItem(0));

        number.remove(0);
        System.out.println("List .remove() after    : " + Arrays.toString(number.getItems()));

        System.out.println("List .getItemCount()    : " + number.getItemCount() + "\n");
    }
}