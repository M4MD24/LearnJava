package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.handlers;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.Priority;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.Request;

public class Level1SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 Support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}