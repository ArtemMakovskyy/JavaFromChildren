package Shildt.PART1.S152;

public class S152ContinueReturn {
    public static void main(String[] args) {
        CR cr = new CR();
        int num = 3;
        switch (num) {
            case 1:
                cr.cont1();
                break;
            case 2:
                cr.continueLebel2();
                break;
            case 3:
                cr.return3();
                break;
        }
    }
}

class CR {

    void cont1() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }

    void continueLebel2() {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }

    void return3() {
        boolean t = true;

        System.out.println("Дo  возврата.");
        if (t) return; // возврат в  вызывающий код
        System.out.println("Этoт оператор  выполняться не будет.");
    }
}