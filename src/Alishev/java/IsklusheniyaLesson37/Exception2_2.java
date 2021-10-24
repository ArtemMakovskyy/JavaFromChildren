package Alishev.java.IsklusheniyaLesson37;

import java.io.IOException;
import java.util.Scanner;

public class Exception2_2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if(x !=0 ){
                throw new ScannerException("User input sumthings enather");
            }
        }
    }
}
