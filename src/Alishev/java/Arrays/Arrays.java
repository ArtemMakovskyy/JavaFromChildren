package Alishev.java.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);

            int[] month = new int[12];
            month[0] = 31;
            month[1] = 28;
            month[2] = 31;
            month[3] = 30;
            month[4] = 31;
            month[5] = 30;
            month[6] = 31;
            month[7] = 30;
            month[8] = 31;
            month[9] = 30;
            month[10] = 31;
            month[11] = 30;
            System.out.println(month[11]);

            int[] week = {1, 2, 3, 4, 5, 6, 7};
            System.out.println(week[5]);

            double nums[] = {10.1, 10.2, 10.3, 10.4, 10.5, 10.6};
            double result = 0;
            for (int c = 0; c < 6; c++)
                result = result + nums[c];
            result = result / 6;
            System.out.println(result);


            int massive[] = {1, 5, 3, 6, 5};
            int itogo = 0;
            int ciftMas=5;
            for (int v = 0; v < ciftMas; v++)
                itogo =itogo + massive[v];
            System.out.println(itogo);


        }
    }
}
