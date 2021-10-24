package Shildt.PART1.S186;

import java.util.Stack;

//https://www.youtube.com/watch?v=PwTupaUiKM0
public class S174_2 {
    public static void main(String[] args) {
        int s = 2;
        switch (s) {
            case 1:
                Stack<Integer> stack = new Stack<Integer>();
                System.out.println(stack.isEmpty());
                stack.push(5);
                stack.push(3);
                stack.push(9);
                stack.push(7);
                System.out.println(stack);
                System.out.println(stack.peek());
                System.out.println(stack);
                System.out.println(stack.pop());
                System.out.println(stack);
                System.out.println(stack.pop());
                System.out.println(stack.pop());
                System.out.println(stack.pop());
                System.out.println(stack.isEmpty());
                break;
            case 2:

                int steckData[] = {1, 2, 3, 4, 5};
                int steckData2[] = {1, 2, 3, 4, 5, 6};

                Stack stack2 = new Stack();

//                stack2.push(steckData);
                stack2.push(1);
                stack2.push(2);
                stack2.push(steckData2);
                stack2.push("hello");
                System.out.println(stack2.pop());
                System.out.println(stack2.pop());
                System.out.println(stack2.pop());
                System.out.println(stack2.pop());

        }
    }
}
