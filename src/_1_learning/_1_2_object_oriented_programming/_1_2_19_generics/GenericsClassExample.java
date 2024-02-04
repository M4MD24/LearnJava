package _1_learning._1_2_object_oriented_programming._1_2_19_generics;

public class GenericsClassExample {
    public static void main(String[] args) {
        // initialize generic class
        // with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.data());

        // initialize generic class
        // with String data
        GenericsClass<String> stringObj = new GenericsClass<>("Generic Class");
        System.out.println("Generic Class returns: " + stringObj.data());

        GenericsClass<Double> genericsMethods = new GenericsClass<>(5.6);
        genericsMethods.genericsMethod(99.9);

        GenericsClassWithExtends<Integer> obj = new GenericsClassWithExtends<>();
        obj.display(1);
    }
}

/**
 * @param data variable of T type
 */
record GenericsClass<T>(T data) {

    public <B> void genericsMethod(B data) {
        System.out.println("Generic Method without Extend Number: " + data);
    }
}

class GenericsClassWithExtends<T extends Number> {
    public void display(T t) {
        System.out.println("Generic Method with Extend Number   : " + t);
    }
}