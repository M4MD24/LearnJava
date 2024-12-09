package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_64_reflecation_attributes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_64_reflecation_attributes.files <h2>Question</h2>
 */

class Student {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void anotherfunction() {
    }

    void ahqym() {
    }

    void amftc() {
    }

    void atcks() {
    }

    void bwkbd() {
    }

    void cfwyc() {
    }

    void cmkxa() {
    }

    void dnpym() {
    }

    void dnqvo() {
    }

    void dvvwq() {
    }

    void ehjdm() {
    }

    void elyed() {
    }

    void fmyce() {
    }

    void ghtlj() {
    }

    void hluvb() {
    }

    void isqdf() {
    }

    void iwhtf() {
    }

    void jmopy() {
    }

    void jnskt() {
    }

    void kbjlt() {
    }

    void kgwku() {
    }

    void khuag() {
    }

    void levtp() {
    }

    void mcgme() {
    }

    void migyc() {
    }

    void moebl() {
    }

    void nixhb() {
    }

    void odyqp() {
    }

    void ogvdl() {
    }

    void ormim() {
    }

    void piwro() {
    }

    void plaob() {
    }

    void pnruo() {
    }

    void pqfct() {
    }

    void ptrup() {
    }

    void pvgyp() {
    }

    void qthde() {
    }

    void rmjig() {
    }

    void sumvl() {
    }

    void tkbpp() {
    }

    void tntpj() {
    }

    void toxdp() {
    }

    void twyfa() {
    }

    void uccfq() {
    }

    void ujxei() {
    }

    void vhxoi() {
    }

    void viwuu() {
    }

    void viyog() {
    }

    void whjtj() {
    }

    void ytijy() {
    }
}

public class ReflectionAttributes {
    public static void main(final String[] PARAMETERS) {
        final Class<Student> STUDENT = Student.class;
        final Method[] METHODS = STUDENT.getDeclaredMethods();
        final ArrayList<String> METHOD_LIST = new ArrayList<>();
        for (final Method METHOD : METHODS)
            METHOD_LIST.add(METHOD.getName());
        Collections.sort(METHOD_LIST);
        for (final String NAME : METHOD_LIST)
            System.out.println(NAME);
    }
}