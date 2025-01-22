package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models.Pen;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models.Pencil;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_8_visitor_pattern.models.PencilSharpener;

public interface ElementVisitor {
    void visit(Pen pen);

    void visit(Pencil pencil);

    void visit(PencilSharpener pencilSharpener);
}