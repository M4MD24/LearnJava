package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_2_contest_1._2_3_1_2_a_winter_sale;

import java.util.Scanner;

/**
 * <h1>A. Winter Sale</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>The winter sale began, and Mrs. Sarah wants to buy a T-shirt for her son. The T-shirt has a ticket that indicates a discount of X% and its price P after the discount. She now wants to know the price before the discount to know if the discount was worthy. Help her!</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>20 80</h2>
 * <h1>Output:</h1>
 * <h2>100.00</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>15 20</h2>
 * <h1>Output:</h1>
 * <h2>23.53</h2>
 */

public class WinterSaleExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        float DISCOUNT = INPUT.nextInt() * 0.01F,
                PRICE_AFTER_DISCOUNT = INPUT.nextInt(),
                PRICE_BEFORE_DISCOUNT = PRICE_AFTER_DISCOUNT / (1 - DISCOUNT);
        System.out.printf("%.2f", PRICE_BEFORE_DISCOUNT);
    }
}