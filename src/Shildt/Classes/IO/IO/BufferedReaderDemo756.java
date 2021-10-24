package Shildt.Classes.IO.IO;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class BufferedReaderDemo756 {
    public static void main(String[] args) {
        String s = " Это знак авторского права &сору;" +
                ", а  &сору -нет.\n";
        char buffer[] = new char[s.length()];
        s.getChars(0, s.length(), buffer, 0);
        CharArrayReader in = new CharArrayReader(buffer);
        int c;

        boolean marked = false;

        try (BufferedReader f = new BufferedReader(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.println("(c)");
                        } else {
                            System.out.print((char) c);
                            break;
                        }
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.println("&");

                        } else System.out.print((char) c);
                        break;
                    default:
                        if (!marked)
                            System.out.print((char) c);
                        break;


                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
