package _1_learn._1_2_oop._1_2_7_inheritance;

class Fruit {
    String name, color;

    public void displayColor() {
        System.out.println("Color: " + color);
    }

    public void displayOrigin(String origin) {
        System.out.print("Origin: " + origin);
    }
}

/* extends: used to perform inheritance. */
class Apple extends Fruit { // Apple Inherit Fruit
    public void displayName() {
        System.out.println("Name: " + name);
    }
}

/* abstract: abstract classes are created to be the superclass of other classes. And, if a class contains an abstract method, it is mandatory to override it! */
abstract class Person extends Apple {
    void displayPersonDetails(String name, String thingOfEating) {
        System.out.println("Name: " + name);
        System.out.println("Thing of eat: " + thingOfEating);
    }
}

public class Inheritance extends Person {
    /* ■ Access Modifiers
    |-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    |  Public Access Modifier                                  |  Private Access Modifier                                     |  Protected Access Modifier                                                                          |  Package Access Modifier                                                                                |
    |----------------------------------------------------------|--------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|
    |  Applicable for both top-level classes and interfaces.   |  Not applicable for both top-level classes and interfaces.   |  Not applicable for both top-level classes and interfaces.                                          |  Applicable for both top-level classes and interfaces.                                                  |
    |  Accessible from the child class of the same package.    |  Not accessible from the child class of the same package.    |  Accessible anywhere from the same package and by child classes outside the package.                |  Accessible from the child class of the same package.                                                   |
    |  Accessible from non-child classes of the same package.  |  Not accessible from non-child classes of the same package.  |  Accessible from non-child classes of the same package.                                             |  Accessible from non-child class of the same package.                                                   |
    |  Accessible from the child class of outside package.     |  Not accessible from the child class of outside package.     |  Accessible from the child class of the outside package using child reference only.                 |  Not accessible from the child class of outside package.                                                |
    |  Accessible from non-child class of outside package.     |  Not accessible from non-child class of outside package.     |  Not accessible from non-child class of outside package.                                            |  Not accessible from non-child class of outside package.                                                |
    |  Most accessible modifier among all modifiers.           |  Most restricted modifier among all modifiers.               |  More accessible than the package and private modifier but less accessible than public modifier.    |  More restricted than the public and protected modifier but less restricted than the private modifier.  |
    |-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/

    protected class ProtectClass {

    }

    private class PrivateClass {

    }

    public class PublicClass {

    }

    @Override /* @Override: allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its superclasses or parent classes. */
    void displayPersonDetails(String name, String thingOfEating) {
        super.displayPersonDetails(name, thingOfEating);
    }

    @Override
    public void displayOrigin(String origin) {
        super.displayOrigin(origin);
        System.out.println(" 🎌\n");
    }

    public static void main(String[] args) {
        Apple Fuji = new Apple();
        Fuji.name = "Fuji";
        Fuji.color = "Red";
        Fuji.displayName();
        Fuji.displayColor();
        new Inheritance().displayOrigin("Japanese");
        new Inheritance().displayPersonDetails("Mohamed".toUpperCase(), Fuji.name);
    }
}