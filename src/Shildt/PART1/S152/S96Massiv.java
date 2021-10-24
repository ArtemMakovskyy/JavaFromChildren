package Shildt.PART1.S152;

public class S96Massiv {
    public static void main(String[] args) {

        double nums[] = {10.1, 10.2, 10.3, 10.4, 10.5, 10.6};
        double result = 0;
        for (int c = 0; c < 6; c++)
            result = result + nums[c];
        result = result / 6;
        System.out.println(result);


        int massive[] = {1, 5, 3, 6, 5};
        int itogo = 0;
        int ciftMas = 5;
        for (int i = 0; i < ciftMas; i++)
            itogo = itogo + massive[i];
        System.out.println(itogo);

    }
}
