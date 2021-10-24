package Shildt.Collection.ITVDN_Coll.COLL_FUNC;

import java.util.ArrayList;

public class ArraiList_F {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(0, 30);
        al.add(40);

        for (Integer i : al) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + ", ");
        }
////////////////////
        ArrayList<Integer> al2 = new ArrayList<>();
        System.out.println();
        for (int i = 0; i < 20; i++) {    // создаем 100
            al2.add(i+1);
        }
        System.out.println(al2);
        System.out.println();
        for (int i = 0; i < 10; i++) {    // создаем 100
            al2.remove(0);
        }
        System.out.println(al2);

    }
}
