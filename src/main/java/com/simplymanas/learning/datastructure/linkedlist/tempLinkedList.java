//package CodingInterview;
//
//
//import com.simplymanas.learning.datastructure.linkedlist.Node;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//
//public class LinkedListUtil {
//
//    private List<Node> reverseList(Node<Integer> startNode, Node<Integer> endNode) {
//
//        List<Node> reversedList = new ArrayList<>();
//
//        //if the nodes are null return
//        if (startNode == null || endNode == null) {
//            return null;
//        }
//
//        //if both the nodes are pointing to the same then return one node
//        if (startNode.equals(endNode)) {
//            reversedList.add(startNode);
//            System.out.println( reversedList.get(0).getData());
//
//            return reversedList;
//        }
//
//        //if the node is immediate next node then reverse it and return
//        if(startNode.getNext().equals(endNode)){
//            endNode.setNext(startNode);
//            reversedList.add(endNode);
//
//            return reversedList;
//        }
//
//
//        Node head = startNode;
//
//
//        while (startNode != endNode) {
//
//            while (head.getNext() != endNode) {
//                head = head.getNext();
//            }
//            endNode = head;
//            head = startNode;
//            reversedList.add(endNode);
//            System.out.println( reversedList.get(0).getData());
//        }
//        return reversedList;
//    }
//
//    public List<Node> incrementalReverse(List<Node> inputList) {
//        List<Node> resultList = new ArrayList<>();
//        int increment = 1;
//        int endNodeIndex = 0;
//        int startNodeIndex = 0;
//
//        while (startNodeIndex < inputList.size()) {
//            if (endNodeIndex > inputList.size()) {
//                reverseList(inputList.get(startNodeIndex), inputList.get(inputList.size()));
//            }else {
//                reverseList(inputList.get(startNodeIndex), inputList.get(endNodeIndex));
//            }
//            startNodeIndex = endNodeIndex + 1;
//            endNodeIndex = startNodeIndex + increment;
//            increment++;
//        }
//
//        return resultList;
//    }
//
//    public static void main(String[] args) {
//        List<Node> linkedList = new ArrayList<>();
//        Node head = new Node(1);
//
//        linkedList.add(head);
//
//        Node node1 = new Node(2);
//        head.setNext(node1);
//
//        linkedList.add(node1);
//
//        Node node2 = new Node(3);
//        node1.setNext(node2);
//
//        linkedList.add(node2);
//
//        Node node3 = new Node(4);
//        node2.setNext(node3);
//
//        linkedList.add(node3);
//
//        Node node4 = new Node(5);
//        node3.setNext(node4);
//
//        linkedList.add(node4);
//
//
//        Node node5 = new Node(6);
//        node4.setNext(node5);
//
//        linkedList.add(node5);
//
//
//        Node node6 = new Node(7);
//        node5.setNext(node6);
//
//        linkedList.add(node5);
//
//
//        LinkedListUtil linkedListUtil = new LinkedListUtil();
//
//        linkedListUtil.incrementalReverse(linkedList);
//    }
//}
