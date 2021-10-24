package Shildt.Collection.ITVDN_Coll.Iterator;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo_p598 {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.print("Coдepжимoe списочного массива vals c помощью (tryAdvance): \n");
        Spliterator<Double> splititr = vals.spliterator();
        while (splititr.tryAdvance((n) -> System.out.print(n+", "))) ;
        System.out.println();

        // создать нов. массив, из корней массива
        splititr = vals.spliterator();
        ArrayList <Double> sqrs = new ArrayList<>();
        while (splititr.tryAdvance(n-> sqrs.add(Math.sqrt(n))));

        System.out.print("forEachRemaining "+ "Coдepжимoe списочного массива /sqrs/: \n");
        splititr = sqrs.spliterator();
        splititr.forEachRemaining(n-> System.out.println(n+", "));



    }
}
