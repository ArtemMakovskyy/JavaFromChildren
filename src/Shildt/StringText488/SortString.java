package Shildt.StringText488;

public class SortString {
    static String arrString[] = {
            "Now", "is", "the", "time", "for", "all", "good", "men", "to", "come",
            "to", "the", "aid", "of", "their", "country"
    };

    static int arrInt[] = {
            555, 99, 98, 97, 94, 92, 83
    };
    static void prAr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arrInt.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrInt[i]);
        }
        System.out.println("]");
    }
    static void sortStringArray2(String[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[i]) < 0) {
                    String t = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = t;
                    isSorted = false;
                }
            }
            System.out.println();
        }

        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++)
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            System.out.print(arr[j] + ", ");
        }
    }
    static void sortStringArray(String[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++)
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            System.out.print(arr[j] + ", ");
        }
    }
    static void sortNumberArray(int[] arr){
        boolean isSorted = false;
        int count=0;
        while (!isSorted) {

            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                    count++;
                }
            }
            prAr(arrInt);
        }
    }

    public static void main(String[] args) {
        sortStringArray(arrString);

        sortStringArray2(arrString);
        System.out.println();
        sortNumberArray(arrInt);
    }
}
