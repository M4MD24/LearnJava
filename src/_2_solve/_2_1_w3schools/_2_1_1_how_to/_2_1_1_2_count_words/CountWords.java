package _2_solve._2_1_w3schools._2_1_1_how_to._2_1_1_2_count_words;

public class CountWords {
    public static void main(final String[] ARGUMENTS) {
        String words = "One Two Three Four";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}