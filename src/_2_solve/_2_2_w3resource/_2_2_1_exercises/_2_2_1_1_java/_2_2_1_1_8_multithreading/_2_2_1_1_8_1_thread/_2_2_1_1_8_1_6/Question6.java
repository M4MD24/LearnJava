package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_8_multithreading._2_2_1_1_8_1_thread._2_2_1_1_8_1_6;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a concurrent web crawler that crawls multiple websites simultaneously using threads.</h2>
 */

public class Question6 {
    private static final int MAX_DEPTH = 2,
            MAX_THREADS = 4;
    private static final Set<String> VISITED_URLS = new HashSet<>();

    private static void crawl(final String URL, final int DEPTH) {
        if (DEPTH > MAX_DEPTH || VISITED_URLS.contains(URL))
            return;
        VISITED_URLS.add(URL);
        System.out.println("Crawling: " + URL);
        try {
            final Document document = Jsoup.connect(URL).get();
            processPage(document);

            final Elements LINKS = document.select("a[href]");
            for (final Element LINK : LINKS) {
                final String NEXT_URL = LINK.absUrl("href");
                crawl(NEXT_URL, DEPTH + 1);
            }
        } catch (IOException INTERRUPTED_EXCEPTION) {
            INTERRUPTED_EXCEPTION.printStackTrace();
        }
    }

    private static void processPage(final Document DOCUMENT) {
        System.out.printf("Title: %s%n", DOCUMENT.title());
    }

    private static void startCrawling(final String[] SEED_URLS) {
        final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(MAX_THREADS);
        for (final String URL : SEED_URLS)
            EXECUTOR_SERVICE.execute(() -> crawl(URL, 0));
        EXECUTOR_SERVICE.shutdown();
        try {
            EXECUTOR_SERVICE.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
            INTERRUPTED_EXCEPTION.printStackTrace();
        }
        System.out.println("Crawling completed.");
    }

    public static void main(final String[] ARGUMENTS) {
        final String[] SEED_URLS = {
                "https://github.com/Nullexia-for-Programming/NULLEXIA"
        };
        startCrawling(SEED_URLS);
    }
}