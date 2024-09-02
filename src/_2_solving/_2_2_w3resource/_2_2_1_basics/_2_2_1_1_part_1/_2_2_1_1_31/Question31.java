package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_31;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check whether Java is installed on your computer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Java Version: 1.8.0_71
 * <br/>
 * Java Runtime Version: 1.8.0_71-b15
 * <br/>
 * Java Home: /opt/jdk/jdk1.8.0_71/jre
 * <br/>
 * Java Vendor: Oracle Corporation
 * <br/>
 * Java Vendor URL: http://Java.oracle.com/
 * <br/>
 * Java Class Path: .
 * <br/>
 * </h2>
 */
public class Question31 {
    public static void main(final String[] ARGS) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.print("Java Class Path: " + System.getProperty("java.class.path"));
    }
}