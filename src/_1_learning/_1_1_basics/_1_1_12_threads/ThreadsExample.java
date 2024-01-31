package _1_learning._1_1_basics._1_1_12_threads;

class ThreadOne extends Thread {
    public void run() {
        for (int index = 0; index < 10; index++) {
            System.out.println("-");
            try {
                sleep(950);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int index = 0; index < 10; index++) {
            System.out.println("--");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsExample extends Thread implements Runnable {

    /* (Not Similar/Similar) Concepts
     * start() == run()
     * run() != start()
     * */

    public static void main(String[] args) {
        ThreadsExample thread = new ThreadsExample();
        thread.start();
        if (thread.isAlive()) System.out.println("main()");

//        Multiple Threads
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();

        threadOne.setPriority(Thread.MAX_PRIORITY);
        threadOne.start();

        threadTwo.setPriority(Thread.MIN_PRIORITY);
        threadTwo.start();
    }

    @Override
    public void run() {
        System.out.println("start()");
    }
}