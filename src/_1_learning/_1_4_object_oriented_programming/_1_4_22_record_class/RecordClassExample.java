package _1_learning._1_4_object_oriented_programming._1_4_22_record_class;

record Person(int id, String name) {
    public Person() {
        this(0, "");
    }
}

public class RecordClassExample {
    public static void main(final String[] PARAMETERS) {
        String[] names = {"Abd-Allah", "Abd-ElRahman", "Mohamed", "Ahmed"};
        for (int index = 0; index < names.length; index++) System.out.println(new Person(index, names[index]));

        System.out.print("\n" + new Person());
    }
}