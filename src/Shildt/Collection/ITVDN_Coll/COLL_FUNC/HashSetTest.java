package Shildt.Collection.ITVDN_Coll.COLL_FUNC;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Омега");
        hs.add("Гамма");
        hs.add("Эпсилон");
        System.out.println(hs);
//        System.out.println(hs.size());
//        System.out.println(hs.contains("Гамма"));
//        Object[] ob = hs.toArray();
//        for (Object o : ob) {
//            System.out.println(o);
//        }
//        String []strOb = hs.toArray(new String[hs.size()]);
//        for (String s : strOb) {
//            System.out.println(s);
//        }
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Бета");
        lhs.add("Альфа");
        lhs.add("Эта");
        lhs.add("Омега");
        lhs.add("Гамма");
        lhs.add("Эпсилон");
        System.out.println(lhs);
        System.out.println(lhs);

        ///////////
        ////////////
        TreeSet<Integer> ts = new TreeSet<>();
        TreeSet<String> tss = new TreeSet<>();
        ts.add(5);
        ts.add(9);
        ts.add(8);
        ts.add(1);
        System.out.println(ts);
        tss.addAll(lhs);
        System.out.println(tss);

    }
}
