package Shildt.Classes.IO.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo751 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Shildt\\Classes\\IO\\FileReaderDemo751.java")){

            int c;
            while ((c = fr.read()) != -1) System.out.print((char) c);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
