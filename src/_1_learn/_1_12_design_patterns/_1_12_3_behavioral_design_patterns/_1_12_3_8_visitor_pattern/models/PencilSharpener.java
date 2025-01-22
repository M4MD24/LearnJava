package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.ElementVisitor;

public class PencilSharpener implements Element {
    @Override
    public void accept(ElementVisitor elementVisitor) {
        elementVisitor.visit(this);
    }
}