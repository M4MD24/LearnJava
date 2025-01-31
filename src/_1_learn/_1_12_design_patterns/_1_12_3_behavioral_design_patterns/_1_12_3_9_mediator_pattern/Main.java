package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_9_mediator_pattern;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        ChatMediator chat = new ChatRoom();
        User mohamed = new ChatUser(chat, "Mohamed");
        User ahmed = new ChatUser(chat, "Ahmed");

        mohamed.send("Salam, Ahmed!");
        ahmed.send("Salam, Mohamed!");
    }
}