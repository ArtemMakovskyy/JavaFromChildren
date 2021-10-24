package Alishev.java.Serializ;
//https://www.youtube.com/watch?v=nr4_JRKCGBU&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=48
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
//Person person1 = new Person(1,"Bob");
//Person person2 = new Person(2,"Mike");
Person[] people = {
        new Person(1,"Bob"),
        new Person(2,"Mike"),
        new Person(3,"Tom"),
};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // в файле снаячала записывается число, потом объекты
            oos.writeInt(people.length);
            for (Person person: people){
                oos.writeObject(person);
            }

//            oos.writeObject(person1);
//            oos.writeObject(person2);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
