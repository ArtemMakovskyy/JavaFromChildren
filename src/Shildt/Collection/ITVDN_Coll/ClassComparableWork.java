package Shildt.Collection.ITVDN_Coll;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ClassComparableWork {
    public static void main(String[] args) {
        String a = "a";
        String s = "s";
        System.out.println(a.compareTo(s));
        String[] names0 = {"Sasha", "Masha", "Olya"};
        Arrays.sort(names0);
        for (String ss : names0) {
            System.out.print(ss + ",");
        }
        System.out.println();

        Collection<String> names = new ArrayList<>();
        names.add("Sasha");
        names.add("Masha");
        names.add("Olya");
        System.out.println(names);

        Object[] naArr = names.toArray();
        for (Object o : naArr) {
            System.out.println(o);
        }
    }
}
