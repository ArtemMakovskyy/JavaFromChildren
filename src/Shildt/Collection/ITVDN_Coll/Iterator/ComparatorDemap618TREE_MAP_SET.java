package Shildt.Collection.ITVDN_Coll.Iterator;

import java.util.Comparator;
import java.util.TreeSet;

//class MyCo implements Comparator<String> {
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.compareTo(o2);
//    }
//}

public class ComparatorDemap618TREE_MAP_SET {
    public static void main(String[] args) {
//        MyCo myCo = new MyCo();
//        TreeSet<String> ts = new TreeSet<>(myCo.reversed());
        TreeSet<String> ts = new TreeSet<>((a,b)->b.compareTo(a));
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }
}
