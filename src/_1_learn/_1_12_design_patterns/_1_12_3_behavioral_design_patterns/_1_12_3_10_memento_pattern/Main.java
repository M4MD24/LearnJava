package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_10_memento_pattern;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        TextEditor editor = new TextEditor();

        editor.write("Hello");
        Memento savedState = editor.save();

        editor.write(", World!");
        editor.show();

        editor.restore(savedState);
        editor.show();
    }
}