package Shildt.Classes.IO.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo734 {
    public static void main(String[] args) {
        File file = new File("C:\\test\\ff.txt");
        Scanner scanner = new Scanner("C:\\test\\ff.txt");

        String fileToString = null;
        while (scanner.hasNext()){
            fileToString += scanner.next();
        }
        System.out.println(fileToString+"!!!");

        String source = "Now is the time for all good men\n" +
                " to соmе to the aid of their country\n" +
                " and рау their due taxes.";
        byte buf[] = source.getBytes();
        byte buf2[] = fileToString.getBytes();

        try {
            FileOutputStream f5 = new FileOutputStream("file11.txt");
            f5.write(buf2);



        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}