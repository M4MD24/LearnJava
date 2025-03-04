package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_13_filter_subscribers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterSubscribers {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(Arrays.toString(filterSubscribers(
                new String[]{"user@gmail.com", "admin@company.com", "info@yahoo.com", "user@gmail.com", "support@company.com", "sales@business.org"},
                new String[]{"gmail.com", "yahoo.com"}
        )));
        System.out.println(Arrays.toString(filterSubscribers(
                new String[]{"info@domain.com", "info@domain.com", "sales@business.com"},
                new String[]{}
        )));
        System.out.println(Arrays.toString(filterSubscribers(
                new String[]{"tester@Gmail.com", "tester@gmail.com", "dev@yahoo.com", "user@mySite.org"},
                new String[]{"gmail.com", "yahoo.com"}
        )));
        System.out.print(Arrays.toString(filterSubscribers(
                new String[]{"admin@company.com", "admin@Company.com", "admin@company.com"},
                new String[]{"outlook.com"}
        )));
    }

    private static String[] filterSubscribers(
            final String[] EMAILS,
            final String[] EXCLUDED_EMAIL_DOMAINS
    ) {
        final List<String> TARGET_EMAILS = new ArrayList<>();
        for (final String CURRENT_EMAIL : EMAILS) {
            boolean isContained = true;
            final String CURRENT_EMAIL_DOMAIN = getEmailDomain(CURRENT_EMAIL);
            for (final String CURRENT_EXCLUDED_EMAIL_DOMAINS : EXCLUDED_EMAIL_DOMAINS)
                if (CURRENT_EMAIL_DOMAIN.equalsIgnoreCase(CURRENT_EXCLUDED_EMAIL_DOMAINS)) {
                    isContained = false;
                    break;
                }
            if (isContained)
                TARGET_EMAILS.add(CURRENT_EMAIL);
        }
        return getDistinctEmailsIgnoreCase(TARGET_EMAILS);
    }

    private static String[] getDistinctEmailsIgnoreCase(final List<String> EMAILS) {
        final List<String> DISTINCT_EMAILS = new ArrayList<>();
        for (final String CURRENT_EMAIL : EMAILS) {
            boolean isContained = true;
            for (final String CURRENT_DISTINCT_EMAIL : DISTINCT_EMAILS)
                if (CURRENT_EMAIL.equalsIgnoreCase(CURRENT_DISTINCT_EMAIL)) {
                    isContained = false;
                    break;
                }
            if (isContained)
                DISTINCT_EMAILS.add(CURRENT_EMAIL);
        }
        return DISTINCT_EMAILS.toArray(String[]::new);
    }

    private static String getEmailDomain(final String EMAIL) {
        return EMAIL.substring(EMAIL.indexOf('@') + 1);
    }
}