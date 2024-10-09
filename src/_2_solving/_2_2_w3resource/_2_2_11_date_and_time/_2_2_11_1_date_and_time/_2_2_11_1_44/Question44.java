package _2_solving._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_44;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to define and extract zone offsets.</h2>
 */

public class Question44 {
    public static void main(final String[] PARAMETERS) {
        final ZoneOffset ZONE_OFFSET = ZoneOffset.ofHoursMinutes(
                0,
                0
        );
        final ZonedDateTime ZONED_DATE_TIME = ZonedDateTime.now(ZONE_OFFSET);
        final ZoneOffset EXTRACTED_OFFSET = ZONED_DATE_TIME.getOffset();
        final LocalDateTime CURRENT_DATE_AND_TIME = LocalDateTime.now();
        final ZonedDateTime ZONED_WITH_OFFSET = ZonedDateTime.of(CURRENT_DATE_AND_TIME, ZONE_OFFSET);
        System.out.printf("""
                        Current date and time with offset : %s
                        Extracted zone offset             : %s
                        Current UTC time                  : %s
                        ZonedDateTime with specific offset: %s""",
                ZONED_DATE_TIME,
                EXTRACTED_OFFSET,
                CURRENT_DATE_AND_TIME,
                ZONED_WITH_OFFSET);
    }
}