package Shildt.Collection;
// p/ 582

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.PARAMETER})
@interface MyInfoSort {
    String info();
}

class AtrrayListClass {
    @MyInfoSort(info = "насле· дуется от класса AbstractCollection")
    void arrList() {
        //        создать списочный массив
        ArrayList<String> al = new ArrayList<>();
        al.ensureCapacity(10);  //увелич памяти вручную, для увеличения скорости
        al.trimToSize(); // обрезание до текущего

        System.out.println("Начальный размер  списочного массива al : " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Размер  списочного массива al после ввода элементов:   : " + al.size());
        System.out.println(al);
        al.remove("F");
        al.remove(2);
        System.out.println("Размер  списочного массива al + " + al.size() + " / " + al);

//        @MyInfoT(info = "увелич памяти вручную, для увеличения скорости")
        al.ensureCapacity(20);
        System.out.println("Размер  списочного массива al после ввода элементов:   : " + al.size());
    }

    @MyInfoSort(info = "метода toArray (")
    void toAr() {
        // -> Object получить обычный массив, содержащий все элементы списка
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
//        получить  обычный массив
        Integer ia1[] = new Integer[a1.size()];
        ia1 = a1.toArray(ia1);
        for (int i : ia1) {
            System.out.print(i + ", ");
        }
    }

    @MyInfoSort(info = "метода toArray (")
    void toAr2() {
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(1);
        a3.add(2);
        a3.add(5);
        System.out.println("пусто ? " + a2.isEmpty());
        System.out.println("size ? " + a2.size());
        System.out.println("что содержит " + a2.contains(2));
        System.out.println(" содержит все " + a2.containsAll(a3));


        LinkedList<Integer> thelist = new LinkedList<>(a2);
    }

    void testItCollection() {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>(100);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.trimToSize();




        List<Integer> myList = new ArrayList<>(myArrayList);
        myList.add(3);
        myList.add(4);
        myList.remove(0);
        System.out.println(myList);

        Collection<Integer> mylistColl = new ArrayList<>();





    }
}

public class SortItClasses {
    public static void main(String[] args) {
        AtrrayListClass alc = new AtrrayListClass();
        alc.arrList();
        alc.toAr2();
        alc.testItCollection();
    }
}
