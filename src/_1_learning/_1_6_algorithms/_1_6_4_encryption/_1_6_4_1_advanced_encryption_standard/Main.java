package _1_learning._1_6_algorithms._1_6_4_encryption._1_6_4_1_advanced_encryption_standard;

public class Main {
    public static void main(final String[] ARGS) {
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