package _1_learning._1_4_object_oriented_programming._1_4_17_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Animal {

    // public constructor without parameter
    public Animal() {

    }

    private Animal(int age) {

    }

    protected Animal(String name, int age) {

    }

    Animal(String name, int age, String gender) {

    }

    class Fly {

    }

    private class Walk {

    }

    protected class Swim {

    }

    public class Crawl {

    }

}

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        getClassNameWithMultipleExamples();
        getClassProperties();
        getMethodsProperties();
        getConstructorsProperties();
        getClassesProperties();
    }

    static void getClassNameWithMultipleExamples() throws ClassNotFoundException { // throws: Throwing specific error
        System.out.println("■ Get Class Name With Multiple Examples:");

        String classPackagePath = "_1_learn._1_2_oop._1_2_17_reflection.Reflection";

        // forName() method
        Class<?> example1 = Class.forName(classPackagePath);
        System.out.println("\ngetName(): " + example1);

        // getClass() method
        Reflection classExample = new Reflection();
        Class<?> example2 = classExample.getClass();
        System.out.println("getClass(): " + example2);

        // .class extension
        Class<?> example3 = Reflection.class;
        System.out.println(".class: " + example3);
    }

    private static void getClassProperties() { // Name, Modifier, Superclass
        System.out.println("\n■ Get Class Properties:");

        Class example = new Reflection().getClass();

        // get name
        String className = example.getName();
        System.out.println("\nClass Name: " + className);

        // get access modifier
        String modifier = Modifier.toString(example.getModifiers());
        String modifierCondition = (modifier.isEmpty()) ? "package private" : modifier;
        System.out.println("Class Modifier: " + modifierCondition);

        // get superClass
        Class superClass = example.getSuperclass();
        System.out.println("Class Superclass: " + superClass.getName());
    }

    protected static void getMethodsProperties() { // Name, Access Modifier, Return Type
        System.out.println("\n■ Get Methods Properties:");

        Class classExample = Reflection.class;

        // get all methods of Dog
        Method[] methods = classExample.getDeclaredMethods();

        for (Method method : methods) {
            // get name
            System.out.println("\nMethod Name: " + method.getName());

            // get access modifier
            String modifier = Modifier.toString(method.getModifiers());
            String modifierCondition = (modifier.isEmpty()) ? "package private" : modifier;
            System.out.println("Method Access Modifier: " + modifierCondition);

            // get return types
            System.out.println("Method Return Types: " + method.getReturnType());
        }
    }

    public static void getConstructorsProperties() { // Name, Access Modifier, Return Type
        System.out.println("\n■ Get Constructors Properties:");

        Class classExample = Animal.class;

        // get all constructors of Dog
        Constructor[] constructors = classExample.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            // get name
            System.out.println("\nConstructor Name: " + constructor.getName());

            // get access modifier
            String modifier = Modifier.toString(constructor.getModifiers());
            String modifierCondition = (modifier.isEmpty()) ? "package private" : modifier;
            System.out.println("Constructor Access Modifier: " + modifierCondition);

            // get number of parameters
            System.out.println("Constructor Parameters: " + constructor.getParameterCount());
        }
    }

    static void getClassesProperties() { // Name, Modifier, Superclass
        System.out.println("\n■ Get Classes Properties:");

        Class classExample = Animal.class;

        // get all classes of Dog
        Class[] classes = classExample.getDeclaredClasses();

        for (Class c : classes) {
            // get name
            System.out.println("\nClass Name: " + c.getName());

            // get access modifier
            String modifier = Modifier.toString(c.getModifiers());
            String modifierCondition = (modifier.isEmpty()) ? "package private" : modifier;
            System.out.println("Class Access Modifier: " + modifierCondition);

            // get number of parameters
            System.out.println("Class Superclass: " + c.getSuperclass().getName());
        }
    }
}