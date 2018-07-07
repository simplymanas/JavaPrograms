package com.simplymanas.learning.datastructure.linkedlist;
//Check if linked list is a palindrome

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Palindrome {

   static boolean  isPalindrome(Node head) {

       Stack<Node> firstHalf = new Stack<>();
       Node slowPointer, fastPointer;
       Node temp = head;
       slowPointer = head;
       fastPointer = head;
       boolean isBoolean = true;


       while (slowPointer.next != null) {

           if(fastPointer.next.next == null){
            if(firstHalf.pop().data != slowPointer.data) isBoolean = false;
           }
           else{
               firstHalf.push(head);
               fastPointer=fastPointer.next.next;
               head=head.next;
           }

           slowPointer=slowPointer.next;
       }

       return isBoolean;
   }


    public static void main(String[] args) {

        List<Node> linkedList = Arrays.asList();
        Node head = new Node('A');
        linkedList.add(head);

        Node node1 = new Node('B');
        head.next=node1;

        linkedList.add(node1);

        Node node2 = new Node('C');
        node1.next=node2;

        linkedList.add(node2);


        Node node3 = new Node('B');
        head.next=node3;

        linkedList.add(node3);


        Node node4 = new Node('A');
        head.next=null;

        linkedList.add(node4);

        System.out.println(isPalindrome(head));
    }
}

class Node
{
    char data;
    Node next;

    Node(char d)
    {
        data = d;
        next = null;
    }
}
