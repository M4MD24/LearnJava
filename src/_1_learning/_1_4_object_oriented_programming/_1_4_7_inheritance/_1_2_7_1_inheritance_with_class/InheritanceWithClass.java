package _1_learning._1_4_object_oriented_programming._1_4_7_inheritance._1_2_7_1_inheritance_with_class;

class Fruit {
    String name, color;

    void displayColor() { // Package Private
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

public class InheritanceWithClass extends Apple {
/* ■ Access Modifiers
    |-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    |  Public Access Modifier                                  |  Private Access Modifier                                     |  Protected Access Modifier                                                                          |  Package Private Access Modifier                                                                        |
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

    /* (Final/Private) classes shouldn't be inherited by other classes! */
    final class FinalClass {

    }

    private class PrivateClass {

    }

    public class PublicClass {

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
        Fuji.displayColor(); // Dynamic Method Dispatch
    }
}