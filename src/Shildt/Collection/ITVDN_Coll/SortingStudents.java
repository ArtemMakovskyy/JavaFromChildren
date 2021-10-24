package Shildt.Collection.ITVDN_Coll;

import java.util.Arrays;

public class SortingStudents {
    public static void main(String[] args) {
        int[] marks = {7, 8, 9, 3, 0, 11};
        String[] students = {"Alex", "Andrew", "Yevhenii", "Karina",};

        Arrays.sort(marks);
        Arrays.sort(students);
        for (int temp : marks) {
            System.out.println(temp);   }
        for (String t : students) {
            System.out.println(t);  }
    }
}
