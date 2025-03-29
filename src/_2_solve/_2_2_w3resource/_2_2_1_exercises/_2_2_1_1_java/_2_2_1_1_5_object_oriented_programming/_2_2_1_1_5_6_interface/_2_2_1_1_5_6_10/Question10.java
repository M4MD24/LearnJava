package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_6_interface._2_2_1_1_5_6_10;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an interface Encryptable with methods encrypt (String data) and decrypt (String encryptedData) that define encryption and decryption operations. Create two classes AES and RSA that implement the Encryptable interface and provide their own encryption and decryption algorithms.</h2>
 */

public class Question10 {
    public static void main(final String[] ARGUMENTS) {
        AES();
        RSA();
    }

    private static void RSA() {
        final RSA RSA_ENCRYPTION = new RSA();
        System.out.println("\n■ RSA");

        final String ORIGINAL_TEXT = "Nullexia For Programming";
        System.out.println("Original Text: " + ORIGINAL_TEXT);

        final String ENCRYPTED_TEXT = RSA_ENCRYPTION.encrypt(ORIGINAL_TEXT);
        System.out.println("Encrypted Text: " + ENCRYPTED_TEXT);

        final String DECRYPTED_TEXT = RSA_ENCRYPTION.decrypt(ENCRYPTED_TEXT);
        System.out.print("Decrypted Text: " + DECRYPTED_TEXT);
    }

    private static void AES() {
        final AES AES_ENCRYPTION = new AES();
        System.out.println("■ AES");

        final String ORIGINAL_TEXT = "Nullexia For Programming";
        System.out.println("Original Text: " + ORIGINAL_TEXT);

        final String ENCRYPTED_TEXT = AES_ENCRYPTION.encrypt(ORIGINAL_TEXT);
        System.out.println("Encrypted Text: " + ENCRYPTED_TEXT);

        final String DECRYPTED_TEXT = AES_ENCRYPTION.decrypt(ENCRYPTED_TEXT);
        System.out.println("Decrypted Text: " + DECRYPTED_TEXT);
    }
}

interface Encryptable {
    String encrypt(final String DATA);

    String decrypt(final String ENCRYPTED_DATA);
}

class AES implements Encryptable {
    private static final String AES_ALGORITHM = "AES";
    private SecretKey secretKey;

    public AES() {
        try {
            final KeyGenerator KEY_GENERATOR = KeyGenerator.getInstance(AES_ALGORITHM);
            KEY_GENERATOR.init(128);
            secretKey = KEY_GENERATOR.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String encrypt(final String DATA) {
        try {
            final Cipher CIPHER = Cipher.getInstance(AES_ALGORITHM);
            CIPHER.init(Cipher.ENCRYPT_MODE, secretKey);
            final byte[] ENCRYPTED_BYTES = CIPHER.doFinal(DATA.getBytes());
            return Base64.getEncoder().encodeToString(ENCRYPTED_BYTES);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String decrypt(final String ENCRYPTED_DATA) {
        try {
            final byte[] ENCRYPTED_BYTES = Base64.getDecoder().decode(ENCRYPTED_DATA);
            final Cipher CIPHER = Cipher.getInstance(AES_ALGORITHM);
            CIPHER.init(Cipher.DECRYPT_MODE, secretKey);
            final byte[] DECRYPTED_BYTES = CIPHER.doFinal(ENCRYPTED_BYTES);
            return new String(DECRYPTED_BYTES);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

class RSA implements Encryptable {
    private static final String RSA_ALGORITHM = "RSA";
    private KeyPair keyPair;

    RSA() {
        try {
            final KeyPairGenerator KEY_GENERATE = KeyPairGenerator.getInstance(RSA_ALGORITHM);
            KEY_GENERATE.initialize(2048);
            keyPair = KEY_GENERATE.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String encrypt(final String DATA) {
        try {
            final PublicKey PUBLIC_KEY = keyPair.getPublic();
            final Cipher CIPHER = Cipher.getInstance(RSA_ALGORITHM);
            CIPHER.init(Cipher.ENCRYPT_MODE, PUBLIC_KEY);
            final byte[] ENCRYPTED_BYTES = CIPHER.doFinal(DATA.getBytes());
            return Base64.getEncoder().encodeToString(ENCRYPTED_BYTES);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String decrypt(final String ENCRYPTED_DATA) {
        try {
            final PrivateKey PRIVATE_KEY = keyPair.getPrivate();
            final byte[] ENCRYPTED_BYTES = Base64.getDecoder().decode(ENCRYPTED_DATA);
            final Cipher CIPHER = Cipher.getInstance(RSA_ALGORITHM);
            CIPHER.init(Cipher.DECRYPT_MODE, PRIVATE_KEY);
            final byte[] DECRYPTED_BYTES = CIPHER.doFinal(ENCRYPTED_BYTES);
            return new String(DECRYPTED_BYTES);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}