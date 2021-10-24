package Shildt.Classes.IO.Streem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class w6StreamDemo5_1140map_V2 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail_2> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail_2("Ларри", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail_2("Джeймc", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail_2("Мэри", "555-3333", "Mary@HerbSchildt.com"));

        System.out.println("Иcxoдныe элементы из списка myList: ");
        myList.stream().forEach(a ->
                System.out.println(a.name + " " + a.phonEnuum + " " + a.email));
        System.out.println();

//        отобразить на новый поток данных только имена и номера телефонов
////              v1
        Stream<NamePhone_2> nameAndPhone = myList.stream().map(a -> new NamePhone_2(a.name, a.phonEnuum));
        System.out.println("Список имен и номеров телефонов: v1");
        nameAndPhone.forEach(b-> System.out.println(b.name +" "+ b.phonEnuum));

//                v2
        System.out.println();
        Stream<NamePhone_2> nameAndPhone2 = myList.stream().filter(a -> a.name.equals("Джeймc"))
                .map(a -> new NamePhone_2(a.name, a.phonEnuum));
        nameAndPhone2.forEach(a-> System.out.println(a.name +" "+ a.phonEnuum+" sort by Джeймc V2"));
//                V3 сохранить в коллекцию / вызвать метод collect(), чтобы составить список типа List из имен и номеров телефонов



    }
}

class NamePhoneEmail_2 {
    String name;
    String phonEnuum;
    String email;

    public NamePhoneEmail_2(String name, String phonEnuum, String email) {
        this.name = name;
        this.phonEnuum = phonEnuum;
        this.email = email;
    }
}

class NamePhone_2 {
    String name;
    String phonEnuum;

    public NamePhone_2(String name, String phonEnuum) {
        this.name = name;
        this.phonEnuum = phonEnuum;
    }
}
