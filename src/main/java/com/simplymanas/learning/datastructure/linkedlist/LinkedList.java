package com.simplymanas.learning.datastructure.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public LinkedList(Node<T> head) {
        this.head = this.tail = head;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            if (temp.getNext() != null) {
                System.out.print(" --> ");
            }
            temp = temp.getNext();
        }
        System.out.println();
    }

    public int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }
        return size;
    }

    public void insert(Node<T> node) {
        Node temp = tail;
        temp.setNext(node);
        tail = temp.getNext();
    }

    public Node get(int index) {
        Node temp = head;
        try {
            if (index > size()) {
                throw new Exception("Index out of range");
            }

            int counter = 0;
            while (counter != index) {
                counter++;
                temp = temp.getNext();
            }
            return temp;
        } catch (Exception ignored) {
        }

        return temp;
    }

    public void printReversList() {

        Node current = head;
        Node last = null;

        while (last != head) {
            while (current.getNext() != last) {
                current = current.getNext();
            }
            last = current;
            System.out.print(last.getData());
            current = head;
        }
    }
}
