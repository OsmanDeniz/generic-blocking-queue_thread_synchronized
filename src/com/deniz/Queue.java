package com.deniz;

public class Queue<T> {
    Node<T> head;
    Node<T> first;

    public Queue() {
        head = null;
    }

    public void add(T value){
        Node<T> newNode = new Node<>();
        newNode.value= value;
        newNode.next=null;

        if (head==null) head=newNode;
        else{
            first = head;
            while (first.next != null) first = first.next;
            first.next = newNode;
        }

        System.out.print("Head => "+head.value);
        System.out.println(" Node => "+newNode.value);
    }

    public T peek(){
        if(head==null){
            System.out.println("Stack is empty!");
            return null;
        }
        return head.value;
    }

    public T pool(){
        if(head==null){
            System.out.println("Stack is empty!");
            return null;
        }

        Node<T> temp = head;
        head = head.next;
        return temp.value;

    }




}
