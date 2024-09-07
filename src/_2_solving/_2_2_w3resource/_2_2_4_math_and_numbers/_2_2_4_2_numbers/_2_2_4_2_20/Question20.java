package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_20;

/**
 * <h1>Excepted Output:</h1>
 * <h2>
 * 3.0
 * <br/>
 * 5.0
 * <br/>
 * 17.0
 * <br/>
 * 257.0
 * <br/>
 * 65537.0
 * <br/>
 * 4.294967297E9
 * <br/>
 * 1.8446744073709552E19
 * <br/>
 * 3.4028236692093846E38
 * <br/>
 * 1.157920892373162E77
 * <br/>
 * 1.3407807929942597E154
 * </h2>
 *
 * @see _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_20.images <h2>Question</h2>
 */
public class Question20 {
    public static void main(final String[] PARAMETERS) {
        printFirstElevenFermatNumbers();
    }

    private static void printFirstElevenFermatNumbers() {
        for (int numberOfPower = 0; numberOfPower < 10; numberOfPower++) {
            System.out.print(Math.pow(2, Math.pow(2, numberOfPower)) + 1);
            if (numberOfPower < 9)
                System.out.println();
        }
    }
}