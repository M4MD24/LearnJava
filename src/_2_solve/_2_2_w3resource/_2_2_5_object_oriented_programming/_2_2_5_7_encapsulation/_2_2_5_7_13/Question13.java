package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_7_encapsulation._2_2_5_7_13;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Quran with private instance variables Surah, Ayah. Provide public getter and setter methods to access and modify these variables.</h2>
 */

public class Question13 {
    public static void main(final String[] PARAMETERS) {
        final Quran QURAN = new Quran();
        QURAN.setSurah(Surahs.Fatiha.name());
        QURAN.setAyah(7);
        System.out.printf("""
                        Surah: %s
                        Ayah: %d
                        Do Surah and Ayah exist? %b""",
                QURAN.getSurah(),
                QURAN.getAyah(),
                QURAN.doSurahAndAyahExist());
    }
}

class Quran {
    private String surah;
    private int ayah;
    private static final Map<String, Integer> INDEX_OF_QURAN = new HashMap<>();

    static {
        addIndexOfQuranInformation();
    }

    private static void addIndexOfQuranInformation() {
        INDEX_OF_QURAN.put("Fatiha", 7);
        INDEX_OF_QURAN.put("Baqarah", 286);
        INDEX_OF_QURAN.put("Al_Imran", 200);
        INDEX_OF_QURAN.put("Nisa", 176);
        INDEX_OF_QURAN.put("Maidah", 120);
        INDEX_OF_QURAN.put("Anam", 165);
        INDEX_OF_QURAN.put("Araf", 206);
        INDEX_OF_QURAN.put("Anfal", 75);
        INDEX_OF_QURAN.put("Tawbah", 129);
        INDEX_OF_QURAN.put("Yunus", 109);
        INDEX_OF_QURAN.put("Hud", 123);
        INDEX_OF_QURAN.put("Yusuf", 111);
        INDEX_OF_QURAN.put("Raad", 43);
        INDEX_OF_QURAN.put("Ibrahim", 52);
        INDEX_OF_QURAN.put("Hijr", 99);
        INDEX_OF_QURAN.put("Nahl", 128);
        INDEX_OF_QURAN.put("Al_Isra", 111);
        INDEX_OF_QURAN.put("Kahf", 110);
        INDEX_OF_QURAN.put("Maryam", 98);
        INDEX_OF_QURAN.put("TaHa", 135);
        INDEX_OF_QURAN.put("Anbiya", 112);
        INDEX_OF_QURAN.put("Hajj", 78);
        INDEX_OF_QURAN.put("Muminun", 118);
        INDEX_OF_QURAN.put("An_Nur", 64);
        INDEX_OF_QURAN.put("Furqan", 77);
        INDEX_OF_QURAN.put("Shuara", 227);
        INDEX_OF_QURAN.put("Naml", 93);
        INDEX_OF_QURAN.put("Qasas", 88);
        INDEX_OF_QURAN.put("Ankabut", 69);
        INDEX_OF_QURAN.put("Rum", 60);
        INDEX_OF_QURAN.put("Luqman", 34);
        INDEX_OF_QURAN.put("Sajdah", 30);
        INDEX_OF_QURAN.put("Ahzab", 73);
        INDEX_OF_QURAN.put("Saba", 54);
        INDEX_OF_QURAN.put("Fatir", 45);
        INDEX_OF_QURAN.put("Yasin", 83);
        INDEX_OF_QURAN.put("Assaaffat", 182);
        INDEX_OF_QURAN.put("Sad", 88);
        INDEX_OF_QURAN.put("Zumar", 75);
        INDEX_OF_QURAN.put("Ghafir", 85);
        INDEX_OF_QURAN.put("Fussilat", 54);
        INDEX_OF_QURAN.put("shura", 53);
        INDEX_OF_QURAN.put("Zukhruf", 89);
        INDEX_OF_QURAN.put("Ad_Dukhaan", 59);
        INDEX_OF_QURAN.put("Jathiyah", 37);
        INDEX_OF_QURAN.put("Ahqaf", 35);
        INDEX_OF_QURAN.put("Muhammad", 38);
        INDEX_OF_QURAN.put("Al_Fath", 29);
        INDEX_OF_QURAN.put("Hujurat", 18);
        INDEX_OF_QURAN.put("Qaf", 45);
        INDEX_OF_QURAN.put("zariyat", 60);
        INDEX_OF_QURAN.put("Tur", 49);
        INDEX_OF_QURAN.put("Najm", 62);
        INDEX_OF_QURAN.put("Al_Qamar", 55);
        INDEX_OF_QURAN.put("Rahman", 78);
        INDEX_OF_QURAN.put("Waqiah", 96);
        INDEX_OF_QURAN.put("Hadid", 29);
        INDEX_OF_QURAN.put("Mujadilah", 22);
        INDEX_OF_QURAN.put("Al_Hashr", 24);
        INDEX_OF_QURAN.put("Mumtahina", 13);
        INDEX_OF_QURAN.put("Saff", 14);
        INDEX_OF_QURAN.put("Jumuah", 11);
        INDEX_OF_QURAN.put("Munafiqun", 11);
        INDEX_OF_QURAN.put("Taghabun", 18);
        INDEX_OF_QURAN.put("Talaq", 12);
        INDEX_OF_QURAN.put("Tahrim", 12);
        INDEX_OF_QURAN.put("Mulk", 30);
        INDEX_OF_QURAN.put("Qalam", 52);
        INDEX_OF_QURAN.put("Al_Haqqah", 52);
        INDEX_OF_QURAN.put("Maarij", 44);
        INDEX_OF_QURAN.put("Nuh", 28);
        INDEX_OF_QURAN.put("Jinn", 28);
        INDEX_OF_QURAN.put("Muzammil", 20);
        INDEX_OF_QURAN.put("Muddathir", 56);
        INDEX_OF_QURAN.put("Qiyamah", 40);
        INDEX_OF_QURAN.put("Insan", 31);
        INDEX_OF_QURAN.put("Mursalat", 50);
        INDEX_OF_QURAN.put("An_Naba", 40);
        INDEX_OF_QURAN.put("Naziat", 46);
        INDEX_OF_QURAN.put("Abasa", 42);
        INDEX_OF_QURAN.put("Takwir", 29);
        INDEX_OF_QURAN.put("Infitar", 19);
        INDEX_OF_QURAN.put("Mutaffifin", 36);
        INDEX_OF_QURAN.put("Inshiqaq", 25);
        INDEX_OF_QURAN.put("Buruj", 22);
        INDEX_OF_QURAN.put("Tariq", 17);
        INDEX_OF_QURAN.put("Al_Ala", 19);
        INDEX_OF_QURAN.put("Ghashiya", 26);
        INDEX_OF_QURAN.put("Fajr", 30);
        INDEX_OF_QURAN.put("Al_Balad", 20);
        INDEX_OF_QURAN.put("Shams", 15);
        INDEX_OF_QURAN.put("Lail", 21);
        INDEX_OF_QURAN.put("Duha", 11);
        INDEX_OF_QURAN.put("Sharh", 8);
        INDEX_OF_QURAN.put("Tin", 8);
        INDEX_OF_QURAN.put("Al_Alaq", 19);
        INDEX_OF_QURAN.put("Qadr", 5);
        INDEX_OF_QURAN.put("Bayyinah", 8);
        INDEX_OF_QURAN.put("Zalzalah", 8);
        INDEX_OF_QURAN.put("Adiyat", 11);
        INDEX_OF_QURAN.put("Qariah", 11);
        INDEX_OF_QURAN.put("Takathur", 8);
        INDEX_OF_QURAN.put("Al_Asr", 3);
        INDEX_OF_QURAN.put("Humazah", 9);
        INDEX_OF_QURAN.put("Al_Fil", 5);
        INDEX_OF_QURAN.put("Quraysh", 4);
        INDEX_OF_QURAN.put("Maun", 7);
        INDEX_OF_QURAN.put("Kawthar", 3);
        INDEX_OF_QURAN.put("Kafirun", 6);
        INDEX_OF_QURAN.put("Nasr", 3);
        INDEX_OF_QURAN.put("Masad", 5);
        INDEX_OF_QURAN.put("Ikhlas", 4);
        INDEX_OF_QURAN.put("Falaq", 4);
        INDEX_OF_QURAN.put("An_Nas", 6);
    }

