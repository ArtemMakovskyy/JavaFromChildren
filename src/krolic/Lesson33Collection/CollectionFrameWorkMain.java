package krolic.Lesson33Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionFrameWorkMain {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
/**                       var 1
        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");

        list.add(person1);
        list.add(person2);

        Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(1);
        System.out.println(person1FromCollection);
        System.out.println(person2FromCollection);
*/
        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");

        list.add(person1);
        list.add(person2);
        System.out.println(list.size());


        boolean removeP1 = list.remove(person1);

        System.out.println(removeP1);

        Person person = list.get(0);

        System.out.println(person);



    }
}
