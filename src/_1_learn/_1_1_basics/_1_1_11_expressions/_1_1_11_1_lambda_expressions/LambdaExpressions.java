package _1_learn._1_1_basics._1_1_11_expressions._1_1_11_1_lambda_expressions;

public class LambdaExpressions {
    @FunctionalInterface
    interface MyInterface {
        double getValue();
    }

    public static void main(final String[] ARGUMENTS) {
        MyInterface ref;

        // lambda expression
        ref = () -> 3.1415;

        System.out.println(ref.getValue());
    }

}