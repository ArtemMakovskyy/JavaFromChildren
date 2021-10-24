package Shildt.Classes.Scanner;

import java.util.Scanner;

public class FindinLineDemo704 {
    public static void main(String[] args) {
        String instr = "Имя: Том Возраст: 28 ID: 77";

        Scanner scan = new Scanner(instr);

        //        найти поле возраста и  вывести его содержимое
        scan.findInLine("Возраст:");

        while (scan.hasNext())
            if (scan.hasNext()) {
                System.out.println(scan.next());
                break;
            } else System.out.println("err");
        scan.close();

    }
}
