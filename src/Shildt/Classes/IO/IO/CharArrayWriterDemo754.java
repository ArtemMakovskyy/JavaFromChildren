package Shildt.Classes.IO.IO;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo754 {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = " Эти данные должны быть  выведены  в массив f";
        char buf[] = new char[s.length()];
        s.getChars(0, s.length(),buf,0);
        System.out.println(buf);
        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        char c[] = f.toCharArray();
        for (char cc : c){
            System.out.print(cc);
        }

        try (FileWriter fw1 = new FileWriter("charWrite.txt")){
            f.writeTo(fw1);

        } catch (IOException e) {
            e.printStackTrace();
        }

        f.reset();
        System.out.println("sd");
        System.out.println(f.toString());
    }
}
