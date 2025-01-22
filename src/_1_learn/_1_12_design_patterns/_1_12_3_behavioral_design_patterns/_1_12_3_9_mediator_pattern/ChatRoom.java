package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_9_mediator_pattern;

class ChatRoom implements ChatMediator {
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(user.getName() + ": " + message);
    }
}