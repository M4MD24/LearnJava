package _1_learning._1_6_algorithms._1_6_4_encryption_and_decryption._1_6_4_3_secure_hash_algorithms_256;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class SecureHashAlgorithm256 {
    String encrypt(final String DATA) {
        try {
            byte[] hash = getSHA(DATA);
            return toHexString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    String decrypt(final String ENCRYPTED_DATA) {
        throw new UnsupportedOperationException("SHA-256 is a one-way hashing function; decryption is not possible.");
    }

    byte[] getSHA(final String DATA) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256")
                .digest(DATA.getBytes(StandardCharsets.UTF_8));
    }

    String toHexString(final byte[] HASH) {
        final StringBuilder HEX_STRING = new StringBuilder(new BigInteger(1, HASH).toString(16));
        while (HEX_STRING.length() < 64)
            HEX_STRING.insert(0, '0');
        return HEX_STRING.toString();
    }
}