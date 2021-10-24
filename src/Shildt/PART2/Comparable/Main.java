package Shildt.PART2.Comparable;
/** https://www.youtube.com/watch?v=x4CUbW-K8E8&t=3s */
import java.util.Set;
import java.util.TreeSet;

class PersonN implements Comparable<PersonN> {
    int age;

    public PersonN(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(PersonN p) {
//        if(p.age>this.age){
//            return -1;
//        }
//  return 1;
//    }
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "PersonN{" +
                "age=" + age +
                '}';
    }
}
    public class Main {
        public static void main(String[] args) {
            Set set = new TreeSet();

//        set.add("2");
//        set.add("5");
//        set.add("4");
//        set.add("1");
            set.add(new PersonN(4));
            set.add(new PersonN(6));
            set.add(new PersonN(5));
            set.add(new PersonN(3));
            for (Object o : set) {
                System.out.println(o);
            }

        }
    }

