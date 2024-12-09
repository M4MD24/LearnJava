package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_52_md_5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_52_md_5.files <h2>Question</h2>
 */

public class MD_5 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(encrypt(new Scanner(System.in).nextLine()));
    }

    private static String encrypt(final String DATA) {
        try {
            final MessageDigest MESSAGE_DIGITS = MessageDigest.getInstance("MD5");
            MESSAGE_DIGITS.update(DATA.getBytes());
            final byte[] DIGEST = MESSAGE_DIGITS.digest();
            final StringBuilder HEX_STRING = new StringBuilder();
            for (final byte SINGLE_BYTE : DIGEST) {
                final String HEX = Integer.toHexString(0xff & SINGLE_BYTE);
                if (HEX.length() == 1)
                    HEX_STRING.append('0');
                HEX_STRING.append(HEX);
            }
            return HEX_STRING.toString();
        } catch (final NoSuchAlgorithmException NO_SUCH_ALGORITHM_EXCEPTION) {
            throw new RuntimeException(NO_SUCH_ALGORITHM_EXCEPTION);
        }
    }
}