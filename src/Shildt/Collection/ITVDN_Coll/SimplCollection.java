package Shildt.Collection.ITVDN_Coll;

import java.util.ArrayList;
import java.util.Collection;

public class SimplCollection {
    public static void main(String[] args) {
        Collection<Integer> listColl = new ArrayList<>();
        Collection<Integer> listColl2 = new ArrayList<>();
        listColl.add(5);
        listColl.add(4);
        listColl.add(3);
        listColl.add(2);
        System.out.println(listColl.add(1)); // можно ли добавить и добавить
        System.out.println(listColl.size());

        Object[] arrListColl = listColl.toArray();
        System.out.println(listColl);
        for (int i = 0; i < arrListColl.length; i++) {//arr.fori
            System.out.print(i+", ");
        }


        listColl2.addAll(listColl);
//        listColl2.clear();//удаляет все из коллекции
//        listColl.isEmpty();// проверка пустая ли
        System.out.println();
        System.out.println(listColl2);
        Object[]l2 = listColl2.toArray();
        for (int i = 0; i < l2.length; i++) {
            System.out.print(l2[i]);
        }
        Collection <String> s1Coll = new ArrayList<>();
        s1Coll.add("o");
        s1Coll.add("n");
        s1Coll.add("e");
        System.out.println(s1Coll);
        Object[]os1 = s1Coll.toArray();
        for (int i = 0; i < os1.length; i++) {
            System.out.println(os1[i]);
        }



    }
}
