package _1_learning._1_6_algorithms._1_6_4_encryption._1_6_4_1_advanced_encryption_standard;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

// (AES) Advanced Encryption Standard

class AdvancedEncryptionStandard {
    private static final String AES_ALGORITHM = "AES";
    private SecretKey secretKey;

    AdvancedEncryptionStandard() {
        try {
            final KeyGenerator KEY_GENERATOR = KeyGenerator.getInstance(AES_ALGORITHM);
            KEY_GENERATOR.init(128);
            secretKey = KEY_GENERATOR.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String encrypt(final String DATA) {
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

    String decrypt(final String ENCRYPTED_DATA) {
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