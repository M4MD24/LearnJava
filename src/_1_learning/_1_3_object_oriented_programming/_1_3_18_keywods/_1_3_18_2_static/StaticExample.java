package _1_learning._1_3_object_oriented_programming._1_3_18_keywods._1_3_18_2_static;

class Person {
    String name;
    int age;
    static String job, notes;
    String gender;

    static {
        job = "Developer";
        notes = "Nothing";
    }

    void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nJob: " + job + "\nNotes: " + notes);
    }

    static void display(String name, int age, String gender, String job, String notes) {
        System.out.println("\nName: " + name + "\nAge: " + age + "\nGender: " + gender + "\nJob: " + job + "\nNotes: " + notes);
    }
}

public class StaticExample {
    public static void main(final String[] PARAMETERS) throws ClassNotFoundException {
        Person person = new Person();

        person.name = "Elham";
        person.age = 27;
        person.gender = "Female";
        Person.job = "Full-Stack Web";

        person.display();
        Person.display("Mohamed", 20, "Male", "Native Android Developer", "Very Accurate");
    }
}