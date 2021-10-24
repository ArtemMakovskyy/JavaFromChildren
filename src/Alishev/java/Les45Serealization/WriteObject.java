package Alishev.java.Les45Serealization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    static String path = "D:\\people.bin";
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(1, "Jain");

        try {
            FileOutputStream fis = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
