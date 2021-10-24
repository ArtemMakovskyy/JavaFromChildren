package Shildt.Collection.ITVDN_Coll.Iterator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return b.compareTo(a);
        // переопределять метод equals () не  требуется
    }
}

public class ComparatorDemap617TREE_MAP_SET {
    public static void main(String[] args) {
        TreeSet<String>ts = new TreeSet<>(new MyComp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
//        отсортировано в обратном порядке.
    }
}
