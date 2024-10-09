package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_7_encapsulation._2_2_5_7_1;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.</h2>
 */

public class Question1 {
    private static final Person PERSON = new Person();

    public static void main(final String[] PARAMETERS) {
        addDataPerson();
        getInformationPerson();
    }

    private static void getInformationPerson() {
        System.out.printf("Name: %s%nAge: %d%nCountry: %s",
                PERSON.getName(),
                PERSON.getAge(),
                PERSON.getCountry());
    }

    private static void addDataPerson() {
        PERSON.setName("Mohamed");
        PERSON.setAge(21);
        PERSON.setCountry("Egypt");
    }
}

class Person {
    private String name;
    private int age;
    private String country;

    String getName() {
        return name;
    }

    void setName(final String NAME) {
        name = NAME;
    }

    int getAge() {
        return age;
    }

    void setAge(final int AGE) {
        age = AGE;
    }

    String getCountry() {
        return country;
    }

    void setCountry(final String COUNTRY) {
        country = COUNTRY;
    }
}