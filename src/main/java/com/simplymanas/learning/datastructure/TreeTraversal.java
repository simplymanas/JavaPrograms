package com.simplymanas.learning.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {

    TreeNode root;

    void iterativePreorder()
    {
        preorderTraversal(root);
    }
    void iterativeInOrder()
    {
        inorderTraversal(root);
    }

    public List<Integer> preorderTraversal(TreeNode root) {



        List<Integer> preOrderList = new ArrayList();
        if (root == null) {
            return preOrderList;
        }

        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        nodeStack.push(root);


        while (nodeStack.empty() == false) {

            TreeNode mynode = nodeStack.peek();
            System.out.print(mynode.val + " ");
            preOrderList.add(nodeStack.pop().val);


            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
        return preOrderList;
    }

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> inOrderList = new ArrayList();

        if (root == null) {
            return inOrderList;
        }

        Stack<TreeNode> nodeStack = new Stack<TreeNode>();

        while (root != null) {
            nodeStack.push(root);
            root = root.left;
        }

       // nodeStack.push(root);


        while (nodeStack.empty() == false) {

            TreeNode mynode = nodeStack.peek();
            System.out.print(mynode.val + " ");
            inOrderList.add(nodeStack.pop().val);


            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                //nodeStack.push(mynode.right);
                mynode=mynode.right;
            }
            while (mynode != null) {
                nodeStack.push(mynode);
                mynode=mynode.left;
            }
        }
        return inOrderList;
    }


    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(2);
        tree.iterativePreorder();
        tree.iterativeInOrder();
    }
}

