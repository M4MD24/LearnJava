package _1_learn._1_3_object_oriented_programming._1_3_12_data_hiding;

class Person {
    private int age; // data hiding

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }
}

public class DataHiding {
    public static void main(final String[] ARGUMENTS) {
        final Person PERSON = new Person();
        PERSON.setAge(20);
        /* Error ! */
//        person.age = 30;
        System.out.print("Person age: " + PERSON.getAge());
    }
}