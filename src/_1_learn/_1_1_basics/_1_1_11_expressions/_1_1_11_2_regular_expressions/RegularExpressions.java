package _1_learn._1_1_basics._1_1_11_expressions._1_1_11_2_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(final String[] PARAMETERS) {
        regularExpressionWithSplit();

        regularExpressionsWithCaseInsensitive();
        regularExpressionsWithUnixLines();
        regularExpressionsWithUnicodeCase();
        regularExpressionsWithUnicodeCharacterClass();
        regularExpressionsWithMultiline();
        regularExpressionsWithLiteral();
        regularExpressionsWithDotAll();
        regularExpressionsWithComments();
        regularExpressionsWithCanonEQ();
    }

    private static void regularExpressionWithSplit() {
        String words = "One Two     Three\n\n\n\n\nFour\t\t\t\t\tFive Six Seven Eight Nine";

        String whiteSpaces = "\\s"; // Matches any whitespace
        String sequenceWhiteSpace = "\\s+"; // Matches a sequence of whitespace
        String zeroOrMoreWhiteSpace = "\\s*"; // Matches zero or more whitespace
        String tabCharacter = "\\t"; // Matches the Tab character
        String newLines = "\\n"; // Matches Newline
        String wordBoundary = "\\b"; // Matches a Word Boundary

        System.out.println("whiteSpaces = " + words.split(whiteSpaces).length);

        System.out.println("sequenceWhiteSpace = " + words.split(sequenceWhiteSpace).length);

        System.out.println("zeroOrMoreWhiteSpace = " + words.split(zeroOrMoreWhiteSpace).length);

        System.out.println("tabCharacter = " + words.split(tabCharacter).length);

        System.out.println("newLines = " + words.split(newLines).length);

        System.out.println("backSpaces = " + words.split(wordBoundary).length + "\n");
    }

    private static void regularExpressionsWithCaseInsensitive() {
        Pattern pattern = Pattern.compile("Salam", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Salam\nSalam");
        System.out.print("Pattern.CASE_INSENSITIVE       : ");
        boolean matchFound = matcher.find();
        if (matchFound) System.out.println("Match found");
        else System.out.println("Match not found");
    }

    private static void regularExpressionsWithUnixLines() {
        Pattern pattern = Pattern.compile("Salam", Pattern.UNIX_LINES);
        Matcher matcher = pattern.matcher("Salam\nSalam");
        System.out.print("Pattern.UNIX_LINES             : ");
        boolean matchFound = matcher.find();
        if (matchFound) System.out.println("Match found");
        else System.out.println("Match not found");
    }

    private static void regularExpressionsWithUnicodeCase() {
        Pattern pattern = Pattern.compile("Salam", Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher("Salam\nSalam");
        System.out.print("Pattern.UNICODE_CASE           : ");
        boolean matchFound = matcher.find();
        if (matchFound) System.out.println("Match found");
        else System.out.println("Match not found");
    }

    private static void regularExpressionsWithUnicodeCharacterClass() {
        Pattern pattern = Pattern.compile("Salam", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher("Salam\nSalam");
        System.out.print("Pattern.UNICODE_CHARACTER_CLASS: ");
        boolean matchFound = matcher.find();
        if (matchFound) System.out.println("Match found");
        else System.out.println("Match not found");
    }

    private static void regularExpressionsWithMultiline() {
        Pattern pattern = Pattern.compile("Salam", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher("Salam\nSalam");
        System.out.print("Pattern.MULTILINE              : ");
        boolean matchFound = matcher.find();
        if (matchFound) System.out.println("Match found");
        else System.out.println("Match not found");
    }

    private static void regularExpressionsWithLiteral() {
        Pattern pattern = Pattern.compile("Salam", Pattern.LITERAL);
        Matcher matcher = pattern.matcher("Salam\nSalam");
        System.out.print("Pattern.LITERAL                : ");
        boolean matchFound = matcher.find();
        if (matchFound) System.out.println("Match found");
        else System.out.println("Match not found");
    }

    private static void regularExpressionsWithDotAll() {
        Pattern pattern = Pattern.compile("Salam", Pattern.DOTALL);
        Matcher matcher = pattern.matcher("Salam\nSalam");
        System.out.print("Pattern.DOTALL                 : ");
        boolean matchFound = matcher.find();
        if (matchFound) System.out.println("Match found");
        else System.out.println("Match not found");
    }

    private static void regularExpressionsWithComments() {
        Pattern pattern = Pattern.compile("Salam", Pattern.COMMENTS);
        Matcher matcher = pattern.matcher("Salam\nSalam");
        System.out.print("Pattern.COMMENTS               : ");
        boolean matchFound = matcher.find();
        if (matchFound) System.out.println("Match found");
        else System.out.println("Match not found");
    }

    private static void regularExpressionsWithCanonEQ() {
        Pattern pattern = Pattern.compile("Salam", Pattern.CANON_EQ);
        Matcher matcher = pattern.matcher("Salam\nSalam");
        System.out.print("Pattern.CANON_EQ               : ");
        boolean matchFound = matcher.find();
        if (matchFound) System.out.println("Match found");
        else System.out.println("Match not found");
    }
}