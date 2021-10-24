package Shildt.Part17;

import java.io.IOException;

public class ExecDemoFini {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("Notepad");
            p.waitFor();  // Ожидает завершения процесса
        } catch (IOException e) {
            System.out.println("Oшибкa запуска Notepad.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Notepad возвратил " + p.exitValue());  // если успешно возвращает 0
    }
}
