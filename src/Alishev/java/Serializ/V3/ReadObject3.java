package Alishev.java.Serializ.V3;

import Alishev.java.Serializ.V2.PersonTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject3 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("perdon_test3.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

//
//            PersonTest person1  = (PersonTest) ois.readObject();
//            PersonTest person2  = (PersonTest) ois.readObject();
//            PersonTest person3  = (PersonTest) ois.readObject();
//            PersonTest person4  = (PersonTest) ois.readObject();
//           System.out.println(person1+"\n"+person2+"\n"+person3+"\n"+person4+"\n");
            Person3 personTest[] = new Person3[ois.readInt()];
            for (int i = 0; i < personTest.length; i++) {
                personTest[i] = (Person3) ois.readObject();
            }
            System.out.println(Arrays.toString(personTest));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
