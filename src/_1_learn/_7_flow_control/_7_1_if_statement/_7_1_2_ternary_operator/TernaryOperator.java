package _1_learn._7_flow_control._7_1_if_statement._7_1_2_ternary_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 5;
        int result = 0;

//        Without Ternary Operator
        if (number == result) result = 20;
        else result = 10;

        result = (number == result) ? 20 : 10; // With Ternary Operator

        System.out.println(result);
    }
}