package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.handlers;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.Priority;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.Request;

public class Level3SupportHandler implements SupportHandler {
    public void setNextHandler(SupportHandler nextHandler) {
    }

    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.CRITICAL) {
            System.out.println("Level 3 Support handled the request.");
        } else {
            System.out.println("Request cannot be handled.");
        }
    }
}