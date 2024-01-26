package _2_peoblem_solving._2_1_w3schools._2_count_words;

public class CountWords {
    public static void main(String[] args) {
        String words = "One Two Three Four";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}