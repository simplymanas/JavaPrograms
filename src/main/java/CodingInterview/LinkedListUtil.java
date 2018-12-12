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


        Node node1 = new Node(2);
        head.setNext(node1);

        Node node2 = new Node(3);
        node1.setNext(node2);

        Node node3 = new Node(4);
        node2.setNext(node3);

        Node node4 = new Node(5);
        node3.setNext(node4);

        Node node5 = new Node(6);
        node4.setNext(node5);

        Node node6 = new Node(7);
        node5.setNext(node6);

        Node node7 = new Node(8);
        node6.setNext(node7);

        Node node8 = new Node(9);
        node7.setNext(node8);

        Node node9 = new Node(10);
        node8.setNext(node9);

        Node node10 = new Node(11);
        node9.setNext(node10);

        Node node11 = new Node(12);
        node10.setNext(node11);

        LinkedList linkedList = new LinkedList(head);

        LinkedListUtil linkedListUtil = new LinkedListUtil();

        linkedListUtil.incrementalReverse(linkedList);

        linkedListUtil.incrementalReverse(null);

        linkedList.print();


        // More Test cases
        //list with duplicates
        // list with 1 node
        //list with 2 node
        // list with integer overflow data

    }
}
