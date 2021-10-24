package Shildt.Classes.IO.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo752 {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                " to соmе to the aid of their country\n" +
                " and рау their due taxes.";
        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        try (FileWriter fw1 = new FileWriter("fws752_10.txt")) {
            fw1.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
