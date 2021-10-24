package Alishev.java.Serializ;
//https://www.youtube.com/watch?v=nr4_JRKCGBU&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=48
import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();
            Person[] people = new Person [personCount];

            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }

//    Person person1 = (Person) ois.readObject();
//    Person person2 = (Person) ois.readObject();
//    System.out.println(person1+"\n"+person2);

            ois.close();
            fis.close();
            System.out.println(Arrays.toString(people));

        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
