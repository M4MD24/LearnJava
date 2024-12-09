package _1_learn._1_6_algorithms._1_6_4_encryption_and_decryption._1_6_4_4_message_digest_5;

public class Main {
    public static void main(final String[] PARAMETERS) {
        final MessageDigest5 MS5_ENCRYPTION = new MessageDigest5();
        System.out.println("■ MS5");

        final String ORIGINAL_TEXT = "Nullexia For Programming";
        System.out.println("Original Text: " + ORIGINAL_TEXT);

        final String ENCRYPTED_TEXT = MS5_ENCRYPTION.encrypt(ORIGINAL_TEXT);
        System.out.println("Encrypted Text: " + ENCRYPTED_TEXT);

        final String DECRYPTED_TEXT = MS5_ENCRYPTION.decrypt(ENCRYPTED_TEXT);
        System.out.print("Decrypted Text: " + DECRYPTED_TEXT);
    }
}