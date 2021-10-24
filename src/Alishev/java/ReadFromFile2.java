package Alishev.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        String  path = "C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Alishev\\java\\date2.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line  = scanner.nextLine(); // считываем строку  из файла
        String [] numbersString = line.split(" "); // разделяем строку по пробелу / данные стринг
        int[] numbers = new int[3];
        int counter = 0;

        for(String x : numbersString){
            numbers [counter++] = Integer.parseInt(x);

        }

        System.out.println(Arrays.toString(numbers));

        String  path3 = "C:\\Users\\Artem\\Documents\\JavaFromChildren\\src\\Alishev\\java\\date3.txt";
        File file3 = new File(path3);
        Scanner scanner3 = new Scanner(file3);
        String line3  = scanner3.nextLine(); // считываем строку  из файла
        String [] words = line3.split("\\."); // через точку, которую нужно экранировать

        System.out.println(Arrays.toString(words) + " from string");

        scanner.close();
    }

}
