package _1_learning._1_2_testing._1_1_2_2_testing._1_1_2_2_2_ignore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreExampleTest {
    @Test
    @Ignore("Skipping this test!")
    void testFeatureUnderDevelopment() {
        System.out.print("Hello!");
    }
}