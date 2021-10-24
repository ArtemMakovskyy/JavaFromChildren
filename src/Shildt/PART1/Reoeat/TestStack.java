package Shildt.PART1.Reoeat;


class Stack {
    int stek[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == stek.length-1) System.out.println("Steck is ful");
        else stek[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stek dounloading");
            return 0;
        } else return stek[tos--];
    }

}

public class TestStack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        Stack s3 = new Stack();
        Stack s4 = new Stack();
        Stack s5 = new Stack();
        Stack s6 = new Stack();
        Stack s7 = new Stack();

        for (int i = 0; i < 10; i++) s1.push(i);
        for (int i = 10; i < 20; i++) s2.push(i);
        for (int i = 20; i < 30; i++) s3.push(i);
        for (int i = 30; i < 40; i++) s4.push(i);
        for (int i = 40; i < 50; i++) s5.push(i);
        for (int i = 50; i < 60; i++) s6.push(i);
        for (int i = 60; i < 70; i++) s7.push(i);

        for(int i = 0;i<10;i++) System.out.print(s1.pop());
        System.out.println();
        for(int i = 0;i<10;i++) System.out.print(s3.pop());
        System.out.println();
        for(int i = 0;i<10;i++) System.out.print(s5.pop());
        System.out.println();
        for(int i = 0;i<10;i++) System.out.print(s2.pop());
        System.out.println();



    }
}
