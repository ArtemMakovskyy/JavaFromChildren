package Shildt.Classes.IO.IO;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDernoS753 {
    public static void main(String[] args) {
        String tmp = "abcdefghijklrnnopqrstuvwxyz";
        int length = tmp.length();
        char[] c = new char[length];
        tmp.getChars(0, length, c, 0);
        int i;
        try (CharArrayReader in1 = new CharArrayReader(c)) {
            System.out.println("input1:");
            while ((i = in1.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(CharArrayReader in2 = new CharArrayReader(c,0,5)){
            System.out.println("input2:");
            while ((i= in2.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
