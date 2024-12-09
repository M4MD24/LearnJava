package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_p_police_recruits;

import java.util.Scanner;

/**
 * <h1>P. Police Recruits</h1>
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
 * <h1>Problem:</h1>
 * <h2>
 * The police department of your city has just started its journey. Initially, they don’t have any manpower. So, they started hiring new recruits in groups.
 * <br/>
 * Meanwhile, crimes keeps occurring within the city. One member of the police force can investigate only one crime during his/her lifetime.
 * <br/>
 * If there is no police officer free (isn't busy with crime) during the occurrence of a crime, it will go untreated.
 * <br/>
 * Given the chronological order of crime occurrences and recruit hirings, find the number of crimes which will go untreated.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * -1 -1 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 8
 * <br/>
 * 1 -1 1 -1 -1 1 1 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 11
 * <br/>
 * -1 -1 2 -1 -1 -1 -1 -1 -1 -1 -1
 * </h2>
 * <h1>Output:</h1>
 * <h2>8</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Lets consider the second example:</h2>
 * <ol>
 *     <li>Firstly one person is hired.</li>
 *     <li>Then crime appears, the last hired person will investigate this crime.</li>
 *     <li>One more person is hired.</li>
 *     <li>One more crime appears, the last hired person will investigate this crime.</li>
 *     <li>Crime appears. There is no free policeman at the time, so this crime will go untreated.</li>
 *     <li>One more person is hired.</li>
 *     <li>One more person is hired.</li>
 *     <li>One more person is hired.</li>
 * </ol>
 * <h2>The answer is one, as one crime (on step 5) will go untreated.</h2>
 */

public class PoliceRecruitsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int length = INPUT.nextInt(),
            countOfCrimeCasesRemaining = 0;

    public static void main(final String[] PARAMETERS) {
        inputValues();
        System.out.print(countOfCrimeCasesRemaining);
    }

    private static void inputValues() {
        int countOfPoliceOfficers = 0;
        while (length-- > 0) {
            final int COUNT = INPUT.nextInt();
            if (COUNT > 0) countOfPoliceOfficers += COUNT;
            else {
                if (countOfPoliceOfficers + COUNT >= 0) countOfPoliceOfficers += COUNT;
                else countOfCrimeCasesRemaining++;
            }
        }
    }
}