package _1_learning._1_1_basics._1_1_12_threads;

public class ThreadsExample extends Thread implements Runnable {

    /* (Not Similar/Similar) Concepts
     * start() == run()
     * run() != start()
     * */

    public static void main(String[] args) {
        ThreadsExample thread = new ThreadsExample();

        thread.start();
        if (thread.isAlive()) System.out.println("main()");
    }

    @Override
    public void run() {
        System.out.println("start()");
    }
}