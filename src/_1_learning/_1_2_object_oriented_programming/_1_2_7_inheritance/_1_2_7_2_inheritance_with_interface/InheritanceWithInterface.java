package _1_learning._1_2_object_oriented_programming._1_2_7_inheritance._1_2_7_2_inheritance_with_interface;

interface Interface1 {
    void function1();

    void function2();

    void function3();
}

interface Interface2 {
    void function4();

    void function5();

    void function6();
}

class AnotherClass implements Interface1 { // Implementing Single Interface
    @Override
    public void function1() {
        System.out.println("Function 1");
    }

    @Override
    public void function2() {
        System.out.println("Function 2");
    }

    @Override
    public void function3() {
        System.out.println("Function 3");
    }
}

/* ~ The Difference Between (Class) and (Interface)
 *  You can't inherit multiple class, But Interface can
 * */
public class InheritanceWithInterface extends AnotherClass implements Interface1, Interface2 { // Implementing Class And Multiple Interfaces
    @Override
    public void function1() {
        super.function1();
        System.out.println("Another Function 1");
    }

    @Override
    public void function2() {
        super.function2();
        System.out.println("Another Function 2");
    }

    @Override
    public void function3() {
        super.function3();
        System.out.println("Another Function 3");
    }

    @Override
    public void function4() {
        System.out.println("Another Function 4");
    }

    @Override
    public void function5() {
        System.out.println("Another Function 5");
    }

    @Override
    public void function6() {
        System.out.println("Another Function 6");
    }

    public static void main(String[] args) {
        new InheritanceWithInterface().function1();
        new InheritanceWithInterface().function2();
        new InheritanceWithInterface().function3();
        new InheritanceWithInterface().function4();
        new InheritanceWithInterface().function5();
        new InheritanceWithInterface().function6();
    }
}