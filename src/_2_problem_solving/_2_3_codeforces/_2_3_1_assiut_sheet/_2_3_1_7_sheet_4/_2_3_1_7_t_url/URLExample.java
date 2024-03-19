package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_t_url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>T. URL</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a string S that represents a URL request. Print five lines contains the following format: "X: Y" where X is the parameter and Y is the parameter value.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The parameters of the URL: username, pwd, profile, role and key.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>http://www.cleartrip.com/signin/service?username=test&pwd=test&profile=developer&role=ELITE&key=manager</h2>
 * <h1>Output:</h1>
 * <h2>
 * username: test
 * <br/>
 * pwd: test
 * <br/>
 * profile: developer
 * <br/>
 * role: ELITE
 * <br/>
 * key: manager
 * </h2>
 */

public class URLExample {
    public static void main(String[] args) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        getURLInformation(new StringBuffer(INPUT.readLine()));
    }

    private static void getURLInformation(StringBuffer url) {
        url = new StringBuffer(url.substring(url.indexOf("?") + 1).replaceAll("=", ": "));
        printURLInformation(url.toString().split("&+"));
    }

    private static void printURLInformation(final String[] URL_INFORMATION) {
        for (int index = 0; index < URL_INFORMATION.length; index++) {
            System.out.print(URL_INFORMATION[index]);
            if (index < URL_INFORMATION.length - 1) System.out.println();
        }
    }
}