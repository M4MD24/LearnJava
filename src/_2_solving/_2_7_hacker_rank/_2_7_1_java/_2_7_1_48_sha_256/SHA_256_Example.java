package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_48_sha_256;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_48_sha_256.files <h2>Question</h2>
 */

public class SHA_256_Example {
    public static void main(final String[] PARAMETERS) {
        System.out.print(encrypt(new Scanner(System.in).nextLine()));
    }

    private static String encrypt(final String DATA) {
        try {
            byte[] hash = getSHA(DATA);
            return toHexString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] getSHA(final String DATA) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256")
                .digest(DATA.getBytes(StandardCharsets.UTF_8));
    }

    private static String toHexString(final byte[] HASH) {
        final StringBuilder HEX_STRING = new StringBuilder(new BigInteger(1, HASH).toString(16));
        while (HEX_STRING.length() < 64)
            HEX_STRING.insert(0, '0');
        return HEX_STRING.toString();
    }
}