package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_10_memento_pattern;

class TextEditor {
    private String text = "";

    public void write(String newText) {
        text += newText;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.state();
    }

    public void show() {
        System.out.println(text);
    }
}