package Shildt.PART2.S370ReadingFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Простейший текстовый редактор
public class TinyEdit {
    public static void main(String[] args) throws IOException {
//        создать поток ввода типа BufferedReader,
//        используя стандартный лоток ввода SysteJ11 .in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Bвeдитe строки  текста.");
        System.out.println("Bвeдитe 'стол'   для завершения.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("стоп")) break;
        }
        System.out.println("\nCoдepжимoe вашего файла:");
//        вывести текстовые строки
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}