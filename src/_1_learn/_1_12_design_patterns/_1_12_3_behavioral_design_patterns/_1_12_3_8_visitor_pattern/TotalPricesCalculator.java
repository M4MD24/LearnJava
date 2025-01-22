package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models.Pen;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models.Pencil;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models.PencilSharpener;

public class TotalPricesCalculator implements ElementVisitor {
    private final double PEN_PRICE = 5,
            PENCIL_PRICE = 3,
            PENCIL_SHARPENER_PRICE = 2;
    private double totalPrices = 0;

    public double getPenPrice() {
        return PEN_PRICE;
    }

    public double getPencilPrice() {
        return PENCIL_PRICE;
    }

    public double getPencilSharpenerPrice() {
        return PENCIL_SHARPENER_PRICE;
    }

    public double getTotalPrices() {
        return totalPrices;
    }

    @Override
    public void visit(Pen pen) {
        totalPrices += PEN_PRICE;
    }

    @Override
    public void visit(Pencil pencil) {
        totalPrices += PENCIL_PRICE;
    }

    @Override
    public void visit(PencilSharpener pencilSharpener) {
        totalPrices += PENCIL_SHARPENER_PRICE;
    }
}