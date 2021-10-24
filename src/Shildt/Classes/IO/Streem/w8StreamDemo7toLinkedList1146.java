package Shildt.Classes.IO.Streem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class w8StreamDemo7toLinkedList1146 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джeймc", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Мэри", "555-3333", "Mary@HerbSchildt.com"));

        Stream<NamePhone_3> namePhone_3Stream = myList.stream().map(a -> new NamePhone_3(a.name, a.phonEnuum));
        LinkedList<NamePhone_3> listNP3 = namePhone_3Stream.collect(
                () -> new LinkedList<>(),
                (list, elements) -> list.add(elements),
                (listA, listB) -> listA.addAll(listB));
        for (NamePhone_3 a : listNP3) {
            System.out.println(" LinkedList " + a.name + " " + a.phonEnuum);
        }

        namePhone_3Stream = myList.stream().map(a -> new NamePhone_3(a.name, a.phonEnuum));

//        HashSet<NamePhone_3>hashSet_namePhone3 = namePhone_3Stream.collect(
//                HashSet::new,
//                HashSet::add;
//                HashSet::addAll);

        HashSet<NamePhone_3> hashSet_namePhone3 = namePhone_3Stream.collect(
                () -> new HashSet<>(),
                (l, e) -> l.add(e),
                HashSet::addAll);
        hashSet_namePhone3.forEach(a -> System.out.println("HashSet " + a.name + " " + a.phonEnuum));
    }
}

class NamePhoneEmail_4 {
    String name;
    String phonEnuum;
    String email;

    public NamePhoneEmail_4(String name, String phonEnuum, String email) {
        this.name = name;
        this.phonEnuum = phonEnuum;
        this.email = email;
    }
}

class NamePhone_4 {
    String name;
    String phonEnuum;

    public NamePhone_4(String name, String phonEnuum) {
        this.name = name;
        this.phonEnuum = phonEnuum;
    }
}

