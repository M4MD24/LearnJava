package _1_learning._1_3_handling._1_3_1_exception_handling._1_3_1_4_assertion;

public class Assertion {
    public static void main(String[] args) {
        int age = 25;
        assert age >= 18 : "Age must be 18 or older"; // Checking the assumption using assert
        System.out.println("Assertion passed successfully, age is valid");
    }
}