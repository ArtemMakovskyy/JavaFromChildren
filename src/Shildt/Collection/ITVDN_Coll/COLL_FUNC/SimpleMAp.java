package Shildt.Collection.ITVDN_Coll.COLL_FUNC;

import java.util.HashMap;
import java.util.Map;

public class SimpleMAp {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("World5", 150);
        map.put("World6", 151);
        System.out.println(map.size());
        for (Map.Entry<String, Integer> tmp : map.entrySet())
            System.out.println(tmp.getKey() + " " + tmp.getValue());

//=============

        System.out.println();
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("AgeMan", 90);
        myMap.put("AgeWoman", 100);
        myMap.put("AgeDog", 35);
        myMap.put(null, 35);
        System.out.print(myMap);

        System.out.println(", size " + myMap.size());
        System.out.println(myMap.containsValue(35)); // true

        // чтоб пробежаться по ключевым словам Map.Entry
        //myMap.entrySet() пробежать по значениям
        // myMap.containsValue(?)
        // yMap.containsKey(?)

        for (Map.Entry<String, Integer> temp : myMap.entrySet()) {
            System.out.println(temp);
        }
        System.out.println();
        for (Map.Entry<String, Integer> temp : myMap.entrySet()) {
            System.out.println(temp.getKey()+" "+ temp.getValue());
        }
    }
}
