package Shildt.PART2.S370ReadingFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException, InterruptedException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' - для выхода");
        do {
            c = (char) br.read();
            System.out.println(c);
            Thread.sleep(20);
        }while (c != 'q');
    }
}
