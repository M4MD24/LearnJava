package _1_learning._1_2_object_oriented_programming._1_2_4_getter_and_setter;

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name; /* this: used to refer to the current object inside a method or a constructor! */
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        Data data = new Data();
        data.setName("Mohamed");
        System.out.println(data.getName().toUpperCase());
    }
}