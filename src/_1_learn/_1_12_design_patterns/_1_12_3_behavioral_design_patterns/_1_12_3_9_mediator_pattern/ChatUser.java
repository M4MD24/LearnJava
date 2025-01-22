package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_9_mediator_pattern;

class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(this, message);
    }
}