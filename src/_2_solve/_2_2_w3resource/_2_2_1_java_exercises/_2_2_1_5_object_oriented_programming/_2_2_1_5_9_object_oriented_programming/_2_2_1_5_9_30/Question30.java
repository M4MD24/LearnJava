package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_9_object_oriented_programming._2_2_1_5_9_30;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "GymMembership" with attributes for member name, membership type, and duration. Create a subclass "PremiumMembership" that adds attributes for personal trainer availability. Implement methods to calculate membership fees based on membership type.</h2>
 */

public class Question30 {
    public static void main(final String[] ARGUMENTS) {
        normalMembership();
        premiumMembership();
    }

    private static void premiumMembership() {
        final GymMembership PREMIUM_MEMBERSHIP = new PremiumMembership("Someone", 3);
        System.out.printf("""
                        Name: %s
                        Membership Type: %s
                        Duration: %d months
                        Fees: %.2f £
                        Is Personal Trainer Available: %b""",
                PREMIUM_MEMBERSHIP.getName(),
                PREMIUM_MEMBERSHIP.getMembershipType(),
                PREMIUM_MEMBERSHIP.getDuration(),
                PREMIUM_MEMBERSHIP.calculateFees(),
                PREMIUM_MEMBERSHIP.isPersonalTrainerAvailable());
    }

    private static void normalMembership() {
        final GymMembership NORMAL_MEMBERSHIP = new GymMembership("Someone", MembershipType.Normal, 3);
        System.out.printf("""
                        Name: %s
                        Membership Type: %s
                        Duration: %d months
                        Fees: %.2f £
                        Is Personal Trainer Available: %b
                        %n""",
                NORMAL_MEMBERSHIP.getName(),
                NORMAL_MEMBERSHIP.getMembershipType(),
                NORMAL_MEMBERSHIP.getDuration(),
                NORMAL_MEMBERSHIP.calculateFees(),
                NORMAL_MEMBERSHIP.isPersonalTrainerAvailable());
    }
}

class GymMembership {
    private final String name;
    private final MembershipType membershipType;
    private final int duration;

    public GymMembership(final String name, final MembershipType membershipType, final int duration) {
        this.name = name;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public int getDuration() {
        return duration;
    }

    public float calculateFees() {
        return switch (membershipType) {
            case Normal -> duration * 50;
            case Premium -> duration * 100;
        };
    }

    public boolean isPersonalTrainerAvailable() {
        return false;
    }
}

class PremiumMembership extends GymMembership {
    public PremiumMembership(final String NAME, final int DURATION) {
        super(NAME, MembershipType.Premium, DURATION);
    }

    @Override
    public boolean isPersonalTrainerAvailable() {
        return true;
    }

    @Override
    public float calculateFees() {
        return getDuration() * 100;
    }
}

enum MembershipType {
    Normal,
    Premium
}