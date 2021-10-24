package Shildt.PART1.S186;

public class S174_3 {
    /**
     * если бі небіло функции стек
     * нужно запрограмировать функции isEmpty(), push(),pop(), peek()
     * int size(размер стека), int[] array (массив), int top (как по счету)
     * https://www.youtube.com/watch?v=PwTupaUiKM0
     */

    private int size;
    private int[] array;
    private int top;

    public void S174_3(int s) {
        size = s;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int a) {
        int i = ++top;
        array[i] = a;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[top--];
        }
    }

    public int pick() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[top];
        }
    }


    public static void main(String[] args) {
        S174_3 stack = new S174_3();
        stack.push(5);
        stack.push(2);
        stack.push(1);

    }
}
