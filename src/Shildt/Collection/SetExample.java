package Shildt.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


class SetExamples {

    void treesetIntEx() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
//        treeSet.add(null); //нельзя
        treeSet.remove(2);
        treeSet.contains(2);
        System.out.println(treeSet);


        TreeSet<Student> treeSetOb = new TreeSet<>();
        Student st1 = new Student("Zaur", "Tregulov", 1);
        Student st2 = new Student("Mariya", "Ivanovs", 2);
        Student st3 = new Student("Igor", "Petrov", 3);
        Student st4 = new Student("MArina", "Sidorof", 4);
        Student st5 = new Student("Olya", "Sidorof", 5);
        treeSetOb.add(st1);
        treeSetOb.add(st2);
        treeSetOb.add(st3);
        treeSetOb.add(st4);
        treeSetOb.add(st5);
        System.out.println(treeSetOb);
        treeSetOb.first();
        treeSetOb.last();
        System.out.println(treeSetOb.headSet(st2));
        System.out.println(treeSetOb.tailSet(st2));
        System.out.println(treeSetOb.subSet(st4,st1));





    } // хранит в отсортированом порядке, нет дубликатов, значения нет

    void heshsetIntEx() {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);
        System.out.println(hashSet1 + " hashSet1");

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(3);
        hashSet2.add(8);
        System.out.println(hashSet2 + " hashSet2");

        HashSet<Integer> union = new HashSet<>(hashSet1);// слияние
        union.addAll(hashSet2);
        System.out.println(union + " union");

        HashSet<Integer> intersect = new HashSet<>(hashSet1); // пересечение
        intersect.retainAll(hashSet2);
        System.out.println(intersect + " intersect -пересечение");

        HashSet<Integer> subtruct = new HashSet<>(hashSet1); // разность
        subtruct.removeAll(hashSet2);
        System.out.println(subtruct + " subtruct - разность");
    }

    void heshsetStringEx() {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        set.add("Igor");
        set.remove("Zaur");
        System.out.println(set);
//        for (String s: set){
//            System.out.println(s);
//        }

    } // не запоминает порядок добавления
    // ключи - это елементы HashSet , значения константа / заглушка
    // может содержать NULL
}


public class SetExample { // SET коллекция хранящая уникальные эллементы
    // методы данной коллекции очень быстры
    // в основе SET лежит урезанный MAP
    public static void main(String[] args) {
        SetExamples setE = new SetExamples();
//        setE.heshsetStringEx();
        setE.treesetIntEx();


    }
}
