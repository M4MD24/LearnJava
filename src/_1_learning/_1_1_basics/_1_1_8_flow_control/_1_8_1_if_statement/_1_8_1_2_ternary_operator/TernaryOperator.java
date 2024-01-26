package _1_learning._1_1_basics._1_1_8_flow_control._1_8_1_if_statement._1_8_1_2_ternary_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 5;
        int result = 0;

//        Without Ternary Operator
        if (number == result) result = 20;
        else result = 10;

//        With Ternary Operator
        result = (number == result) ? 20 : 10;

        System.out.println(result);
    }
}