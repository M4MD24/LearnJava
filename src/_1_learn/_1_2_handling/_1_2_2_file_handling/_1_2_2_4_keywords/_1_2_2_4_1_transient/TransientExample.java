package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_4_keywords._1_2_2_4_1_transient;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;

public class TransientExample implements Serializable {
    int i = 10,
            j = 20;

    // Transient variables
    transient int k = 30;

    // Transient has no impact
    transient static int l = 40;
    transient final int m = 50;

    public static void main(final String[] PARAMETERS) throws Exception {
        // serialization
        final TransientExample INPUT = new TransientExample();
        final FileOutputStream FILE_OUTPUT_STREAM = new FileOutputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_4_keywords/_1_2_2_4_1_transient/File.txt");
        final ObjectOutputStream OBJECT_OUTPUT_STREAM = new ObjectOutputStream(FILE_OUTPUT_STREAM);
        OBJECT_OUTPUT_STREAM.writeObject(INPUT);

        // de-serialization
        final FileInputStream FILE_INPUT_STREAM = new FileInputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_4_keywords/_1_2_2_4_1_transient/File.txt");
        final ObjectInputStream OBJECT_INPUT_STREAM = new ObjectInputStream(FILE_INPUT_STREAM);
        final TransientExample OUTPUT = (TransientExample) OBJECT_INPUT_STREAM.readObject();

        System.out.println("i = " + OUTPUT.i);
        System.out.println("j = " + OUTPUT.j);
        System.out.println("k = " + OUTPUT.k);
        System.out.println("l = " + l);
        System.out.print("m = " + OUTPUT.m);
    }
}