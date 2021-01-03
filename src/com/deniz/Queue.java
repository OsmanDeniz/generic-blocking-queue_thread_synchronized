package com.deniz;

public class Queue<T> {
    Node<T> head;
    Node<T> last;
    Node<T> newNode;

    public Queue() {
        head = null;

    }

    public void add(T value) {
        newNode = new Node<>();
        newNode.value = value;
        newNode.next = null;

        if (head == null) head = newNode;
        else {
            last = head;
            while (last.next != null) last = last.next;
            last.next = newNode;
        }

        System.out.print("Head => " + head.value);
        System.out.println(" Node => " + newNode.value);
    }

    public T peek() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    public T pool() {
        if (head == null) {
            return null;
        }

        Node<T> temp = head;
        head = head.next;
        return temp.value;

    }


}
