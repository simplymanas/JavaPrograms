package com.simplymanas.learning.datastructure.linkedlist;

public class Node<T> {

    private T data;
    private Node next;

    public Node(T d) {
        data = d;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
