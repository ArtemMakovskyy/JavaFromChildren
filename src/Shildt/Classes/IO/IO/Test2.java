package Shildt.Classes.IO.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        String str1 = "text 1";
        String str2 = "text 2";
        FileInputStream fis1 = new FileInputStream("src/Shildt/Classes/IO/IO/f1.txt");
        FileInputStream fis2 = new FileInputStream("src/Shildt/Classes/IO/IO/f2.txt");
        try {
            for (int i = 0; i < fis1.available(); i++) {
                System.out.print((char) fis1.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        int size;
        try {
            size = sis.available();
            System.out.println(" Size = " + size);
            for (int i = 0; i < size; i++) {
                System.out.print((char) sis.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
