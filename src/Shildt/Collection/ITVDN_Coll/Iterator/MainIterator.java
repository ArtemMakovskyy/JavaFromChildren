package Shildt.Collection.ITVDN_Coll.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainIterator {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(5);
        a1.add(8);
        Iterator<Integer> iterator = a1.iterator();
        //есть ли следующий елемент
        while ((iterator.hasNext())){
            // переходим к следующему списку и выводим
            Integer tmp  = iterator.next();
            System.out.println(tmp);
        }
        System.out.println();

        ListIterator<Integer> lostIterator = a1.listIterator();
        while ((lostIterator.hasNext())){
            Integer tmp  = lostIterator.next();
            System.out.println(tmp);
        }

    }
}
