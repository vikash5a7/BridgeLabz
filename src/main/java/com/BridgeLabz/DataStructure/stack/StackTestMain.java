package com.BridgeLabz.DataStructure.stack;

public class StackTestMain {

    public static void main(String[] args) {

        StackClass stack = new StackClass(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
    }
}