package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_47_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_47_annotations.files <h2>Question</h2>
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String userRole()
            default "GUEST";

    int budgetLimit()
            default 0;
}

class FamilyMember {
    @FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

    @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}

public class Annotations {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        int countOfTestCases = Integer.parseInt(INPUT.nextLine());
        while (countOfTestCases-- > 0) {
            final String ROLE = INPUT.next();
            final int SPEND = INPUT.nextInt();
            try {
                final Class<FamilyMember> ANNOTATED_CLASS = FamilyMember.class;
                final Method[] METHODS = ANNOTATED_CLASS.getMethods();
                for (final Method METHOD : METHODS) {
                    if (METHOD.isAnnotationPresent(FamilyBudget.class)) {
                        final FamilyBudget FAMILY = METHOD.getAnnotation(FamilyBudget.class);
                        final String USER_ROLE = FAMILY.userRole();
                        final int BUDGET_LIMIT = FAMILY.budgetLimit();
                        if (USER_ROLE.equals(ROLE))
                            if (SPEND <= BUDGET_LIMIT)
                                METHOD.invoke(
                                        FamilyMember.class.newInstance(),
                                        BUDGET_LIMIT,
                                        SPEND
                                );
                            else
                                System.out.println("Budget Limit Over");
                    }
                }
            } catch (final Exception EXCEPTION) {
                EXCEPTION.printStackTrace();
            }
        }
    }
}