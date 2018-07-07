package com.simplymanas.learning;

public class LinkedList {

    private int length;
    ListNode head=null;
    ListNode current=null;

    public LinkedList(){
        length = 0;
    }

    public synchronized ListNode  getHead(){
        return head;
    }

    public synchronized void insertAtBegin(ListNode node){
        node.setNext(head);
        head=node;
        current=head;
        length++;
    }

    public synchronized void insertAtEnd(ListNode node){
        if(head == null)
            head = node;
        else {
            //ListNode current, next;
            current.setNext(node);
            node.setNext(null);
            current = node;
            length++;
        }
    }
    public  synchronized  void insert(ListNode node){
        current.setNext(node);
        current=node;
        length++;
    }

    public synchronized void printLinkList(){
        ListNode current=head;

        do
        {
            System.out.print(current.getData() + " => ");
            current=current.getNext();
        } while(current != null);
    }

    public static void main(String[] args) {
        LinkedList mylink = new LinkedList();
        ListNode node = new ListNode(15);
        mylink.insertAtBegin(node);

        ListNode node1 = new ListNode(25);

        mylink.insertAtEnd(node1);

        ListNode node2 = new ListNode(15);

        mylink.insertAtEnd(node2);

        mylink.printLinkList();
    }
}
