package Shildt.PART2.S370ReadingFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String  path = "C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Alishev\\java\\date.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }



}
