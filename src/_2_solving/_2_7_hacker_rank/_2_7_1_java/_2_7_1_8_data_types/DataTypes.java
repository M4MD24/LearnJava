package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_8_data_types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_8_data_types.images.question <h2>Question</h2>
 */

public class DataTypes {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        final int COUNT_OF_LINES = Integer.parseInt(INPUT.readLine());
        for (int currentCountOfLine = 0; currentCountOfLine < COUNT_OF_LINES; currentCountOfLine++) {
            printPossibleStatesOfValue(INPUT.readLine());
            if (currentCountOfLine < COUNT_OF_LINES - 1)
                OUTPUT.write('\n');
        }
    }

    private static void printPossibleStatesOfValue(final String VALUE) throws IOException {
        boolean fits = false;
        final StringBuilder POSSIBLE_STATES_OF_VALUE = new StringBuilder();
        try {
            Byte.parseByte(VALUE);
            POSSIBLE_STATES_OF_VALUE.append("* byte\n");
            fits = true;
        } catch (NumberFormatException ignored) {
        }
        try {
            Short.parseShort(VALUE);
            POSSIBLE_STATES_OF_VALUE.append("* short\n");
            fits = true;
        } catch (NumberFormatException ignored) {
        }
        try {
            Integer.parseInt(VALUE);
            POSSIBLE_STATES_OF_VALUE.append("* int\n");
            fits = true;
        } catch (NumberFormatException ignored) {
        }
        try {
            Long.parseLong(VALUE);
            POSSIBLE_STATES_OF_VALUE.append("* long");
            fits = true;
        } catch (NumberFormatException ignored) {
        }
        if (fits)
            POSSIBLE_STATES_OF_VALUE.insert(0, VALUE + " can be fitted in:\n");
        else
            POSSIBLE_STATES_OF_VALUE.insert(0, VALUE + " can't be fitted anywhere.");
        OUTPUT.write(POSSIBLE_STATES_OF_VALUE.toString());
    }
}