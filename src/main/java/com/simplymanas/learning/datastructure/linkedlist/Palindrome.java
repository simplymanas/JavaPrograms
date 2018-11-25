package com.simplymanas.learning.datastructure.linkedlist;
//Check if linked list is a palindrome

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Palindrome {

    static boolean isPalindrome(Node head) {

        Stack<Node> firstHalf = new Stack<>();
        Node slowPointer, fastPointer;
        Node temp = head;
        slowPointer = head;
        fastPointer = head;
        boolean isBoolean = true;


        while (slowPointer.getNext() != null) {

            if (fastPointer.getNext().getNext() == null) {
                if (firstHalf.pop().getData() != slowPointer.getData()) isBoolean = false;
            } else {
                firstHalf.push(head);
                fastPointer = fastPointer.getNext().getNext();
                head = head.getNext();
            }

            slowPointer = slowPointer.getNext();
        }

        return isBoolean;
    }

    public static void main(String[] args) {

        List<Node> linkedList = Arrays.asList();
        Node head = new Node('A');
        linkedList.add(head);

        Node node1 = new Node('B');
        head.setNext( node1);

        linkedList.add(node1);

        Node node2 = new Node('C');
        node1.setNext(node2);

        linkedList.add(node2);


        Node node3 = new Node('B');
        head.setNext( node3);

        linkedList.add(node3);


        Node node4 = new Node('A');

        linkedList.add(node4);

        System.out.println(isPalindrome(head));
    }
}
