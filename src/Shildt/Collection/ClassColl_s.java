package Shildt.Collection;
/**  https://www.youtube.com/watch?v=R5wrs4VWnpA&list=PLqj7-hRTFl_oDMBjI_EstsFcDAwt-Arhs&index=9 */
import java.util.*;

class Emploee implements Comparable<Emploee> {
    int id;
    String name;
    int salery;

    public Emploee(int id, String name, int salery) {
        this.id = id;
        this.name = name;
        this.salery = salery;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + salery + "\n";
    }

    @Override
    public int compareTo(Emploee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}

class BinarrySearch {
    void bs1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(-3);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList);
        int index = Collections.binarySearch(arrayList, 19);
        System.out.println(index);

    }

    void bs2() {
        Emploee emp1 = new Emploee(110, "Zaur", 12345);
        Emploee emp2 = new Emploee(123, "Ivan", 6542);
        Emploee emp3 = new Emploee(15, "Petr", 8542);
        Emploee emp4 = new Emploee(182, "MAriya", 5678);
        Emploee emp5 = new Emploee(15, "Kolya", 125);
        Emploee emp6 = new Emploee(250, "Sasha", 9874);
        Emploee emp7 = new Emploee(15, "Elena", 1579);
        List<Emploee> emploeeList = new ArrayList<>();
        emploeeList.add(emp1);
        emploeeList.add(emp2);
        emploeeList.add(emp3);
        emploeeList.add(emp4);
        emploeeList.add(emp5);
        emploeeList.add(emp6);
        emploeeList.add(emp7);
        System.out.println(emploeeList);
        Collections.sort(emploeeList);
        System.out.println(emploeeList);
        int index2 = Collections.binarySearch(emploeeList, new Emploee(250, "Sasha", 9874));
        System.out.println(index2);
    }

    void bs3() {
        int[] array = {-3, 8, 20, 5, 45, -18, 100, 45, 78, 2, 2};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 5);
        System.out.println(index);
    }
    void bs4() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(-3);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}

public class ClassColl_s {
    public static void main(String[] args) {
        BinarrySearch bs = new BinarrySearch();
        bs.bs4();

    }
}
