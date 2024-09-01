package _2_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_1_thread._2_2_8_1_7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.</h2>
 */

public class Question7 {
    private static double balance = 0.0D;
    private static final Lock LOCK = new ReentrantLock();

    public static void main(final String[] ARGS) {
        runUserRequests();
    }

    private static void runUserRequests() {
        new Thread(() -> deposit(1000)).start();
        new Thread(() -> deposit(300)).start();
        new Thread(() -> withdraw(150)).start();
        new Thread(() -> withdraw(1200)).start();
    }

    private static void deposit(final double AMOUNT) {
        LOCK.lock();
        try {
            balance += AMOUNT;
            System.out.println("Deposit: " + AMOUNT);
            System.out.println("Balance after deposit: " + balance);
        } finally {
            LOCK.unlock();
        }
    }

    private static void withdraw(final double AMOUNT) {
        LOCK.lock();
        try {
            if (balance >= AMOUNT) {
                balance -= AMOUNT;
                System.out.println("Withdrawal: " + AMOUNT);
                System.out.println("Balance after withdrawal: " + balance);
            } else {
                System.out.println("Try to Withdraw: " + AMOUNT);
                System.out.println("Insufficient funds, Withdrawal cancelled.");
            }
        } finally {
            LOCK.unlock();
        }
    }
}