package com.simplymanas.learning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class QueueFromTwoStack {

    Stack<Integer> stackOne = new Stack<>();
    Stack<Integer> stackTwo = new Stack<>();


    public void dequeue() {

        if (stackTwo.isEmpty()) {
            while (!stackOne.isEmpty())
                stackTwo.push(stackOne.pop());
            //Arrays.stream(stackTwo.toArray()).forEach(num -> System.out.print(num + "->"));
        }
        System.out.println();
        System.out.println("QUEUE: ");
        Arrays.stream(stackTwo.toArray()).forEach(num -> System.out.print(num + "->"));

        System.out.println();
        System.out.println( "Dequeue: " + stackTwo.pop());



    }

        public void enque(int inputValue) {
            // if (stackOne.empty())
            while (!stackTwo.isEmpty())
                stackOne.push(stackTwo.pop());
            stackOne.push(inputValue);
        }

    public static void main(String[] args) {
        QueueFromTwoStack queueFromTwoStack=new QueueFromTwoStack();

        queueFromTwoStack.enque(5);
        queueFromTwoStack.enque(15);
        queueFromTwoStack.enque(25);
        queueFromTwoStack.enque(35);
        queueFromTwoStack.enque(45);

        queueFromTwoStack.dequeue();
        queueFromTwoStack.dequeue();

        queueFromTwoStack.enque(55);
        queueFromTwoStack.enque(65);
        queueFromTwoStack.enque(75);

        queueFromTwoStack.dequeue();

        queueFromTwoStack.dequeue();
        queueFromTwoStack.dequeue();
        queueFromTwoStack.dequeue();
        queueFromTwoStack.dequeue();


    }
}
