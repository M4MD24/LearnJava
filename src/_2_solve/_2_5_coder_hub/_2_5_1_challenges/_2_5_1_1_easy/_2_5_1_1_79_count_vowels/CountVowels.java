package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_79_count_vowels;

public class CountVowels {
    public static void main(String[] args) {
        System.out.print(countVowels("Hello World!"));
    }

    private static int countVowels(final String TEXT) {
        return (int) TEXT.chars()
                         .map(Character::toLowerCase)
                         .filter(c -> "aeiou".indexOf(c) >= 0)
                         .count();
    }
}