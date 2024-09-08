package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_3_nested_class._2_2_5_3_9;

/**
 * <h3>Inner Class with Constructor</h3>
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an outer class called Person with an inner class Address. The Address class should have a constructor that takes parameters city and state. Create an instance of Address from the Person class and print the address details.</h2>
 */

public class Question9 {
    public static void main(final String[] PARAMETERS) {
        new Person.Address("Sohag", "Egypt").printInformation();
    }
}

class Person {
    static class Address {
        private final String CITY,
                STATE;

        Address(final String CITY, final String STATE) {
            this.CITY = CITY;
            this.STATE = STATE;
        }

        void printInformation() {
            System.out.printf("""
                            City: %s
                            State: %s""",
                    CITY,
                    STATE);
        }
    }
}