package Shildt.Collec_Arr_Algoritms;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

@interface Note {
    String s();
}

public class AlgorithmsDemoS628 {
    public static void main(String[] args) {

        @Note(s = "создать неинициализированный  связный  список")
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(8);

        @Note(s = "создать компаратор с  обратным  упорядочением")
        Comparator<Integer> reverse = Collections.reverseOrder();

//        @Note(s = "отсортировать список с помощью  этого компаратора")
        System.out.println("Cпиcoк отсортирован в  обратном  порядке:  ");
        Collections.sort(linkedList, reverse);

        for (int i : linkedList) {
            System.out.println(i + ", ");
        }

//перетасовать список
        Collections.shuffle(linkedList);
        System.out.print("Cпиcoк перетасован:  ");
        System.out.println(linkedList);
        System.out.println(Collections.min(linkedList) + " min");
        System.out.println(Collections.max(linkedList) + " max");
    }
}
