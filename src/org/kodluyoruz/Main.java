package org.kodluyoruz;

import com.deniz.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add(5);
        System.out.println("-------------------------");
        queue.add(3);
        System.out.println("-------------------------");
        System.out.println("Peek => "+ queue.peek());
        System.out.println("-------------------------");
        System.out.println("Pool => "+ queue.pool());
        System.out.println("Pool => "+ queue.pool());
        System.out.println("Pool => "+ queue.pool());



        Queue<Double> doubleQueue = new Queue<>();
        doubleQueue.add(5.1);
        doubleQueue.add(10.2);
        System.out.println("-------------------------");
        System.out.println(doubleQueue.peek());
        System.out.println("-------------------------");
        System.out.println(doubleQueue.pool());
        System.out.println(doubleQueue.pool());

    }
}
