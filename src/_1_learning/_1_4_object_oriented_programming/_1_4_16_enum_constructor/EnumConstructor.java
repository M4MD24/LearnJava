package _1_learning._1_4_object_oriented_programming._1_4_16_enum_constructor;

enum Fruits {
    // enum constants calling the enum constructors
    APPLE("The fruit is apple") {
        public String toString() { // overriding toString() for APPLE
            return "Apple";
        }
    },
    MANGO("The fruit is mango") {
        public String displayMango() {
            return "Mango";
        }
    },
    BANANA("The fruit is banana") {
        /* Error ! */
        /* We cannot override the name() method. It is because the name() method is final! */
        /*
        public String name() { // overriding name() for BANANA
            return "Apple";
        }
        */
    };

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
        System.out.println("Fruits.APPLE: " + Fruits.APPLE);
        System.out.println("Fruits.APPLE.toString(): " + Fruits.APPLE.toString());
        System.out.println("Fruits.APPLE.getFruit(): " + Fruits.APPLE.getFruit());

        /* Error ! */
        /*
        System.out.println("Fruits.BANANA.getFruit(): " + Fruits.APPLE.getFruit());
        */
    }
}