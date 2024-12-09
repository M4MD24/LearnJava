package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_d_juicer;

import java.util.Scanner;

/**
 * <h1>D. Juicer</h1>
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
 * <h2>
 * Kolya is going to make fresh orange juice. He has n oranges of sizes a1,a2,...,an. Kolya will put them in the juicer in the fixed order, starting with orange of size a1, then orange of size a2 and so on. To be put in the juicer the orange must have size not exceeding b, so if Kolya sees an orange that is strictly greater he throws it away and continues with the next one.
 * <br/>
 * The juicer has a special section to collect waste. It overflows if Kolya squeezes oranges of the total size strictly greater than d. When it happens Kolya empties the waste section (even if there are no more oranges) and continues to squeeze the juice. How many times will he have to empty the waste section?
 * </h2>
 * <h1>Input:</h1>
 * <h2>
 * 2 7 10
 * <br/>
 * 5 6
 * </h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 5 10
 * <br/>
 * 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 10 10
 * <br/>
 * 5 7 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 1 1
 * <br/>
 * 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first sample, Kolya will squeeze the juice from two oranges and empty the waste section afterwards.
 * <br/>
 * In the second sample, the orange won't fit in the juicer so Kolya will have no juice at all.
 * </h2>
 */

public class JuicerExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int COUNT_OF_ORANGES = INPUT.nextInt(),
            MAXIMUM_ORANGE_WEIGHT = INPUT.nextInt(),
            MAXIMUM_WASTE_SECTION = INPUT.nextInt();
    private static int timesEmptyTheWasteSection = 0;

    public static void main(final String[] PARAMETERS) {
        squeezingOranges();
        System.out.print(timesEmptyTheWasteSection);
    }

    private static void squeezingOranges() {
        int sumWeightOranges = 0;
        for (int index = 0; index < COUNT_OF_ORANGES; index++) {
            final int CURRENT_ORANGE_WEIGHT = INPUT.nextInt();
            if (CURRENT_ORANGE_WEIGHT <= MAXIMUM_ORANGE_WEIGHT) {
                sumWeightOranges += CURRENT_ORANGE_WEIGHT;
                if (sumWeightOranges > MAXIMUM_WASTE_SECTION) {
                    sumWeightOranges = 0;
                    timesEmptyTheWasteSection++;
                }
            }
        }
    }
}