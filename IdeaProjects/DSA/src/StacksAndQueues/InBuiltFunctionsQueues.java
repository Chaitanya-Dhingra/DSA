package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltFunctionsQueues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        // .add() adds the element at the end of the list
        queue.add(3);
        queue.add(4);
        queue.add(8);
        queue.add(7);
        queue.add(6);

        //.peek() shows the head of the queue without removing it
        System.out.println(queue.peek());

        //.remove() removes the head of the list: FIFO
        System.out.println(queue.remove());
        System.out.println(queue.peek());


    }
}
