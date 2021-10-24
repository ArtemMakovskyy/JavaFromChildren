package Shildt.Collection.ITVDN_Coll.COLL_FUNC;

import java.util.*;

public class SimpleIdentityHashMap {
    public static void main(String[] args) {
        // при сравнениии элементов сравниваются ссылки , а не значения как в   HashMap / не испоьзуется иквел
        Map map = new HashMap();
        Map map2 = new Hashtable();
        Map map3 = new LinkedHashMap();
        Map map4 = new TreeMap();

        map.put("2", "two");
        map.put("1", "one");
        map.put("3", "three");
        System.out.println(map.get("3"));
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }
Collection<Integer> col = new ArrayList<>();

    }

}
