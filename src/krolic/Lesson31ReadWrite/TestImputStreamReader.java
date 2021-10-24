package krolic.Lesson31ReadWrite;

import java.io.*;

/**
 * https://www.youtube.com/watch?v=FWAQ3AW9vQM
 */
public class TestImputStreamReader {
    public static void main(String[] args){
        FileInputStream fis = null;
        InputStreamReader isr = null;
        String pasth = "D:\\11.txt";
        int ch = 0;


        try {
            fis = new FileInputStream(pasth);
            isr = new InputStreamReader(fis, "UTF-8");
            while((ch = isr.read())!=-1)
                System.out.print((char)ch);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
