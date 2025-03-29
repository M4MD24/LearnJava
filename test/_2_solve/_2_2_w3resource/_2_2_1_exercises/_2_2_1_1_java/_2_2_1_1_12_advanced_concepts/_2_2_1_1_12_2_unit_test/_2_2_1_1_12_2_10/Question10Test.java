package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_12_advanced_concepts._2_2_1_1_12_2_unit_test._2_2_1_1_12_2_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question10Test {
    @Test
    void areSimilarNames() {
        final String FIRST_NAME = "Mohamed",
                SECOND_NAME = new User("Mohamed").name();
        assertEquals(FIRST_NAME, SECOND_NAME);
    }
}