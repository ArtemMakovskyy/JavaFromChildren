package Shildt.Classes.IO.Streem;

import java.util.ArrayList;
import java.util.stream.Stream;

public class w6StreamDemo5_1140map {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джeймc", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Мэри", "555-3333", "Mary@HerbSchildt.com"));

        System.out.println("Иcxoдныe элементы из списка myList: ");
        myList.stream().forEach(a ->
                System.out.println(a.name + " " + a.phonEnuum + " " + a.email));
        System.out.println();

//        отобразить на новый поток данных только имена и номера телефонов
        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonEnuum));
        System.out.println("Список имен и номеров телефонов: ");
        nameAndPhone.forEach(b-> System.out.println(b.name +" "+ b.phonEnuum));

    }
}

class NamePhoneEmail {
    String name;
    String phonEnuum;
    String email;

    public NamePhoneEmail(String name, String phonEnuum, String email) {
        this.name = name;
        this.phonEnuum = phonEnuum;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phonEnuum;

    public NamePhone(String name, String phonEnuum) {
        this.name = name;
        this.phonEnuum = phonEnuum;
    }
}