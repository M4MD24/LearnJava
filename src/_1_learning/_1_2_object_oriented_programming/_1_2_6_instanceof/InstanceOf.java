package _1_learning._1_2_object_oriented_programming._1_2_6_instanceof;

public class InstanceOf {

    public static void main(String[] args) {
        String name = "Mohamed";
        boolean instanceOfString = name instanceof String;
        System.out.println("name is an instance of String: " + instanceOfString);

        InstanceOf objectVariable = new InstanceOf();
        boolean instanceOfObject = objectVariable instanceof InstanceOf;
        System.out.println("object is an instance of InstanceOf: " + instanceOfObject);
    }
}
