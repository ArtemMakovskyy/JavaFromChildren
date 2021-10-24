package Shildt.Classes.IO.IO.Rest;

import Alishev.java.Arrays.Arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSerial {
    public static void main(String[] args) {
        SomePeople sp1 = new SomePeople(25,"Ivan", "Ivanov",'m');
        SomePeople sp2 = new SomePeople(20,"Artem", "Vasilev",'m');
        SomePeople sp3 = new SomePeople(18,"Gleb", "Volskyy",'m');
        SomePeople sp4 = new SomePeople(10,"Elena", "Yanovskaua",'f');
        SomePeople sp5 = new SomePeople(88,"Segg", "V",'m');

        SomePeople people [] = {sp1,sp2,sp3,sp4,sp5};

        ArrayList<SomePeople> peoplObj = new ArrayList<>();
        peoplObj.add(sp1);
        peoplObj.add(sp2);
        peoplObj.add(sp3);
        peoplObj.add(sp4);
        peoplObj.add(sp5);
        peoplObj.sort((o1, o2) -> o1.age- o2.age);
        System.out.println(peoplObj);


//        for (int i = 0; i < 5; i++) {
//            System.out.println(people[i]);
//        }
        try {
            FileOutputStream fos = new FileOutputStream("src/Shildt/Classes/IO/IO/Rest/data.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(peoplObj);
//            oos.writeObject(people);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream fis = new FileInputStream("src/Shildt/Classes/IO/IO/Rest/data.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
//            SomePeople people1[] = (SomePeople[]) ois.readObject();
            ArrayList<SomePeople>peopleAL = (ArrayList<SomePeople>) ois.readObject();
            System.out.println();
//            for (int i = 0; i < 5; i++) {
//                System.out.println(people1[i]);
//            }
            System.out.println(peoplObj);
            ois.close();


        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
