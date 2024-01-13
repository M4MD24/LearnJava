package _1_learn._1_1_basics._1_1_2_data_types;

import java.io.UnsupportedEncodingException;

public class DataTypes {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /* Data Types And Sizes! */
        /* Integer -> byte (1 byte),
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

        /* ■ String Methods
        |-------------------------|-------------------------------------------------------------------------|
        |  Method                 |  Description                                                            |
        |-------------------------|-------------------------------------------------------------------------|
        |  contains()             |  checks whether the string contains a substring                         |
        |  substring()            |  returns the substring of the string                                    |
        |  join()                 |  join the given strings using the delimiter                             |
        |  replace()              |  replaces the specified old character with the specified new character  |
        |  replaceAll()           |  replaces all substrings matching the regex pattern                     |
        |  replaceFirst()         |  replace the first matching substring                                   |
        |  charAt()               |  returns the character present in the specified location                |
        |  getBytes()             |  converts the string to an array of bytes                               |
        |  indexOf()              |  returns the position of the specified character in the string          |
        |  compareTo()            |  compares two strings in the dictionary order                           |
        |  compareToIgnoreCase()  |  compares two strings ignoring case differences                         |
        |  trim()                 |  removes any leading and trailing whitespaces                           |
        |  format()               |  returns a formatted string                                             |
        |  split()                |  breaks the string into an array of strings                             |
        |  toLowerCase()          |  converts the string to lowercase                                       |
        |  toUpperCase()          |  converts the string to uppercase                                       |
        |  valueOf()              |  returns the string representation of the specified argument            |
        |  toCharArray()          |  converts the string to a char array                                    |
        |  matches()              |  checks whether the string matches the given regex                      |
        |  startsWith()           |  checks if the string begins with the given string                      |
        |  endsWith()             |  checks if the string ends with the given string                        |
        |  isEmpty()              |  checks whether a string is empty of not                                |
        |  intern()               |  returns the canonical representation of the string                     |
        |  contentEquals()        |  checks whether the string is equal to charSequence                     |
        |  hashCode()             |  returns a hash code for the string                                     |
        |  subSequence()          |  returns a subsequence from the string                                  |
        |-------------------------|-------------------------------------------------------------------------|
        */
    }
}