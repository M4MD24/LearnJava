package _1_learning._1_1_basics._1_1_11_expressions._1_1_11_1_lambda_expressions;

public class LambdaExpressions {
    @FunctionalInterface
    interface MyInterface {
        double getValue();
    }

    public static void main(final String[] PARAMETERS) {
        MyInterface ref;

        // lambda expression
        ref = () -> 3.1415;

        System.out.println(ref.getValue());
    }

}