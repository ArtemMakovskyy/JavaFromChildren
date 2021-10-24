package Shildt.Part17;

import java.io.IOException;

//Продемонстрировать применение метода ехес()
public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("Notepad");
        } catch (IOException e) {
            System.out.println("Oшибкa запуска Notepad.");
        }
    }
}
