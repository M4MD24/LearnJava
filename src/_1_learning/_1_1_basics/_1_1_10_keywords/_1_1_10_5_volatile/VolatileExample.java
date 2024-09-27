package _1_learning._1_1_basics._1_1_10_keywords._1_1_10_5_volatile;

public class VolatileExample {
    private static volatile boolean running = true;

    public static void main(final String[] PARAMETERS) throws InterruptedException {
        final Thread READER_THREAD = new Thread(() -> {
            while (running)
                Thread.onSpinWait();
            waitMoment();
            System.out.print("Reader thread: Exiting loop.");
        });

        final Thread WRITER_THREAD = new Thread(() -> {
            waitMoment();
            running = false;
            System.out.println("Writer thread: Updated running to false.");
        });

        READER_THREAD.start();
        WRITER_THREAD.start();
        WRITER_THREAD.join();
        READER_THREAD.join();
    }

    private static void waitMoment() {
        try {
            Thread.sleep(2000);
        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
            throw new RuntimeException(INTERRUPTED_EXCEPTION);
        }
    }
}