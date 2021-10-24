package Shildt.Classes.IO.IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackinputStreamDemo741 {
    public static void main(String[] args) {
        String s = "if (а == 4) а = 0;\n";
        byte[] buf = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        try (PushbackInputStream f = new PushbackInputStream(in)){
            while ((c = f.read()) != -1){
                switch (c){
                    case '=':
                        if((c = f.read()) == '='){
                            System.out.print(".eq. ");
                        }else {
                            System.out.print("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char)c);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);

    }
}
