package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_w_encrypt_and_decrypt_message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>W. Encrypt and Decrypt Message</h1>
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
 * <h1>Question:</h1>
 * <h2>Given a number Q and a string S. If Q is equal to 1 then print S after encrypting it otherwise, print S after decrypting it.</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_w_encrypt_and_decrypt_message.images <h2>(Example and Note) & (Examples)</h2>
 */

public class EncryptAndDecryptMessageExample {
    public static void main(final String[] ARGS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        encryptOrDecryptMessage(Byte.parseByte(INPUT.readLine()), new StringBuilder(INPUT.readLine()));
    }

    private static void encryptOrDecryptMessage(final byte COMMAND, final StringBuilder MESSAGE) {
        final StringBuilder ENCRYPT = new StringBuilder("PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/"),
                DECRYPT = new StringBuilder("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (COMMAND == 1)
            for (int index = 0; index < MESSAGE.length(); index++)
                System.out.print(ENCRYPT.charAt(DECRYPT.indexOf(String.valueOf(MESSAGE.charAt(index)))));
        else
            for (int index = 0; index < MESSAGE.length(); index++)
                System.out.print(DECRYPT.charAt(ENCRYPT.indexOf(String.valueOf(MESSAGE.charAt(index)))));
    }
}