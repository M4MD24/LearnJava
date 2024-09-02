package _2_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_1_thread._2_2_8_1_6;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * <h1>Question:</h1>
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

    public static void main(final String[] ARGS) {
        final String[] SEED_URLS = {
                "https://m3md69.github.io/NULLEXIA"
        };
        startCrawling(SEED_URLS);
    }
}