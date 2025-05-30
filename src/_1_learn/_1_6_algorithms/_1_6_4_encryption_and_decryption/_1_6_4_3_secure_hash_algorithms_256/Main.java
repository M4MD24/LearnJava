package _1_learn._1_6_algorithms._1_6_4_encryption_and_decryption._1_6_4_3_secure_hash_algorithms_256;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(final String[] ARGUMENTS) throws NoSuchAlgorithmException {
        final SecureHashAlgorithm256 HSA_256_ENCRYPTION = new SecureHashAlgorithm256();
        System.out.println("■ SHA-256");

        final String ORIGINAL_TEXT = "Nullexia For Programming";
        System.out.println("Original Text: " + ORIGINAL_TEXT);

        final String ENCRYPTED_TEXT = HSA_256_ENCRYPTION.encrypt(ORIGINAL_TEXT);
        System.out.println("Encrypted Text: " + ENCRYPTED_TEXT);

        final String DECRYPTED_TEXT = HSA_256_ENCRYPTION.decrypt(ENCRYPTED_TEXT);
        System.out.print("Decrypted Text: " + DECRYPTED_TEXT);
    }
}