package org.kodluyoruz;

import com.deniz.Queue;
import com.deniz.QueueOperations;

public class Main {

    public static void main(String[] args) {

        QueueOperations t1 = new QueueOperations<Integer>();
        QueueOperations t2 = new QueueOperations<Integer>();
        QueueOperations t3 = new QueueOperations<Integer>();
        QueueOperations t4 = new QueueOperations<Integer>();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Child Thread is dead.");
        }
        System.out.println("Main thread is finished.");
    }
}
