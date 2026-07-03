package com.veradanicode.collection;
import java.util.Collections;
import java.util.Stack;
public class CollectionTask {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(15);
        stack.push(30);
        stack.push(8);
        stack.push(45);
        stack.push(20);

        int max = Collections.max(stack);
        System.out.println("Maximum Element = " + max);
    }
}
