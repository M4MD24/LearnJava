package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models.Element;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models.Pen;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models.Pencil;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models.PencilSharpener;

import java.util.List;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        final List<Element> elements = List.of(
                new Pen(),
                new Pencil(),
                new Pencil(),
                new PencilSharpener()
        );
        printTotalPrice(elements);
    }

    private static void printTotalPrice(final List<Element> elements) {
        final TotalPricesCalculator TOTAL_PRICE_CALCULATOR = new TotalPricesCalculator();

        final StringBuilder OUTPUT = new StringBuilder();
        for (Element element : elements) {
            element.accept(TOTAL_PRICE_CALCULATOR);
            OUTPUT.append(getElementPrice(element, TOTAL_PRICE_CALCULATOR)).append("£ + ");
        }

        OUTPUT.setLength(OUTPUT.length() - 3);
        OUTPUT.append(" = ")
                .append(TOTAL_PRICE_CALCULATOR.getTotalPrices())
                .append("£");

        System.out.print(OUTPUT);
    }

    private static double getElementPrice(
            final Element ELEMENT,
            final TotalPricesCalculator TOTAL_PRICE_CALCULATOR
    ) {
        return switch (ELEMENT) {
            case Pen _ -> TOTAL_PRICE_CALCULATOR.getPenPrice();
            case Pencil _ -> TOTAL_PRICE_CALCULATOR.getPencilPrice();
            case PencilSharpener _ -> TOTAL_PRICE_CALCULATOR.getPencilSharpenerPrice();
            default -> 0;
        };
    }
}