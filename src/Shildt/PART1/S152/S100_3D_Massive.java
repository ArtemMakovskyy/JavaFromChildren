package Shildt.PART1.S152;

public class S100_3D_Massive {
    public static void main(String[] args) {

        int a1[] = new int[3];
        int[] а2 = new int[3];
        int nums[], nums2[], numsЗ[];   //создать три массива
        int [] numss1, numss2, numss3;


        int mas3d[][][] = new int[3][4][5];
        int i, j, k;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    mas3d[i][j][k] = i + j + k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(mas3d[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
