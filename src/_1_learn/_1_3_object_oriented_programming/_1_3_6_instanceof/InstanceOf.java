package _1_learn._1_3_object_oriented_programming._1_3_6_instanceof;

public class InstanceOf {
    public static void main(final String[] ARGUMENTS) {
        String name = "Mohamed";
        boolean instanceOfString = name instanceof String;
        System.out.println("name is an instance of String: " + instanceOfString);

        InstanceOf objectVariable = new InstanceOf();
        boolean instanceOfObject = objectVariable instanceof InstanceOf;
        System.out.println("object is an instance of InstanceOf: " + instanceOfObject);
    }
}