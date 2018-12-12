//package com.simplymanas.learning.datastructure.trees;
///*
//if the new node’s value is lower than the current node’s, we go to the left child
//if the new node’s value is greater than the current node’s, we go to the right child
//when the current node is null, we’ve reached a leaf node and we can insert the new node in that position
//
// */
//public class BinaryTree {
//
//Node root;
//    public void insertLeft(int value, Node parent){
//
//        if(parent.left !=null){
//            System.out.println("Left node exist");
//        }
//        else{
//            parent.left= new Node(value);
//        }
//    }
//
//    public void insertRight(int value, Node parent){
//        if(parent.right !=null){
//            System.out.println("Right node exist");
//        }
//        else{
//            parent.right= new Node(value);
//        }
//    }
//
//    private Node addRecursive(Node current, int value) {
//
//        if (current == null) {
//            return new Node(value);
//        }
//
//        if (value < current.value) {
//            current.left = addRecursive(current.left, value);
//        } else if (value > current.value) {
//            current.right = addRecursive(current.right, value);
//        } else {
//            return current; //value already exists
//        }
//        return current;
//    }
//    public void add(int value){
//        root= addRecursive(root, value);
//    }
//
//    private BinaryTree createBinaryTree(){
//        BinaryTree tree = new BinaryTree();
//
//        tree.add(10);
//        tree.add(20);
//        tree.add(15);
//        tree.add(17);
//        tree.add(10);
//        tree.add(10);
//        tree.add(10);
//
//        return tree;
//    }
//    public static void main(String[] args) {
//
//       BinaryTree.
//
//    }
//}
