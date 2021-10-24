package DiferentsLessons.Sort;
// https://www.youtube.com/watch?v=WBS8qlrry0U
import java.util.Arrays;

public class SortPodschot {
    static void countSort(Integer[] array) {
        final int MAXvAlue = 100;
        int[] count = new int[MAXvAlue];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int arrayindex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayindex] = i;
                arrayindex++;
            }
        }

    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{99, 64, 97, 64, 84, 64, 5, 64, 42, 73, 41, 3, 25,
                3, 16, 24, 57, 42, 74, 55, 36};
        System.out.println();
        countSort(array);
        System.out.println(Arrays.toString(array));

        int[] ar1 = new int[100];
        ar1[0] = 25;
        int [] countedDate = new int[100];

        countedDate[ar1[0]] ++;


    }

//    private static void test(){
//        int testLen = 1000000000;
//        int [] arr1 = new int[testLen];
//        int [] arr2 = new int[testLen];
//
//        for (int i = 0; i < testLen; i++) {
//            arr2[i] = arr1[i] = (int)Math.round(Math.random()*99);
//            System.out.println("Q");
////            measureTime
//
//        }
//    }
}
