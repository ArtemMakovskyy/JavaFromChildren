package krolic.Lesson31ReadWrite;
/**
 * https://www.youtube.com/watch?v=FWAQ3AW9vQM
 */
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileImputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        int chAr = 0;
       String path = "D:\\11.txt";


        fis = new FileInputStream(path);
        do {
            chAr = fis.read();
            System.out.print((char)chAr);
        }while (chAr != -1);
//        while ((chAr = fis.read())!=-1)
        System.out.print((char)chAr);


    }
}
