package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_x_mountain_scenery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>X. MountainScenery</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 2
 * <br/>
 * 0 5 3 5 1 5 2
 * </h2>
 * <h1>Output</h1>
 * <h2>0 5 3 4 1 4 2 </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 1
 * <br/>
 * 0 2 0
 * </h2>
 * <h1>Output</h1>
 * <h2>0 1 0 </h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_x_mountain_scenery <h2>Question</h2>
 */

public class MountainSceneryExample {
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
    private static short countOfMountains;
    private static byte countOfMountainsToModified;
    private static byte[] mountains;

    public static void main(final String[] ARGS) throws IOException {
        inputMountains();
        modifyMountains();
        OUTPUT.flush();
    }

    private static void modifyMountains() throws IOException {
        OUTPUT.write(mountains[0] + " ");
        for (short index = 1; index < countOfMountains - 1; index++) {
            final short FIRST_MOUNTAIN = mountains[index - 1], MIDDLE_MOUNTAIN = mountains[index], LAST_MOUNTAIN = mountains[index + 1];
            if (FIRST_MOUNTAIN < (MIDDLE_MOUNTAIN - 1) && LAST_MOUNTAIN < (MIDDLE_MOUNTAIN - 1) && countOfMountainsToModified != 0) {
                mountains[index]--;
                countOfMountainsToModified--;
            }
            OUTPUT.write(mountains[index] + " ");
        }
        OUTPUT.write(mountains[countOfMountains - 1] + " ");
    }

    private static void inputMountains() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer line = new StringTokenizer(INPUT.readLine());
        countOfMountains = Byte.parseByte(line.nextToken());
        countOfMountainsToModified = Byte.parseByte(line.nextToken());
        mountains = new byte[countOfMountains = (short) ((countOfMountains * 2) + 1)];
        line = new StringTokenizer(INPUT.readLine());
        for (short index = 0; index < countOfMountains; index++) mountains[index] = Byte.parseByte(line.nextToken());
    }
}