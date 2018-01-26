package com.simplymanas.learning;

public class LinkedList {

    private int length;
    ListNode head;

    public LinkedList(){
        length = 0;
    }

    public synchronized ListNode  getHead(){
        return head;
    }

    public synchronized void InsertAtBegin(ListNode node){
        node.setNext(head);
        head=node;
        length++;
    }

    public synchronized void InsertAtEnd(ListNode node){
        if(head == null)
            head = node;
        else{
            ListNode current, next;

            for (current=head; (next=current.getNext()) != null; current=next){
                current.setNext(node);
            }
            length++;
        }
    }

    public synchronized void PrintLinkList(){
        ListNode current=head;

        do
        {
            System.out.println(current.getData() + " => ");
            current=current.getNext();
        } while(current != null);
    }

    public static void main(String[] args) {
        LinkedList mylink = new LinkedList();
        ListNode node = new ListNode(15);
        mylink.InsertAtBegin(node);
        mylink.PrintLinkList();
    }
}
