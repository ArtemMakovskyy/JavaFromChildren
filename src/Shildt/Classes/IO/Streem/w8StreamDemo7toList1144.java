package Shildt.Classes.IO.Streem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class w8StreamDemo7toList1144 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джeймc", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Мэри", "555-3333", "Mary@HerbSchildt.com"));

        Stream<NamePhone_3> namePhone_3Stream = myList.stream().map(a -> new NamePhone_3(a.name, a.phonEnuum));
        List<NamePhone_3> listNP3 = namePhone_3Stream.collect(Collectors.toList());
        System.out.println("Имена и номера телефонов в списке типа List: ");

        listNP3.forEach(a -> System.out.println(a.name + " " + a.phonEnuum));
//                  получить другое отображение имен и номеров телефонов

        namePhone_3Stream = myList.stream().map(a -> new NamePhone_3(a.name, a.phonEnuum));
//        создать множество типа Set, вызвав метод collect()
        Set<NamePhone_3> npSet  = namePhone_3Stream.collect(Collectors.toSet());
        System.out.println("\nв множестве типа Set:");
        for (NamePhone_3 a:npSet){
            System.out.println(a.name +" " +a.phonEnuum);
        }

    }
}

class NamePhoneEmail_3 {
    String name;
    String phonEnuum;
    String email;

    public NamePhoneEmail_3(String name, String phonEnuum, String email) {
        this.name = name;
        this.phonEnuum = phonEnuum;
        this.email = email;
    }
}

class NamePhone_3 {
    String name;
    String phonEnuum;

    public NamePhone_3(String name, String phonEnuum) {
        this.name = name;
        this.phonEnuum = phonEnuum;
    }
}