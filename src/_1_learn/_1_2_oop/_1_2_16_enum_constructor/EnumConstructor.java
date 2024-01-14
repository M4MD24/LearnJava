package _1_learn._1_2_oop._1_2_16_enum_constructor;


enum Fruits {
    // enum constants calling the enum constructors
    Apple("The fruit is apple"),
    Mango("The fruit is mango"),
    Banana("The fruit is banana");

    private final String fruitText;

    // Private enum constructor
    private Fruits(String fruitText) {
        this.fruitText = fruitText;
    }

    String getFruit() {
        return fruitText;
    }
}

class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Fruits.Apple.getFruit());
    }
}