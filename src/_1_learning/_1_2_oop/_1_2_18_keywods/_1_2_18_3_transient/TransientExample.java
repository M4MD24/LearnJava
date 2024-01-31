package _1_learning._1_2_oop._1_2_18_keywods._1_2_18_3_transient;

public class TransientExample {
    // Normal variables
    int i = 10, j = 20;

    // Transient variables
    transient int k = 30;
    transient static int l = 40;
    transient final int m = 50;

    public static void main(String[] args) {
        TransientExample transientExample = new TransientExample();

        System.out.println("i = " + transientExample.i);
        System.out.println("j = " + transientExample.j);
        System.out.println("k = " + transientExample.k);
        System.out.println("l = " + transientExample.l);
        System.out.println("m = " + transientExample.m);
    }
}