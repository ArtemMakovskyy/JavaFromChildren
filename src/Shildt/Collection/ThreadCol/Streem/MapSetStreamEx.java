package Shildt.Collection.ThreadCol.Streem;
//https://www.youtube.com/watch?v=oTdm_CVIdJM&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=29
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MapSetStreamEx {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kaka dela");
        set.add("ok");
        set.add("poka");
        System.out.println(set);
        Set <Integer> set2 =  set.stream().map(el->el.length()).collect(Collectors.toSet());
        System.out.println(set2);
        List<Integer> list3 =  set.stream().map(el->el.length()).collect(Collectors.toList());
        System.out.println(list3);

    }
}
