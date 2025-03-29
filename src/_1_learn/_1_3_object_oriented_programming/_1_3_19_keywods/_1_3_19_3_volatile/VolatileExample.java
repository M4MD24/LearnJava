package _1_learn._1_3_object_oriented_programming._1_3_19_keywods._1_3_19_3_volatile;

public class VolatileExample {
    private static volatile boolean running = true;

    public static void main(final String[] ARGUMENTS) throws InterruptedException {
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