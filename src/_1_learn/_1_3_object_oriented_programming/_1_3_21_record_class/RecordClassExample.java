package _1_learn._1_3_object_oriented_programming._1_3_21_record_class;

record Person(int id, String name) {
    public Person() {
        this(0, "");
    }
}

public class RecordClassExample {
    public static void main(final String[] ARGUMENTS) {
        String[] names = {"Abd-Allah", "Abd-ElRahman", "Mohamed", "Ahmed"};
        for (int index = 0; index < names.length; index++) System.out.println(new Person(index, names[index]));

        System.out.print("\n" + new Person());
    }
}