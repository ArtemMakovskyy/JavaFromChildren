package Shildt.Collec_Arr_Algoritms;

import java.util.Arrays;

// p633
public class ArraysDemoEx {
    static void display(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;
        System.out.print("Иcxoдный  массив:   ");
        display(array);
        Arrays.sort(array);
        System.out.print("Oтcopтиpoвaнный массив:   ");
        display(array);
//        залолнить массив и  вывести его содержимое
        Arrays.fill(array, 2, 6, -1);
        display(array);
        Arrays.sort(array);
        System.out.print("Oтcopтиpoвaнный массив:   ");
        display(array);
        System.out.print("Знaчeниe -9 находится на  позиции :");
        int index = Arrays.binarySearch(array,-9);
        System.out.println(index);
    }
}
