package DiferentsLessons.Sort;
//https://www.youtube.com/watch?v=hqIXm7Ontdg

import java.util.Arrays;
import java.util.Comparator;

public class SortMain {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{64, 42, 73, 41, 3, 25, 3, 16, 24, 57, 42, 74, 55, 36};
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array));

        Integer[] array2 = new Integer[]{64, 42, 73, 41, 3, 25, 3, 16, 24, 57, 42, 74, 55, 36};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array2));

        Integer[] array3 = new Integer[]{64, 42, 73, 41, 3, 25, 3, 16, 24, 57, 42, 74, 55, 36};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(array3));

        Integer[] array4 = new Integer[]{64, 42, 73, 41, 3, 25, 3, 16, 24, 57, 42, 74, 55, 36};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(array));


    }
}
