package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.ElementVisitor;

public interface Element {
    void accept(ElementVisitor elementVisitor);
}