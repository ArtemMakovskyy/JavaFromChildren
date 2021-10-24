package Shildt.Collection.ITVDN_Coll.Iterator;

import java.util.ArrayList;

public class FOREACHDEMA {
    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(1);
        ali.add(9);
        ali.add(50);
        ali.add(8);
        for (int v : ali) {
            System.out.print(v + ", ");
        }
        System.out.println();

        int sum = 0;
        for (int v : ali) {
            sum += v;
        }
        System.out.print(sum);
    }
}
