package krolic.Lesson31ReadWrite;
/**
 * https://www.youtube.com/watch?v=FWAQ3AW9vQM
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) {
        String pathFile = "D:\\1.txt";
        String text = "Print Печать";
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(pathFile);
            fos.write(text.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
