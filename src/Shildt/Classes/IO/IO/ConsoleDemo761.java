package Shildt.Classes.IO.IO;

import java.io.Console;

public class ConsoleDemo761 {
    public static void main(String[] args) {
        String str;
        Console console = System.console();
//        получить ссылку на консоль

//        выйти из программы, если консоль недоступна
        if (console == null) {
            System.out.println("sdfs");
            return;
        }
//        прочитать строку  и вывести ее
        str = console.readLine("Bвeдитe строку : ");
        console.printf("веденная вами строка:   %s\n", str);
    }
}
