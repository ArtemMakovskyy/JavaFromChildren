package Shildt.Collection;

import java.util.Stack;

class StackMethod {
    static void abc1() {
        System.out.println("abc1 starts");
        System.out.println("abc1 ends");
    }

    static void abc2() {
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 ends");
    }

    static void abc3() {
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ends");
    }

    void stackPopPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");// push вставляет в самый верх
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}

public class StackExample {

    public static void main(String[] args) {
//        System.out.println("main starts");
//        StackMethod.abc3();
//        System.out.println("main ends");

        StackMethod stackMethod = new StackMethod();
        stackMethod.stackPopPush();

    }
}
