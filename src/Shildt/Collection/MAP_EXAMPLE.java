package Shildt.Collection;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return name + '\'' + surname + '\'' + course;
    }

    @Override
    public int compareTo(Student o) {
        int result;
        result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
        }
        if (result == 0) {
            result = this.course - o.course;
        }
        return result;
    }
}

class HashCodeExample {
    void hashC1() {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanovs", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        map.put(null, 9.2);
        System.out.println(map);

        Student st4 = new Student("Zaur", "Tregulov", 3);
        Student st5 = new Student("Igor", "Sidorov", 4);


        boolean result = map.containsKey(st4);
        System.out.println(result);
        System.out.println(st1.equals(st4));
        System.out.println(st2.hashCode());
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());

        for (Map.Entry<Student, Double> en_y : map.entrySet()) {
            System.out.println(en_y.getKey() + ": " + en_y.getValue());
        }


    }

    void hashC2() {
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanovs", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        //==================== Поля и класс нужно сделать  final
        System.out.println(map.containsKey(st1));
        st1.course = 4;
        System.out.println(map.containsKey(st1));
    }
}

class HashMapExample {
    void hm1() {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidodrova");
        map1.put(15879, "Nikolay Petrov");
        map1.putIfAbsent(1000, "Oleg Ivanov");
//        map1.put(null,"Sergey Petrov");
//        map1.put(85214,null);

        System.out.println(map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.get(1001));

        System.out.println(map1.remove(15879));
        System.out.println(map1);
        map1.containsValue("Ivan Ivanov");
        System.out.println(map1.containsKey(500));
        System.out.println(map1.containsKey(6578));

        System.out.println(map1.keySet() + "++++++++++keySet");
        System.out.println(map1.values() + "+++++++++++values");

    }
} // o/1

class LinkedHashMapEx {
    void lhm1() {
        LinkedHashMap<Double,Student> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f,true);
        // accessOrder true - ставит в конец массива  последние  использованные элементы
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanovs", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorof", 2);

        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(9.1, st2);
        linkedHashMap.put(6.4, st3);
        linkedHashMap.put(8.2, st4);
        System.out.println(linkedHashMap); // сохраняет порядок добавления
        linkedHashMap.get(5.8);
        System.out.println(linkedHashMap);



    }
} // Наследник ХешМап хранит инфу о порядке добавления или порядке использование

class TreeMapExample {
    void tm1() {
        // если в ключе классы нужно имплементировать Comparable
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanovs", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorof", 2);
        Student st5 = new Student("Vasily", "Smirnof", 1);
        Student st6 = new Student("Sasha", "KApustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
        Student st8 = new Student("Petr", "Sidorov", 4);
        treeMap.put(5.8, st1);
        treeMap.put(9.1, st7);
        treeMap.put(6.4, st2);
        treeMap.put(8.2, st6);
        treeMap.put(7.2, st3);
        treeMap.put(7.9, st5);
        treeMap.put(3.2, st4);
        System.out.println(treeMap);
        treeMap.get(9.1);
        treeMap.remove(3.2);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());// сорт по убыванию ключей
        treeMap.tailMap(7.3); //выведет все ключи от 7,3 и выше
        treeMap.tailMap(7.3); //выведет все ключи от 7,3 и выше
        treeMap.headMap(7.3); //выведет все ключи до 7,3
        treeMap.lastEntry(); //  высший бал
        treeMap.firstEntry(); //  низший бал

        //==================
    }

    void tm2() {
        // если в ключе классы нужно имплементировать Comparable

        TreeMap<Student, Double> treeMapComp = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        TreeMap<Student, Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanovs", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Elena", "A", 2);
        Student st5 = new Student("Vasily", "Smirnof", 1);
        Student st6 = new Student("Sasha", "KApustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
        Student st8 = new Student("Petr", "Sidorov", 4);
        treeMap.put(st1, 5.8);
        treeMap.put(st7, 6.5);
        treeMap.put(st2, 9.5);
        treeMap.put(st6, 10.5);
        treeMap.put(st3, 20.5);
        treeMap.put(st5, 5.5);
        treeMap.put(st4, 1.5);
        System.out.println(treeMap);


        treeMap.lastEntry(); //  высший бал
        treeMap.firstEntry(); //  низший бал

        //==================
    }
}   // o/log k

public class MAP_EXAMPLE {
    public static void main(String[] args) {
        HashMapExample hm = new HashMapExample();
        HashCodeExample hc = new HashCodeExample();
        TreeMapExample tm = new TreeMapExample();
        LinkedHashMapEx lhm = new LinkedHashMapEx();

        lhm.lhm1();


    }
}
