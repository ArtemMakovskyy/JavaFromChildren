package Shildt.Classes.IO.IO;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AAA_InputStream {
    public static void main(String[] args) throws IOException {

        InputStream inFile = new FileInputStream("C:\\Users\\Artem\\Documents\\JavaFromChildren\\file_1.txt");
        readFullyByByte(inFile);
        System.out.print("\n\n\n");
        InputStream inURL = new URL("https://www.google.com.ua/").openStream();
        readFullyByByte(inFile);
        System.out.println("\n\n\n");
        InputStream inArray = new ByteArrayInputStream(new byte[]{65, 66, 67});
        readFullyByByte(inFile);
        System.out.println("\n\n\n");

    }

    public static void readFullyByByte(InputStream in) {
        while (true) {
            try {
                int oneByte = in.read();
                if (oneByte != -1) {
                    System.out.println((char) oneByte);
                } else {
                    System.out.println("\n" + "end");
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readBytes(InputStream is) {

    }
}