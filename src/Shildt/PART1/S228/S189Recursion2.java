package Shildt.PART1.S228;

public class S189Recursion2 {
    public static void main(String[] args) {
        RexTest ob = new RexTest(10);
        int y;
        for (y = 0; y < 10; y++) ob.values[y] = y;
        ob.printArray(10);

    }
}

class RexTest {
    int values[];

    RexTest(int i) {
        values = new int[i];
    }

    /**
     * вывести рекурсивно элементы массива
     */

    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}