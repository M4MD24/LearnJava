package _2_data_types;

import java.io.UnsupportedEncodingException;
import static java.nio.charset.StandardCharsets.*;
import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /* Data Types And Sizes! */
        /*
         *
         * Integer -> byte (1 byte),
         *            short (2 bytes),
         *            int (4 bytes),
         *            long (8 bytes)
         * Float -> float (4 bytes),
         *          double (8 bytes)
         * Boolean -> false, true (2 bytes)
         * Character -> char (2 bytes)
         * String -> String (
         *      If String length = 1
         *      (UTF-8)      1 byte,
         *      (ISO-8859-1) 1 byte,
         *      (US-ASCII)   1 byte,
         *      (UTF-16LE)   2 bytes,
         *      (UTF-16BE)   2 bytes,
         *      (UTF-16)     4 bytes,
         *      (UTF-32)     4 bytes,
         * )
         */

//        Integer
        byte byteVariable = 127;
        byte byteVariable2 = 'A';

        short shortVariable = 32_767;
        short shortVariable2 = 'A';

        int intVariable = 2_147_483_647;
        int intVariable2 = 'A';

        long longVariable = 9_223_372_036_854_775_807L;
        long longVariable2 = 'A';

//        Float
        float floatVariable = 3.4028235E38F;
        float floatVariable2 = 'A';

        double doubleVariable = 1.7976931348623157E308;
        double doubleVariable2 = 'A';

//        Boolean
        boolean booleanVariable = true;
        boolean booleanVariable2 = false;

//        Character
        char charVariable = 'A';
        char charVariable2 = '\uFFFF';
        char charVariable3 = 65535;

//        String
        String stringVariable = "A";

/*        String Converting

        byte[] utf_8_Bytes = stringVariable.getBytes(UTF_8);
        String utf_8_BytesConvertedString = new String(utf_8_Bytes, UTF_8);
        System.out.println("Original String: " + stringVariable);
        System.out.println("UTF-8 Byte Array: " + Arrays.toString(utf_8_Bytes));
        System.out.println("Converted String: " + utf_8_BytesConvertedString);

        byte[] iso_8859_1Bytes = stringVariable.getBytes(ISO_8859_1);
        String iso_8859_1BytesConvertedString = new String(iso_8859_1Bytes, ISO_8859_1);
        System.out.println("Original String: " + stringVariable);
        System.out.println("ISO-8859-1 Byte Array: " + Arrays.toString(iso_8859_1Bytes));
        System.out.println("Converted String: " + iso_8859_1BytesConvertedString);

        byte[] us_ASCIIBytes = stringVariable.getBytes(US_ASCII);
        String us_ASCIIBytesConvertedString = new String(us_ASCIIBytes, US_ASCII);
        System.out.println("Original String: " + stringVariable);
        System.out.println("US-ASCII Byte Array: " + Arrays.toString(us_ASCIIBytes));
        System.out.println("Converted String: " + us_ASCIIBytesConvertedString);

        byte[] utf16LEBytes = stringVariable.getBytes(UTF_16LE);
        String utf16LEBytesConvertedString = new String(utf16LEBytes, UTF_16LE);
        System.out.println("Original String: " + stringVariable);
        System.out.println("UTF-16LE Byte Array: " + Arrays.toString(utf16LEBytes));
        System.out.println("Converted String: " + utf16LEBytesConvertedString);

        byte[] utf16BEBytes = stringVariable.getBytes(UTF_16BE);
        String utf16BEBytesConvertedString = new String(utf16BEBytes, UTF_16BE);
        System.out.println("Original String: " + stringVariable);
        System.out.println("UTF-16BE Byte Array: " + Arrays.toString(utf16BEBytes));
        System.out.println("Converted String: " + utf16BEBytesConvertedString);

        byte[] utf_16Bytes = stringVariable.getBytes(UTF_16);
        String utf_16BytesConvertedString = new String(utf_16Bytes, UTF_16);
        System.out.println("Original String: " + stringVariable);
        System.out.println("UTF-16 Byte Array: " + Arrays.toString(utf_16Bytes));
        System.out.println("Converted String: " + utf_16BytesConvertedString);

        byte[] utf_32Bytes = stringVariable.getBytes("UTF-32");
        String utf_32BytesConvertedString = new String(utf_32Bytes, "UTF-32");
        System.out.println("Original String: " + stringVariable);
        System.out.println("UTF-32 Byte Array: " + Arrays.toString(utf_32Bytes));
        System.out.println("Converted String: " + utf_32BytesConvertedString);
*/

/*        String types bytes

        byte[] utf_8_Bytes = stringVariable.getBytes(UTF_8);
        int sizeInBytesUTF_8 = utf_8_Bytes.length;
        System.out.println("The size of the string (UTF-8) is " + sizeInBytesUTF_8 + " bytes.");

        byte[] iso_8859_1Bytes = stringVariable.getBytes(ISO_8859_1);
        int sizeInBytesISO_8859_1 = iso_8859_1Bytes.length;
        System.out.println("The size of the string (ISO-8859-1) is " + sizeInBytesISO_8859_1 + " bytes.");

        byte[] us_ASCIIBytes = stringVariable.getBytes(US_ASCII);
        int sizeInBytesUS_ASCII = us_ASCIIBytes.length;
        System.out.println("The size of the string (US-ASCII) is " + sizeInBytesUS_ASCII + " bytes.");

        byte[] utf16LEBytes = stringVariable.getBytes(UTF_16LE);
        int sizeInBytesUTF_16LE = utf16LEBytes.length;
        System.out.println("The size of the string (UTF-16LE) is " + sizeInBytesUTF_16LE + " bytes.");

        byte[] utf16BEBytes = stringVariable.getBytes(UTF_16BE);
        int sizeInBytesUTF_16BE = utf16BEBytes.length;
        System.out.println("The size of the string (UTF-16BE) is " + sizeInBytesUTF_16BE + " bytes.");

        byte[] utf_16Bytes = stringVariable.getBytes(UTF_16);
        int sizeInBytesUTF_16 = utf_16Bytes.length;
        System.out.println("The size of the string (UTF-16) is " + sizeInBytesUTF_16 + " bytes.");

        try {
            byte[] utf_32Bytes = stringVariable.getBytes("UTF-32");
            int sizeInBytesUTF_32 = utf_32Bytes.length;
            System.out.println("The size of the string (UTF-32) is " + sizeInBytesUTF_32 + " bytes.");
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
*/
    }
}