package _1_learning._1_1_basics._1_1_2_data_types;

import java.util.Arrays;

public class DataTypes {
    public static void main(final String[] ARGS) {
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
         *      (UTF-32)     4 bytes
         * )
         */

//        Integer
        byte byteVariable = 127;
        System.out.println("\nbyteVariable                  : " + byteVariable);
        byte byteVariable2 = 'A';
        System.out.println("byteVariable2                 : " + byteVariable2);

        short shortVariable = 32_767;
        System.out.println("\nshortVariable                 : " + shortVariable);
        short shortVariable2 = 'A';
        System.out.println("shortVariable2                : " + shortVariable2);

        int intVariable = 2_147_483_647;
        System.out.println("\nintVariable                   : " + intVariable);
        int intVariable2 = 'A';
        System.out.println("intVariable2                  : " + intVariable2);

        long longVariable = 9_223_372_036_854_775_807L;
        System.out.println("\nlongVariable                  : " + longVariable);
        long longVariable2 = 'A';
        System.out.println("longVariable2                 : " + longVariable2);

//        Float
        float floatVariable = 3.4028235E38F;
        System.out.println("\nfloatVariable                 : " + floatVariable);
        float floatVariable2 = 'A';
        System.out.println("floatVariable2                : " + floatVariable2);

        double doubleVariable = 1.7976931348623157E308;
        System.out.println("\ndoubleVariable                : " + doubleVariable);
        double doubleVariable2 = 'A';
        System.out.println("doubleVariable2               : " + doubleVariable2);

//        Boolean
        boolean booleanVariable = true;
        System.out.println("\nbooleanVariable               : " + booleanVariable);
        boolean booleanVariable2 = false;
        System.out.println("booleanVariable2              : " + booleanVariable2);

//        Character
        char charVariable = 'A';
        System.out.println("\ncharVariable                  : " + charVariable);
        char charVariable2 = '\uFFFF';
        System.out.println("charVariable2                 : " + charVariable2);
        char charVariable3 = 65535;
        System.out.println("charVariable3                 : " + charVariable3);

//        String
        String stringVariable = "AA aa";
        System.out.println("\nstringVariable                : " + stringVariable);

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
        |  formatted()            |  returns a formatted string                                             |
        |  split()                |  breaks the string into an array of strings                             |
        |  toLowerCase()          |  converts the string to lowercase                                       |
        |  toUpperCase()          |  converts the string to uppercase                                       |
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

        System.out.println("(" + stringVariable + ") .contains()           : " + stringVariable.contains("a"));
        System.out.println("(" + stringVariable + ") .subString()          : " + stringVariable.substring(1));
        System.out.println("(" + stringVariable + ") .replace()            : " + stringVariable.replace("a", "A"));
        System.out.println("(" + stringVariable + ") .replaceAll()         : " + stringVariable.replaceAll("A", "a"));
        System.out.println("(" + stringVariable + ") .replaceFirst()       : " + stringVariable.replaceFirst("a", "A"));
        System.out.println("(" + stringVariable + ") .charAt()             : " + stringVariable.charAt(1));
        System.out.println("(" + stringVariable + ") .getBytes()           : " + Arrays.toString(stringVariable.getBytes()));
        System.out.println("(" + stringVariable + ") .indexOf()            : " + stringVariable.indexOf("a"));
        System.out.println("(" + stringVariable + ") .compareTo()          : " + stringVariable.compareTo("a"));
        System.out.println("(" + stringVariable + ") .compareToIgnoreCase(): " + stringVariable.compareToIgnoreCase("aa"));
        System.out.println("(" + stringVariable + ") .trim()               : " + stringVariable.trim());
        System.out.println("(" + stringVariable + ") .formatted()          : " + stringVariable.formatted());
        System.out.println("(" + stringVariable + ") .split()              : " + Arrays.toString(stringVariable.split("A")));
        System.out.println("(" + stringVariable + ") .toLowerCase()        : " + stringVariable.toLowerCase());
        System.out.println("(" + stringVariable + ") .toUpperCase()        : " + stringVariable.toUpperCase());
        System.out.println("(" + stringVariable + ") .toCharArray()        : " + Arrays.toString(stringVariable.toCharArray()));
        System.out.println("(" + stringVariable + ") .matches()            : " + stringVariable.matches("AA aa"));
        System.out.println("(" + stringVariable + ") .startsWith()         : " + stringVariable.startsWith("AA"));
        System.out.println("(" + stringVariable + ") .endsWith()           : " + stringVariable.endsWith("aa"));
        System.out.println("(" + stringVariable + ") .isEmpty()            : " + stringVariable.isEmpty());
        System.out.println("(" + stringVariable + ") .intern()             : " + stringVariable.intern());
        System.out.println("(" + stringVariable + ") .contentEquals()      : " + stringVariable.contentEquals("AA aa"));
        System.out.println("(" + stringVariable + ") .hashCode()           : " + stringVariable.hashCode());
        System.out.println("(" + stringVariable + ") .subSequence()        : " + stringVariable.subSequence(1, 4) + "\n");
        System.out.println("(" + stringVariable + ") .concat()             : " + stringVariable.concat("Aa") + "\n");

        var intVar = 100; // int
        System.out.println("intVar                        : " + intVar);

        var doubleVar = 1.90; // double
        System.out.println("doubleVar                     : " + doubleVar);

        var charVar = 'a'; // char
        System.out.println("charVar                       : " + charVar);

        var stringVar = "Aa"; // string
        System.out.println("stringVar                     : " + stringVar);

        var booleanVar = true; // boolean
        System.out.println("booleanVar                    : " + booleanVar);
    }
}