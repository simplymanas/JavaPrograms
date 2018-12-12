//get the kth element for the tail from a linkedlist

package com.simplymanas.learning.datastructure.linkedlist;

import java.util.LinkedList;

public class KthElement {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(15);
        linkedList.add(35);

        linkedList.add(25);
        linkedList.add(45);
        linkedList.add(55);
        linkedList.add(65);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.toString());
        getKthElement(linkedList,4);


        Node first = new Node("15");
        Node middle = new Node("25");

        first.setNext(middle);
        Node last = new Node("35");
        middle.setNext(last);


       // Node.printList(first);

    }

    public static int getKthElement(LinkedList<Integer> linkedList, int elementNo){
        int slowPointer=0, fastPointer=0;

        while(fastPointer+elementNo<linkedList.size()){

           // linkedList.
            slowPointer++;
            fastPointer+=elementNo;
        }
        System.out.println(linkedList.get(slowPointer));

        return 0;
    }
}
