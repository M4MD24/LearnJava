package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_9_mediator_pattern;

abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public String getName() {
        return name;
    }
}