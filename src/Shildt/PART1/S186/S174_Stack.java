package Shildt.PART1.S186;

import java.util.Stack;

public class S174_Stack {
    public static void main(String[] args) {
        java.util.Stack steck = new Stack();

        System.out.println(steck.empty());

        steck.push("abc");
        steck.push(123);
        steck.push("lalala");

        System.out.println(steck.pop());
        System.out.println(steck.pop());
        System.out.println(steck.peek());
        System.out.println(steck.empty());
        System.out.println(steck.pop());

        System.out.println(steck.empty());

    }
}
