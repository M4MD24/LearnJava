package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_40;

import java.nio.charset.Charset;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to list the available character sets in charset objects.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * List of available character sets:
 * <br/>
 * Big5
 * <br/>
 * Big5-HKSCS
 * <br/>
 * CESU-8
 * <br/>
 * EUC-JP
 * <br/>
 * EUC-KR
 * <br/>
 * GB18030
 * <br/>
 * GB2312
 * <br/>
 * GBK
 * <br/>
 * ...
 * <br/>
 * x-SJIS_0213
 * <br/>
 * x-UTF-16LE-BOM
 * <br/>
 * X-UTF-32BE-BOM
 * <br/>
 * X-UTF-32LE-BOM
 * <br/>
 * x-windows-50220
 * <br/>
 * x-windows-50221
 * <br/>
 * x-windows-874
 * <br/>
 * x-windows-949
 * <br/>
 * x-windows-950
 * <br/>
 * x-windows-iso2022jp
 * </h2>
 */

public class Question40 {
    public static void main(final String[] ARGUMENTS) {
        System.out.println("List of available character sets: ");
        for (String type : Charset.availableCharsets().keySet()) System.out.println(type);
    }
}