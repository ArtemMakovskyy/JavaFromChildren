package Alishev.java.Serializ.V2;


import Alishev.java.Serializ.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadO {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("perdon_test.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

//
//            PersonTest person1  = (PersonTest) ois.readObject();
//            PersonTest person2  = (PersonTest) ois.readObject();
//            PersonTest person3  = (PersonTest) ois.readObject();
//            PersonTest person4  = (PersonTest) ois.readObject();
//           System.out.println(person1+"\n"+person2+"\n"+person3+"\n"+person4+"\n");
            PersonTest personTest[] = new PersonTest[ois.readInt()];
            for (int i = 0; i < personTest.length; i++) {
                personTest[i] = (PersonTest) ois.readObject();
            }
            System.out.println(Arrays.toString(personTest));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
