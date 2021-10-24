package Shildt.Part17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseDerno {
    public static void main(String[] args) throws IOException {
//        создать буферизированный поток  чтения типа ВufferedReader,
//        используя стандатный лоток ввода Systeш.in
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;
        int i;
        int sum = 0;

        do{
            str = br.readLine();
            try {
                i = Integer.parseInt(str);

            }catch (NumberFormatException n){
                System.out.println("not true format");
                i = 0;
            }
            sum += i;
            System.out.println("Now sum is: " + sum);
        }while (i != 0);


    }


}
