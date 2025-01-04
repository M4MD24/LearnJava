package _1_learn._1_3_object_oriented_programming._1_3_17_keywods._1_3_17_1_abstract_and_override_and_super;

/* abstract: abstract classes are created to be the superclass of other classes. And, if a class contains an abstract method, it is mandatory to override it! */
abstract class Persons { // Superclass

    void displayEmployeesDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + "\n");
    }

    abstract void displayManagersDetails();
}

public class AbstractAndOverrideAndSuper extends Persons { // Subclass

    @Override /* @Override: allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its superclasses or parent classes. */
    void displayEmployeesDetails(String name, int age) {
        System.out.println("■ Display Employees Details");
        super.displayEmployeesDetails(name, age); /* super: used in subclasses to access superclass members (attributes, constructors and methods). */
    }

    @Override
    void displayManagersDetails() {
        System.out.println("■ Display Managers Details\n");
    }

    public static void main(final String[] PARAMETERS) {
        AbstractAndOverrideAndSuper abstractAndOverrideAndSuper = new AbstractAndOverrideAndSuper();
        abstractAndOverrideAndSuper.displayManagersDetails();
        abstractAndOverrideAndSuper.displayEmployeesDetails("Mohamed", 20);

        Persons persons = new Persons() {
            @Override
            void displayEmployeesDetails(String name, int age) {
                System.out.println("■ Display Employees Details2");
                super.displayEmployeesDetails(name, age);
            }

            @Override
            void displayManagersDetails() {
                System.out.println("■ Display Managers Details2\n");
            }
        };
        persons.displayManagersDetails();
        persons.displayEmployeesDetails("Ahmed", 18);
    }
}