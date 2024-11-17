package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_43_method_overriding;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_43_method_overriding.files <h2>Question</h2>
 */

class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class MethodOverriding {
    public static void main(final String[] PARAMETERS) {
        final Sports SPORTS = new Sports();
        final Soccer SOCCER = new Soccer();
        System.out.println(SPORTS.getName());
        SPORTS.getNumberOfTeamMembers();
        System.out.println(SOCCER.getName());
        SOCCER.getNumberOfTeamMembers();
    }
}