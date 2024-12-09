package _1_learn._1_1_basics._1_1_16_escape_sequences;

/**
 * <h1>Escape Sequences</h1>
 * <h2>\n - Newline</h2>
 * <p>Represents a newline character.</p>
 * <p>Used to insert a new line in the text. When printed, it adds a new line.</p>
 * <br/>
 * <h2>\b - Backspace</h2>
 * <p>Represents the backspace character.</p>
 * <p>Used to delete one character in the text or move the cursor backward by one character.</p>
 * <br/>
 * <h2>\t - Tab</h2>
 * <p>Represents the tab character.</p>
 * <p>Used to add horizontal spacing (tabs) between texts or characters. Often used for formatting.</p>
 * <br/>
 * <h2>\r - Carriage Return</h2>
 * <p>Represents the carriage return character.</p>
 * <p>Used to return to the beginning of the line without adding a new line. Sometimes used in text formatting.</p>
 * <br/>
 * <h2>\" - Double Quotation Mark</h2>
 * <p>Represents a double quotation mark character.</p>
 * <p>Used to include double quotation marks within a text string.</p>
 * <br/>
 * <h2>\\ - Backslash</h2>
 * <p>Represents the backslash character itself.</p>
 * <p>Used to escape the special meaning of the backslash in text strings.</p>
 */

/* √ Escape Sequences = Escape Characters */

public class EscapeSequencesExample {
    public static void main(final String[] PARAMETERS) {
        String normalText = "Native Android Developer";
        String withNewLine = "Native(\n)Android Developer";
        String withBackSpace = "Native(\b)Android Developer";
        String withTab = "Native(\t)Android Developer";
        String withCarriageReturn = "Native(\r)Android Developer";
        String withDoubleQuotationMark = "Native(\")Android Developer";
        String withBackSlash = "Native(\\)Android Developer";

        System.out.println("-----(normalText)-----");
        System.out.println(normalText);
        System.out.println("\n-----(withNewLine)-----");
        System.out.println(withNewLine);
        System.out.println("\n-----(withBackSpace)-----");
        System.out.println(withBackSpace);
        System.out.println("\n-----(withTab)-----");
        System.out.println(withTab);
        System.out.println("\n-----(withCarriageReturn)-----");
        System.out.println(withCarriageReturn);
        System.out.println("\n-----(withDoubleQuotationMark)-----");
        System.out.println(withDoubleQuotationMark);
        System.out.println("\n-----(withBackSlash)-----");
        System.out.print(withBackSlash);
    }
}