package com.simplymanas.learning.datastructure.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ListOfListTraversal {

    List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
    private int rowNo;
    private int colNo;

    public ListOfListTraversal(List<List<Integer>> inputList) {
        this.rowNo = this.colNo = 0;
        this.listOfList = inputList;
    }

    public int next() {
        if (listOfList.isEmpty()) { return 0; }

        int nextNumber = 0;

        if (rowNo >= listOfList.get(colNo).size()) {
            moveCursor();
            return next();
        } else {
            nextNumber = listOfList.get(colNo).get(rowNo);
            moveCursor();
        }
        return nextNumber;
    }

    private void moveCursor(){
        if (colNo >= listOfList.size() - 1) {
                this.colNo = 0;
                this.rowNo++;
            } else {
                this.colNo++;
            }
    }

    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        listA.add(12);
        listA.add(13);
        listA.add(22);
        listA.add(29);
        listA.add(28);
        listA.add(42);



        List<Integer> listB = new ArrayList<Integer>();
        listB.add(52);
        listB.add(63);

        List<Integer> listC = new ArrayList<Integer>();
        listC.add(92);
        listC.add(83);
        listC.add(72);
        listC.add(53);

        List<List<Integer>> mainList = new ArrayList<List<Integer>>();

        mainList.add(listA);
        mainList.add(listB);
        mainList.add(listC);

        ListOfListTraversal listTraversal = new ListOfListTraversal(mainList);

        ListOfListTraversal listTraversal1 = new ListOfListTraversal(mainList);

        System.out.println("0: " + listTraversal.next());


       // System.out.println("1: " + listTraversal1.next());
        //System.out.println("1: " + listTraversal1.next());

        System.out.println("0: " + listTraversal.next());
        System.out.println("0: " + listTraversal.next());

        //System.out.println("1: " + listTraversal1.next());
        //System.out.println("1: " + listTraversal1.next());


        System.out.println("0: " + listTraversal.next());
        System.out.println("0: " + listTraversal.next());

        System.out.println("0: " + listTraversal.next());

        System.out.println("0: " + listTraversal.next());
        System.out.println("0: " + listTraversal.next());
        System.out.println("0: " + listTraversal.next());

        System.out.println("0: " + listTraversal.next());
        System.out.println("0: " + listTraversal.next());

        System.out.println("0: " + listTraversal.next());


    }
}
