package Shildt.PART2.S370ReadingFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        String copyFileFrom = "D:\\1.txt";
        String pastFileTo = "D:\\2.txt";

        try {
            fin = new FileInputStream(copyFileFrom);
            fout = new FileOutputStream(pastFileTo);
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            }while (i != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
