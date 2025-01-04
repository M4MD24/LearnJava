package _1_learn._1_3_object_oriented_programming._1_3_22_sealed_class_and_interface;

sealed class A permits B, C {

}

final class B extends A {

}

non-sealed class C extends A {

}

sealed interface I permits J, SealedClassAndInterfaceExample.MyI {

}

non-sealed interface J extends I {

}

public class SealedClassAndInterfaceExample {
    public static void main(final String[] PARAMETERS) {
        A aClass = new A();
        B bClass = new B();
        C cClass = new C();
        I iInstance = new MyI();
        J jInstance = new J() {
        };
    }

    public static final class MyI implements I {
    }

}