package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_67_hashtag_it;

public class HashtagItExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getTextsAfterHashtag(new String[]{"stay_home", "coronavirus", "Saudi_Arabia"}));
        System.out.println(getTextsAfterHashtag(new String[]{"Vibes", "SAFCSP", "entrepreneur"}));
        System.out.println(getTextsAfterHashtag(new String[]{"SAFCSP", "SAUDI_ARABIA", "Riyadh"}));
        System.out.print(getTextsAfterHashtag(new String[]{"Programming", "Code"}));
    }

    private static String getTextsAfterHashtag(final String[] TEXTS) {
        final StringBuilder TEXTS_AFTER_HASHTAG = new StringBuilder();
        for (int index = 0; index < TEXTS.length; index++) {
            TEXTS_AFTER_HASHTAG.append('#')
                    .append(TEXTS[index]);
            if (index != TEXTS.length - 1)
                TEXTS_AFTER_HASHTAG.append(' ');
        }
        return TEXTS_AFTER_HASHTAG.toString();
    }
}