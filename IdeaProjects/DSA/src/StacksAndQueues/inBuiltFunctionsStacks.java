package StacksAndQueues;

import java.util.Stack;

public class inBuiltFunctionsStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        //.push()  pushes/appends the element to the end of the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);

        //.empty function checks if the stack is empty
        System.out.println(stack.empty());

        //.search() method returns distance of an object from the top of the stack in 1-based index system.
        System.out.println(stack.search(40));


        //.peek() returns element at the top of the stack without removing it
        System.out.println(stack.peek());

        //.pop removes the element from the end of the stack and returns it
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.empty());

        System.out.println(stack.search(20));

    }
}
