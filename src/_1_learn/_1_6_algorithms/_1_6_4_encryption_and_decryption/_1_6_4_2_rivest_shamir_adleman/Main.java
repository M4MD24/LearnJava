package _1_learn._1_6_algorithms._1_6_4_encryption_and_decryption._1_6_4_2_rivest_shamir_adleman;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        final RivestShamirAdleman RSA_ENCRYPTION = new RivestShamirAdleman();
        System.out.println("■ RSA");

        final String ORIGINAL_TEXT = "Nullexia For Programming";
        System.out.println("Original Text: " + ORIGINAL_TEXT);

        final String ENCRYPTED_TEXT = RSA_ENCRYPTION.encrypt(ORIGINAL_TEXT);
        System.out.println("Encrypted Text: " + ENCRYPTED_TEXT);

        final String DECRYPTED_TEXT = RSA_ENCRYPTION.decrypt(ENCRYPTED_TEXT);
        System.out.print("Decrypted Text: " + DECRYPTED_TEXT);
    }
}