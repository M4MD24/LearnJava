package _2_solve._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_2_unit_test._2_2_12_2_5;

import org.testng.annotations.Test;

public class Question5Test {
    @Test(timeOut = 1000)
    void waitMoment() {
        try {
            Thread.sleep(999);
            System.out.print("Done ");
        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
            INTERRUPTED_EXCEPTION.printStackTrace();
        }
    }
}