package _1_learning._1_6_algorithms._1_6_4_encryption_and_decryption._1_6_4_4_message_digest_5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class MessageDigest5 {
    String encrypt(final String DATA) {
        try {
            final MessageDigest MESSAGE_DIGITS = MessageDigest.getInstance("MD5");
            MESSAGE_DIGITS.update(DATA.getBytes());
            final byte[] DIGEST = MESSAGE_DIGITS.digest();
            final StringBuilder HEX_STRING = new StringBuilder();
            for (final byte SINGLE_BYTE : DIGEST) {
                final String HEX = Integer.toHexString(0xff & SINGLE_BYTE);
                if (HEX.length() == 1)
                    HEX_STRING.append('0');
                HEX_STRING.append(HEX);
            }
            return HEX_STRING.toString();
        } catch (final NoSuchAlgorithmException NO_SUCH_ALGORITHM_EXCEPTION) {
            throw new RuntimeException(NO_SUCH_ALGORITHM_EXCEPTION);
        }
    }

    String decrypt(final String ENCRYPTED_DATA) {
        return "MD5 hashes cannot be decrypted";
    }
}
