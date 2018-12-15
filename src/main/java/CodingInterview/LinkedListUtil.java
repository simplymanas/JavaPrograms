package CodingInterview;

import com.simplymanas.learning.datastructure.linkedlist.LinkedList;
import com.simplymanas.learning.datastructure.linkedlist.Node;

public class LinkedListUtil {

    private void reverseList(Node startingNode, Node lastNode) {

        if (startingNode == null || lastNode == null) {
            throw new NullPointerException("Found Null/Empty Node");
        }

        //if both the nodes are pointing to the same then return node
        if (startingNode.equals(lastNode)) {
            return;
        }

        Node current = startingNode.getNext();

        Node last = lastNode;
        Node lastNext = lastNode.getNext();

        while (!last.equals(startingNode.getNext())) {

            while (current.getNext() != last) {
                current = current.getNext();
            }
            last.setNext(current);
            last = current;
            current = startingNode.getNext();
        }
        startingNode.setNext(lastNode);
        last.setNext(lastNext);
    }

    public LinkedList incrementalReverse(LinkedList inputList) {
        try {
            if (inputList == null) {
                throw new NullPointerException("Found Null/Empty List");
            }

            int increment = 1;
            int endNodeIndex = 2;
            int startNodeIndex = 0;

            //skipping the 0th position
            increment += 2;

            while (startNodeIndex < inputList.size()) {

                if (endNodeIndex > inputList.size()) {
                    reverseList(inputList.get(startNodeIndex), inputList.get(inputList.size() - 1));
                } else {
                    reverseList(inputList.get(startNodeIndex), inputList.get(endNodeIndex));
                }

                startNodeIndex = endNodeIndex;
                endNodeIndex = startNodeIndex + increment;
                increment++;
            }

        } catch (NullPointerException np) {
            System.out.println(np.getMessage());
        }

        return inputList;
    }

    public static void main(String[] args) {

        Node head = new Node(1);

        LinkedList linkedList = new LinkedList(head);
        linkedList.insert(new Node(2));
        linkedList.insert(new Node(3));
        linkedList.insert(new Node(4));
        linkedList.insert(new Node(5));
        linkedList.insert(new Node(6));
        linkedList.insert(new Node(7));
        linkedList.insert(new Node(8));
        linkedList.insert(new Node(9));
        linkedList.insert(new Node(10));
        linkedList.insert(new Node(11));
        linkedList.insert(new Node(12));
        linkedList.insert(new Node(13));
        linkedList.insert(new Node(14));
        linkedList.insert(new Node(15));
        linkedList.insert(new Node(16));
        linkedList.insert(new Node(17));
        linkedList.insert(new Node(18));


        LinkedListUtil linkedListUtil = new LinkedListUtil();

        System.out.println("Linked List to be reversed");
        linkedList.print();

        linkedListUtil.incrementalReverse(linkedList);

        System.out.println("Reversed linked list");

        linkedList.print();


        // linkedListUtil.incrementalReverse(null);

        // More Test cases
        //list with duplicates
        // list with 1 node
        //list with 2 node
        // list with integer overflow data

    }
}
