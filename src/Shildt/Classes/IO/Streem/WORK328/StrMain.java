package Shildt.Classes.IO.Streem.WORK328;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.youtube.com/watch?v=nNEMhUQCysA

class StertStream {
    <T, V> void prnMAP(Map<T, V> map) {
        System.out.println();
        for (Map.Entry<T, V> temp : map.entrySet()) {
            System.out.println(temp.getKey() + " " + temp.getValue());
        }
    }

    void first(List list) {

        list.stream().filter(x -> x.equals("one")).forEach(n -> System.out.println(n));
        // есть ментоды lazy & eager. Методы lazy не выполняются без eager

        System.out.println();
        list.stream().filter(x -> {
            System.out.println("hello");
            return x.equals("one");
        }).count();

        System.out.println();
        list.stream().filter(x -> {
            System.out.println(x);
            return x.equals("one");
        }).count();
    }

    void secondMap() {
        System.out.println();
        Map<Integer, String> myMap01 = Map.of(1, "Artem", 2, "Lena", 3, "Sasha", 4, "Polina");
        for (Map.Entry<Integer, String> tmp : myMap01.entrySet()) {
//            System.out.println(tmp);
            System.out.println(tmp.getKey() + " " + tmp.getValue());
        }
    }

    void listInMap(List list) {
        Map<Integer, String> map1;
        Map<String, String> map2;
        Map<String, String> map3;

        map1 = (Map<Integer, String>) list.stream().collect(Collectors
                .toMap(String::hashCode, Function.identity()));
        prnMAP(map1);

        map2 = (Map<String, String>) list.stream().collect(Collectors
                .toMap(Function.identity(), Function.identity()));
        prnMAP(map2);

    }
}

public class StrMain {
    public static void main(String[] args) {
        StertStream start = new StertStream();

        long startT = System.nanoTime();
        List<String> list = List.of("one", "two", "three");
//        start.first(list);
//        start.secondMap();
        List<String> stringList = list.stream().sorted().collect(Collectors.toList());
        Set<String> stringSet = list.stream().collect(Collectors.toSet());

        start.listInMap(list);




//        V2



        long endT = System.nanoTime();
        System.out.println("\n" + (endT - startT) / 1000);
    }

}
