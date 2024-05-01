package _1_learning._1_1_basics._1_1_17_text_color_strings;

/*
# Text Color

## Text Colors

- Black  | "\u001B[30m"
- Red    | "\u001B[31m"
- Green  | "\u001B[32m"
- Yellow | "\u001B[33m"
- Blue   | "\u001B[34m"
- Purple | "\u001B[35m"
- Cyan   | "\u001B[36m"
- White  | "\u001B[37m"

## Text Background Colors

- Black  BACKGROUND | "\u001B[40m"
- Red    BACKGROUND | "\u001B[41m"
- Green  BACKGROUND | "\u001B[42m"
- Yellow BACKGROUND | "\u001B[43m"
- Blue   BACKGROUND | "\u001B[44m"
- Purple BACKGROUND | "\u001B[45m"
- Cyan   BACKGROUND | "\u001B[46m"
- White  BACKGROUND | "\u001B[47m"

- Reset text color and background | "\u001B[0m"
*/

public class TextColorStringsExample {
    private static final String BLACK_TEXT_COLOR = "\u001B[30m",
            RED_TEXT_COLOR = "\u001B[31m",
            GREEN_TEXT_COLOR = "\u001B[32m",
            YELLOW_TEXT_COLOR = "\u001B[33m",
            BLUE_TEXT_COLOR = "\u001B[34m",
            PURPLE_TEXT_COLOR = "\u001B[35m",
            CYAN_TEXT_COLOR = "\u001B[36m",
            WHITE_TEXT_COLOR = "\u001B[37m";
    private static final String BLACK_BACKGROUND_TEXT_COLOR = "\u001B[40m",
            RED_BACKGROUND_TEXT_COLOR = "\u001B[41m",
            GREEN_BACKGROUND_TEXT_COLOR = "\u001B[42m",
            YELLOW_BACKGROUND_TEXT_COLOR = "\u001B[43m",
            BLUE_BACKGROUND_TEXT_COLOR = "\u001B[44m",
            PURPLE_BACKGROUND_TEXT_COLOR = "\u001B[45m",
            CYAN_BACKGROUND_TEXT_COLOR = "\u001B[46m",
            WHITE_BACKGROUND_TEXT_COLOR = "\u001B[47m";
    private static final String NORMAL_TEXT_COLOR_AND_BACKGROUND = "\u001B[0m";

    public static void main(final String[] ARGS) {
        printTextColors();
        printTextBackgroundColors();
        printTextBackgroundColorsAndColors();
    }

    private static void printTextBackgroundColorsAndColors() {
        System.out.println("# Text Background Colors and Colors");
        System.out.println(STR."- Normal: \{NORMAL_TEXT_COLOR_AND_BACKGROUND}Salam");
        System.out.println(STR."- Black : \{BLACK_TEXT_COLOR}\{BLACK_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Red   : \{RED_TEXT_COLOR}\{RED_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Green : \{GREEN_TEXT_COLOR}\{GREEN_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Yellow: \{YELLOW_TEXT_COLOR}\{YELLOW_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Blue  : \{BLUE_TEXT_COLOR}\{BLUE_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Purple: \{PURPLE_TEXT_COLOR}\{PURPLE_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Cyan  : \{CYAN_TEXT_COLOR}\{CYAN_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- White : \{WHITE_TEXT_COLOR}\{WHITE_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
    }

    private static void printTextBackgroundColors() {
        System.out.println("# Text Background Colors");
        System.out.println(STR."- Normal: \{NORMAL_TEXT_COLOR_AND_BACKGROUND}Salam");
        System.out.println(STR."- Black : \{BLACK_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Red   : \{RED_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Green : \{GREEN_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Yellow: \{YELLOW_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Blue  : \{BLUE_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Purple: \{PURPLE_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Cyan  : \{CYAN_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- White : \{WHITE_BACKGROUND_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}\n");
    }

    private static void printTextColors() {
        System.out.println("# Text Colors");
        System.out.println(STR."- Normal: \{NORMAL_TEXT_COLOR_AND_BACKGROUND}Salam");
        System.out.println(STR."- Black : \{BLACK_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Red   : \{RED_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Green : \{GREEN_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Yellow: \{YELLOW_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Blue  : \{BLUE_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Purple: \{PURPLE_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- Cyan  : \{CYAN_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}");
        System.out.println(STR."- White : \{WHITE_TEXT_COLOR}Salam\{NORMAL_TEXT_COLOR_AND_BACKGROUND}\n");
    }
}