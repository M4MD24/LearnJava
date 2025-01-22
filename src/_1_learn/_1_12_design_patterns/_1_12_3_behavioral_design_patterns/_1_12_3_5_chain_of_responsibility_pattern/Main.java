package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern;

import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.handlers.Level1SupportHandler;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.handlers.Level2SupportHandler;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.handlers.Level3SupportHandler;
import _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_5_chain_of_responsibility_pattern.handlers.SupportHandler;

public class Main {
    public static void main(final String[] PARAMETERS) {
        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);
        Request request4 = new Request(Priority.THING);

        level1Handler.handleRequest(request1);
        level1Handler.handleRequest(request2);
        level1Handler.handleRequest(request3);
        level1Handler.handleRequest(request4);
    }
}