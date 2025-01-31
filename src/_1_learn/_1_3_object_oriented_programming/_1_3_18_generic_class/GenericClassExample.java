package _1_learn._1_3_object_oriented_programming._1_3_18_generic_class;

public class GenericClassExample {
    public static void main(final String[] ARGUMENTS) {
        // initialize generic class
        // with Integer data
        GenericClass<Integer> intObj = new GenericClass<>(5);
        System.out.println("Generic Class returns: " + intObj.data());

        // initialize generic class
        // with String data
        GenericClass<String> stringObj = new GenericClass<>("Generic Class");
        System.out.println("Generic Class returns: " + stringObj.data());

        GenericClass<Double> genericsMethods = new GenericClass<>(5.6);
        genericsMethods.genericsMethod(99.9);

        GenericClassWithExtends<Integer> obj = new GenericClassWithExtends<>();
        obj.display(1);
    }
}

/**
 * @param data variable of T type
 */
record GenericClass<T>(T data) {
    public <B> void genericsMethod(B data) {
        System.out.println("Generic Method without Extend Number: " + data);
    }
}

class GenericClassWithExtends<T extends Number> {
    public void display(T t) {
        System.out.println("Generic Method with Extend Number   : " + t);
    }
}