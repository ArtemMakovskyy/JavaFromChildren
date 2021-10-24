package Shildt.Classes.IO.Streem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class w9StreamDemo8iterator1148 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бeтa");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");
//        iterator
        Stream<String> myStream = myList.stream();
        Iterator<String> iterator = myStream.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();

        myStream = myList.stream();
        Spliterator<String> spliterator = myStream.spliterator();
        while (spliterator.tryAdvance(n -> System.out.print(n + " sp"))) ;
        System.out.println("\n");
// /Иногда некоторое действие требуется выполнить над всеми элементами сразу,
// а не над каждым из них по очереди.p1151
        Stream<String> myStream2 = myList.stream();

        Spliterator<String> splititr1 = myStream2.spliterator();

        Spliterator<String> splititr2 = splititr1.trySplit(); //а теперь разделить первый итератор
//        спользовать сначала итератор splititr2, если нельзя разделить итератор splititr
        if (splititr2 != null) {
            splititr2.forEachRemaining(n -> System.out.println(n + " s2"));
        }
        System.out.println();
        splititr1.forEachRemaining(n -> System.out.println(n + " s1"));
        System.out.println();
    }
}
