package Shildt.Collection.ITVDN_Coll.MapColl;
//https://www.youtube.com/watch?v=eWoo-YIKs3o

import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.*;

class TestMApEntry {
    void var1ArList() {
        ArrayList<String> alS = new ArrayList<>();
        alS.add("D");
        alS.add("F");
        alS.add("A");
        Iterator<String> iterArList = alS.iterator();
        while (iterArList.hasNext()) {
            String str = iterArList.next();
            System.out.print(str);
        }
    }

    void var2() throws NoSuchMethodException {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Valera", 25);
        tm.put("Lena", 15);
        tm.put("Sasa", 26);
        tm.put("Aretm", 2);

        Iterator iterator = tm.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    void var3() {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Valera", 25);
        tm.put("Lena", 15);
        tm.put("Sasa", 26);
        tm.put("Aretm", 2);

        Iterator iterator = tm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry count = (Map.Entry) iterator.next();
            System.out.println(count.getKey() + " / " + count.getValue());
        }
        System.out.println();
    }

    void var4() {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Valera", 25);
        tm.put("Lena", 15);
        tm.put("Sasa", 26);
        tm.put("Aretm", 2);

        Set<Map.Entry<String, Integer>> set = tm.entrySet();
        for (Map.Entry<String, Integer> me : set){
            System.out.println(me.getKey()+": "+me.getValue());
        }

    }
}

public class MapEntryEx {
    public static void main(String[] args) throws NoSuchMethodException {
        TestMApEntry testMApEntry = new TestMApEntry();
//        testMApEntry.var1ArList();
//        testMApEntry.var2();
//        testMApEntry.var3();
//        testMApEntry.var4();

        String str = "Uncle dada Ivan Sergrrvich";
        System.out.println(str.lastIndexOf('c'));
        System.out.println(str.indexOf('c'));
        System.out.println(str.substring(2));

    }
}