package Shildt.PART2.S370ReadingFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPastFileTRY {
    public static void main(String[] args) {
        String paths[] = new String[2];
        paths[0] = "D:\\1.txt";
        paths[1] = "D:\\2.txt";
        int i = 0;
        try (FileInputStream fis = new FileInputStream(paths[0]);
             FileOutputStream fos = new FileOutputStream(paths[1])) {
            do {
                i = fis.read();
                if (i != -1) fos.write(i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
