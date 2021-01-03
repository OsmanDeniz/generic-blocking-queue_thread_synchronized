package com.deniz;

import java.util.Random;

public class QueueOperations<T> extends Thread {

    static Queue queue;

    public QueueOperations() {
        super();
        queue = new Queue<T>();
    }

    @Override
    public void run() {
        synchronized (queue) {
            Random rnd = new Random();
            int a;
            a = rnd.nextInt(100);
            System.out.println("-------------------------\n" + this.getName() + " added " + a);
            queue.add(a);
            a = rnd.nextInt(100);
            System.out.println("-------------------------\n" + this.getName() + " added " + a);
            queue.add(a);
            System.out.println("-------------------------\n" + this.getName() + " -> Top => " + queue.peek());
            System.out.println(this.getName() + " -> Pop => " + queue.pool());
            System.out.println(this.getName() + " -> Pop => " + queue.pool());
            System.out.println(this.getName() + " -> Pop => " + queue.pool());
            System.out.println(this.getName() + " is dead. ");
        }

    }
}
