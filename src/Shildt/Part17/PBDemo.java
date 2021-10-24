package Shildt.Part17;
/// p 527
import java.io.IOException;

public class PBDemo {
    public static void main(String[] args) {
        ProcessBuilder proc = new ProcessBuilder ( "Notepad.exe","test file");
        try {
            proc.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
