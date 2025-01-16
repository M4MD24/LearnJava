package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_1_adapter_pattern;

public class Main {
    public static void main(final String[] PARAMETERS) {
        final PrinterAdapter PRINTER_ADAPTER = new PrinterAdapter();
        PRINTER_ADAPTER.print();
    }
}