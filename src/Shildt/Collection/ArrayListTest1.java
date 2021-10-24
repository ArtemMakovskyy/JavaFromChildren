package Shildt.Collection;
/**
 * https://www.youtube.com/watch?v=h2mD0e72U4U&t=636s
 */

import java.util.*;

class Students {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double averGrade;

    public Students(String name, char sex, int age, int course, double averGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.averGrade = averGrade;
    }

    @Override
    public String toString() {
        return
                name + ", " + sex + ", " + age + ", " + course + ", " + averGrade + "\n ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return sex == students.sex &&
                age == students.age &&
                course == students.course &&
                Double.compare(students.averGrade, averGrade) == 0 &&
                Objects.equals(name, students.name);
    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return name + '\'' + course;
    }
}

class AL {
    void al2() {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add("sds");

    }

    void al3() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(2, "Mariya");
        System.out.println(arrayList1.get(2));
        System.out.println(arrayList1);
        arrayList1.set(1, "Dan"); // replase
        System.out.println(arrayList1);
        arrayList1.remove(1); // delete

    }

    void al3_1() {
        Students st1 = new Students("Ivan", 'm', 22, 3, 8.3);
        Students st2 = new Students("Nikolay", 'm', 28, 2, 6.4);
        Students st3 = new Students("Elena", 'f', 19, 1, 8.9);
        Students st4 = new Students("Petr", 'm', 35, 4, 7);
        Students st5 = new Students("Mariya", 'f', 23, 3, 8.4);
        ArrayList<Students> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        Students st6 = new Students("Mariya", 'f', 23, 3, 8.4);
//        students.remove(st6);
        System.out.println(students);

        int index = students.indexOf(st6);
        System.out.println(index + " indexOf, выдает равную позицию");

    }

    void al4() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Ivan");


        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);
        System.out.println(arrayList1.indexOf("Ivan") + " Ivan");
        System.out.println(arrayList1.lastIndexOf("Ivan") + " Ivan");
        System.out.println(arrayList1.contains("Ivan") + " contains Ivan");

    }

    void al5_1() {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> lis_SB = Arrays.asList(array); // ???
        System.out.println(lis_SB);
        array[0].append("!!!"); // изменить элемент
        System.out.println(lis_SB);
        array[0] = new StringBuilder("F"); // заменить эллемент
        System.out.println(lis_SB);
    }

    void al5_2() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        List<String> myList = arrayList1.subList(1, 4); // выводит с первого по третий
        System.out.println(myList);
    }

    void al5_3() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        System.out.println(arrayList1 + " 1");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Igor");
        arrayList2.add("Mariya");

        arrayList1.removeAll(arrayList2); // removeAll
        ////////////////////////////////// // противоположный retainAll
        System.out.println(arrayList1);

        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);

    }

    void al5_4() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);
        List<String> myList = arrayList1.subList(1, 4);// это просмотр элементов, а не объект
        System.out.println(myList);
        myList.add("Fedor");
        System.out.println(myList);
        System.out.println(arrayList1 + "он добавился в основной массив через myList");

        Object[] array = arrayList1.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        String[] arrayS = arrayList1.toArray(new String[arrayList1.size()]);
        for (int i = 0; i < arrayS.length; i++) {
            System.out.println(array[i]);
        }
    }

    void al5_5() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        List<Integer> list1 = List.of(3, 8, 13); // в этот метод нельзя потом добавлять позиции
        // и он не можт содержать  null
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1); // List.copyOf
        System.out.println(list2);

        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);

        ArrayList<Integer> arrayList3 = new ArrayList<>(list1);
        System.out.println(arrayList3);
    }
}

class IteratorExample {
    void iter() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        Iterator<String> iter = arrayList1.iterator();
        while (iter.hasNext()) {
//            String tmp = iter.next();
//            System.out.println(tmp);
            System.out.println(iter.next());
        }

//        iter = arrayList1.iterator();
//        while (iter.hasNext()){
//            iter.next();
//            iter.remove();
//        }
//        System.out.println(arrayList1);
        System.out.println();

        ListIterator li = arrayList1.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

    }

    void list_iter() {
        // пaлиндром???
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> listIterator = list.listIterator();// с начала
        ListIterator<Character> reverse_listIterator = list.listIterator(list.size());// с конца
        boolean isPalindrome = true;
        while (listIterator.hasNext()&&reverse_listIterator.hasPrevious()){
            if (listIterator.next() != reverse_listIterator.previous()){
                isPalindrome = false;
                System.out.println("NOT Palindrom");
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrom");
        }


    }
}

class LinkedListEx {
    // Порядок листа сохраняется
    // Невелико количество получения
    // Велико кол-во вставок и удалений
    // Особенно если эти дейсвия в начале коллекции
    void linkedList_1() {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Mariya", 3);

        LinkedList<Student2> LinList = new LinkedList<>();
        LinList.add(st1);
        LinList.add(st2);
        LinList.add(st3);
        LinList.add(st4);
        LinList.add(st5);
        System.out.println(LinList);
        System.out.println(LinList.get(2)); // поиск идет с самого начала
        /** !DOUBLY! & SINGLY */
        Student2 st6 = new Student2("Zaur", 3);
        Student2 st7 = new Student2("! Igor !", 4);
        LinList.add(st6);
        LinList.add(1, st7);
        LinList.remove(3);

        System.out.println(LinList);

    }
}

public class ArrayListTest1 {
    public static void main(String[] args) {
        AL al = new AL(); // arrayList
        IteratorExample iter = new IteratorExample();
        LinkedListEx ll = new LinkedListEx();

        iter.list_iter();


    }
}
