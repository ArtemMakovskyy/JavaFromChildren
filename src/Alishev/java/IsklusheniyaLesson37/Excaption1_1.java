package Alishev.java.IsklusheniyaLesson37;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excaption1_1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("not found");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("E:\\Dropbox\\Java\\Kods.txt");
        Scanner scanner = new Scanner(file);
    }
}
