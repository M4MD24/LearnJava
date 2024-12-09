package _1_learn._1_6_algorithms._1_6_4_encryption_and_decryption._1_6_4_2_rivest_shamir_adleman;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

// (RSA) Rivest-Shamir-Adleman

class RivestShamirAdleman {
    private static final String RSA_ALGORITHM = "RSA";
    private KeyPair keyPair;

    RivestShamirAdleman() {
        try {
            final KeyPairGenerator KEY_GENERATE = KeyPairGenerator.getInstance(RSA_ALGORITHM);
            KEY_GENERATE.initialize(2048);
            keyPair = KEY_GENERATE.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String encrypt(final String DATA) {
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

    String decrypt(final String ENCRYPTED_DATA) {
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