package Shildt.StringText488;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;

        do{
            str = br.readLine();
            str = str.trim();
            if(str.equals("Kyiv")) System.out.println("Ukrain");
            else if(str.equals("Mosskow")) System.out.println("Russha");
            else System.out.println("Input Syty");
        }while (!str.equals("stop"));
    }
}