    public String getSurah() {
        return surah;
    }

    public void setSurah(final String SURAH) {
        surah = SURAH;
    }

    public int getAyah() {
        return ayah;
    }

    public void setAyah(final int AYAH) {
        ayah = AYAH;
    }

    public boolean doSurahAndAyahExist() {
        if (!INDEX_OF_QURAN.containsKey(surah)) {
            System.err.println("What you wrote isn't a surah!");
            return false;
        } else if (ayah < 1 || ayah > INDEX_OF_QURAN.get(surah)) {
            System.err.println("Ayat of surah " + surah + " from 0 to " + INDEX_OF_QURAN.get(surah) + "!");
            return false;
        } else
            return true;
    }
}

enum Surahs {
    Fatiha,
    Baqarah,
    Al_Imran,
    Nisa,
    Maidah,
    Anam,
    Araf,
    Anfal,
    Tawbah,
    Yunus,
    Hud,
    Yusuf,
    Raad,
    Ibrahim,
    Hijr,
    Nahl,
    Al_Isra,
    Kahf,
    Maryam,
    TaHa,
    Anbiya,
    Hajj,
    Muminun,
    An_Nur,
    Furqan,
    Shuara,
    Naml,
    Qasas,
    Ankabut,
    Rum,
    Luqman,
    Sajdah,
    Ahzab,
    Saba,
    Fatir,
    Yasin,
    Assaaffat,
    Sad,
    Zumar,
    Ghafir,
    Fussilat,
    shura,
    Zukhruf,
    Ad_Dukhaan,
    Jathiyah,
    Ahqaf,
    Muhammad,
    Al_Fath,
    Hujurat,
    Qaf,
    zariyat,
    Tur,
    Najm,
    Al_Qamar,
    Rahman,
    Waqiah,
    Hadid,
    Mujadilah,
    Al_Hashr,
    Mumtahina,
    Saff,
    Jumuah,
    Munafiqun,
    Taghabun,
    Talaq,
    Tahrim,
    Mulk,
    Qalam,
    Al_Haqqah,
    Maarij,
    Nuh,
    Jinn,
    Muzammil,
    Muddathir,
    Qiyamah,
    Insan,
    Mursalat,
    An_Naba,
    Naziat,
    Abasa,
    Takwir,
    Infitar,
    Mutaffifin,
    Inshiqaq,
    Buruj,
    Tariq,
    Al_Ala,
    Ghashiya,
    Fajr,
    Al_Balad,
    Shams,
    Lail,
    Duha,
    Sharh,
    Tin,
    Al_Alaq,
    Qadr,
    Bayyinah,
    Zalzalah,
    Adiyat,
    Qariah,
    Takathur,
    Al_Asr,
    Humazah,
    Al_Fil,
    Quraysh,
    Maun,
    Kawthar,
    Kafirun,
    Nasr,
    Masad,
    Ikhlas,
    Falaq,
    An_Nas,
}