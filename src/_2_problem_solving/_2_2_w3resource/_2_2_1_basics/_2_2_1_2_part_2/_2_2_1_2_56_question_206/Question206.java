package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_56_question_206;

import java.util.zip.CRC32;

/**
 * <h1>Question:</h1>
 * <h2>From Wikipedia, A cyclic redundancy check (CRC) is an error-detecting code commonly used in digital networks and storage devices to detect accidental changes to raw data. Blocks of data entering these systems get a short check value attached, based on the remainder of a polynomial division of their contents. On retrieval, the calculation is repeated and, in the event the check values do not match, corrective action can be taken against data corruption. CRCs can be used for error correction.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a text: The quick brown fox
 * <br/>
 * crc32 checksum of the string: b74574de
 * </h2>
 */

public class Question206 {
    public static void main(final String[] ARGS) {
        final String TEXT = "The quick brown fox";
        System.out.printf("Input a text: %s\n", TEXT);
        System.out.printf("CRC32 checksum of the string: %s", Long.toHexString(getCRC32(TEXT)));
    }

    private static long getCRC32(final String INPUT) {
        final CRC32 CRC32 = new CRC32();
        CRC32.update(INPUT.getBytes());
        return CRC32.getValue();
    }
}