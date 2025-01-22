package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.handlers;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.Request;

public interface SupportHandler {
    void handleRequest(Request request);

    void setNextHandler(SupportHandler nextHandler);
}