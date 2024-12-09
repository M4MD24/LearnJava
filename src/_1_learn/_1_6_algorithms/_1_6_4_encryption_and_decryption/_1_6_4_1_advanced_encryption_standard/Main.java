package _1_learn._1_6_algorithms._1_6_4_encryption_and_decryption._1_6_4_1_advanced_encryption_standard;

public class Main {
    public static void main(final String[] PARAMETERS) {
        final AdvancedEncryptionStandard AES_ENCRYPTION = new AdvancedEncryptionStandard();
        System.out.println("■ AES");

        final String ORIGINAL_TEXT = "Nullexia For Programming";
        System.out.println("Original Text: " + ORIGINAL_TEXT);

        final String ENCRYPTED_TEXT = AES_ENCRYPTION.encrypt(ORIGINAL_TEXT);
        System.out.println("Encrypted Text: " + ENCRYPTED_TEXT);

        final String DECRYPTED_TEXT = AES_ENCRYPTION.decrypt(ENCRYPTED_TEXT);
        System.out.println("Decrypted Text: " + DECRYPTED_TEXT);
    }
}