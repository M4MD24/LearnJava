package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_9;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to print characters between two characters (i.e. A to P).</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Prints 20 characters per line</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
 * <br/>
 * < = > ? @ A B C D E F G H I J K L M N O
 * <br/>
 * P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
 * <br/>
 * d e f g h i j k l m n o p q r s t u v w
 * <br/>
 * x y z
 * </h2>
 */
public class Question9 {
    public static void main(final String[] PARAMETERS) {
        printCharacters('(', 'z', 20);
    }

    private static void printCharacters(final char START_CHARACTER, final char END_CHARACTER, final int CHARACTERS_PER_LINE) {
        for (char currentCharacter = START_CHARACTER; currentCharacter <= END_CHARACTER; currentCharacter++) {
            System.out.printf("%c ", currentCharacter);
            if ((currentCharacter + 1) % CHARACTERS_PER_LINE == 0)
                System.out.println();
        }
    }
}