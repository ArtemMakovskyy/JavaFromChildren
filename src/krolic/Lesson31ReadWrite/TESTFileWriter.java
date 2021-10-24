package krolic.Lesson31ReadWrite;
/**
 * https://www.youtube.com/watch?v=FWAQ3AW9vQM
 */

import java.io.*;

public class TESTFileWriter {
    public static void main(String[] args) {
        String str = " Добавляем новый текст";
        FileWriter fr = null;
        File addFile = new File("D:\\2.txt");

        try {
            fr = new FileWriter(addFile,true);
            fr.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
