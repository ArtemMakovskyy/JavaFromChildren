package Shildt.Collection.ITVDN_Coll.COLL_FUNC;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class QequaSample {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>(16);
        //stak
        adq.add("A");
        adq.add("B");
        adq.add("d");
        adq.add("e");
        adq.add("f");
        adq.add("F");
        System.out.println("Извлeчeниe  из  стека:  ");
        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");
        System.out.println();
        ArrayList<String> als = new ArrayList<>();
        als.addAll(adq);
        System.out.println(als);
        System.out.println(als.isEmpty());
    }

}
