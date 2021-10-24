package Shildt.Classes.IO.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo733 {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                " to соmе to the aid of their country\n" +
                " and рау their due taxes.";
        byte buf[] = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;
        try {
            f0 = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file2.txt");
            f2 = new FileOutputStream("file3.txt");
//            записать  данные в  первый файл
            for (int i = 0; i < buf.length; i += 2) f0.write(buf[i]);
//                записать данные во второй файл
            f1.write(buf);
//                записать  данные в  третий  файл
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (f0 != null) f0.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (f1 != null) f1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (f2 != null) f2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
