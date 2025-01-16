package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_1_adapter_pattern;

public class PrinterAdapter implements PrinterServices {
    private final _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_1_adapter_pattern.Printer Printer;

    public PrinterAdapter() {
        this.Printer = new Printer();
    }

    @Override
    public void print() {
        Printer.printDocument();
    }
}