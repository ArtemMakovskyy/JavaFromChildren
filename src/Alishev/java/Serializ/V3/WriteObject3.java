package Alishev.java.Serializ.V3;

import Alishev.java.Serializ.V2.PersonTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject3 {
    public static void main(String[] args) {
        Person3 person1 = new Person3(1, "Ivan");
        Person3 person2 = new Person3(2, "Fedor");
        Person3 person3 = new Person3(3, "Elena");
        Person3 person4 = new Person3(4, "Sveta");

        Person3 personTest[] = {person1, person2, person3, person4};

        for (int i = 0; i < 4; i++) System.out.println(personTest[i]);

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream("perdon_test3.bin"))) {
            oos.writeInt(personTest.length);
            for (Person3 p: personTest){
                oos.writeObject(p);
            }


//            oos.writeObject(person1);
//            oos.writeObject(person2);
//            oos.writeObject(person3);
//            oos.writeObject(person4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
