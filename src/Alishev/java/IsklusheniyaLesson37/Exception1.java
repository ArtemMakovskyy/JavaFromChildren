package Alishev.java.IsklusheniyaLesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args)  {
        File file = new File("E:\\Dropbox\\Java\\Kods.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println(123);
        } catch (FileNotFoundException e) {
            System.out.println(" file not found ");
        }
        System.out.println(456);
    }

}
