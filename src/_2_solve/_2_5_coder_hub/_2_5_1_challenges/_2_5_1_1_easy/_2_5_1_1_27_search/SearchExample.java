package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_27_search;

public class SearchExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(stringCheck("cloud", "u"));
        System.out.println(stringCheck("school", "o"));
        System.out.println(stringCheck("sofa", "k"));
        System.out.print(stringCheck("car", "r"));
    }

    private static int stringCheck(final String TEXT, final String SUB_STRING) {
        return TEXT.indexOf(SUB_STRING);
    }
}