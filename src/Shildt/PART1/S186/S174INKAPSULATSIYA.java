package Shildt.PART1.S186;

public class S174INKAPSULATSIYA {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        // разместить числа в  стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 30; i < 40; i++) mystack2.push(i);
        // извлечь эти числа из стека
        System.out.println("Coдepжимoe стека  mystack 1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack1.рор()+"  ");
        System.out.println();
        System.out.println();
        System.out.println("Coдepжимoe  стека  mystack 2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack2.рор()+" " );

        System.out.println();
    }
}

class Stack {
    int stck[] = new int[10];
    int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в  стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Cтeк заполнен.");
        else stck[++tos] = item;
    }

    // извлечь элемент из стека
    int рор() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен .");
            return 0;
        } else return stck[tos--];
    }
}

