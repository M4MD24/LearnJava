package _1_learning._1_3_object_oriented_programming._1_3_20_wrapper_classes;

import java.util.Arrays;

public class WrapperObjectExample {
    public static void main(final String[] PARAMETERS) {
        /* String Sizes by Some Type! */
        /* String -> String (
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

        Byte byteVariable = Byte.MAX_VALUE;
        System.out.println("Byte      = " + byteVariable);

        Short shortVariable = Short.MAX_VALUE;
        System.out.println("Short     = " + shortVariable);

        Integer integerVariable = Integer.MAX_VALUE;
        System.out.println("Integer   = " + integerVariable);

        Long longVariable = Long.MAX_VALUE;
        System.out.println("Long      = " + longVariable);

        Double doubleVariable = Double.MAX_VALUE;
        System.out.println("Double    = " + doubleVariable);

        Character characterVariable = Character.MAX_VALUE;
        System.out.println("Character = " + characterVariable);

        Boolean booleanVariable = Boolean.TRUE;
        System.out.println("Boolean = " + booleanVariable);
    }
}