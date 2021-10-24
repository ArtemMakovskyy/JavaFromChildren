package Alishev.java.Serializ.V2;

import Alishev.java.Serializ.Person;

import java.io.*;

public class WriteO {
    public static void main(String[] args) {
        PersonTest person1 = new PersonTest(1, "Ivan");
        PersonTest person2 = new PersonTest(2, "Fedor");
        PersonTest person3 = new PersonTest(3, "Elena");
        PersonTest person4 = new PersonTest(4, "Sveta");

        PersonTest personTest[] = {person1, person2, person3, person4};

        for (int i = 0; i < 4; i++) System.out.println(personTest[i]);

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream("perdon_test.bin"))) {
            oos.writeInt(personTest.length);
            for (PersonTest p: personTest){
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
