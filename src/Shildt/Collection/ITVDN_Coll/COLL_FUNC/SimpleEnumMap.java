package Shildt.Collection.ITVDN_Coll.COLL_FUNC;

import java.util.*;

enum Animal{
    CAT,DOG,BIRD
}
public class SimpleEnumMap {
    public static void main(String[] args) {
        Map<Animal, String> enumMap = new EnumMap<Animal, String>(Animal.class);
        enumMap.put(Animal.CAT,"C");
        enumMap.put(Animal.DOG,"D");
        enumMap.put(Animal.BIRD,"B");
        enumMap.put(Animal.BIRD,null);

        // не сихронизированная, если нужно синхронизировать в многопотоке
        Collections.synchronizedMap(enumMap);

        // нет итератора -> импортируем в SET
        Set set = enumMap.entrySet();
        for (Object o: set){
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}
