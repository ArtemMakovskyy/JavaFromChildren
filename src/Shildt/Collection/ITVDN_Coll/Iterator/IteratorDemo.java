package Shildt.Collection.ITVDN_Coll.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("C ");
        als.add("A ");
        als.add("E ");
        als.add("B ");
        als.add("D ");
        als.add("F ");

        Iterator<String>itStr = als.iterator();

        while (itStr.hasNext()){
            String s = itStr.next();
            System.out.print(s);
        }
        System.out.println();

//        идоизменить перебираемые объекты
        ListIterator <String> lis = als.listIterator();
        while (lis.hasNext()){
            String element = lis.next();
            lis.set(element+"+");
        }
        System.out.print("Измененное содержимое  списочного массива al: ");
        itStr= als.iterator();
        while (itStr.hasNext()) {
            String el = itStr.next();
            System.out.print(el + " ");
        }
        System.out.println();

//            а  теперь отобразить список в обратном порядке

            while (lis.hasPrevious()){
                String elem = lis.previous();
                System.out.print(elem);
            }
        }
    }

