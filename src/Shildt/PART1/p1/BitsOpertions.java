package Shildt.PART1.p1;

/**
 * https://www.youtube.com/watch?v=RIyz2_0FTbE&t=1418s
 * https://github.com/Arhiser/java_tutorials/blob/master/src/ru/arhiser/bitops/Main.java
 * Таблица перевода чисел в биты
 * 2^8   2^7   2^6   2^5   2^4   2^3   2^2   2^1   2^0
 * 256   128    64    32    16    8     4     2     1
 * нужно сложить где единицы            1     0     1      4+1=5   Перевод числа побитного 101
 * 1     0      0     0     0     1     0     1           перевод в двоичную числа 133
 * 133-128 = 5                      5-4 = 1
 */

public class BitsOpertions {
    public static void main(String[] args) {
        int i4 = 0b100;             // это число 4 / сначада '0b' зате 8 биовых знаков
        int i = 0b00000100;
        int i133 = 0b10000101;
        System.out.println(i4);
        System.out.println(Integer.toBinaryString(i4) + " " + i);  // =100  это бинарный код числа 4

        double d = 0x12.2p2;

        double d2 = 6.022E23;
        double d3 = 314159E-05;
        double d4 = 2e+100;
        System.out.println("d, d2, d3, d4 = " + d + ",/" + d2 + ",/" + d3 + ",/" + d4);
        System.out.println();
        System.out.println("Побитовый сдиг вправо в десятичном виде: " + (i >> 1));
        System.out.println("изначальное число int i = 0b00000100 /" + i);
        System.out.println("Побитовый сдиг влево в десятичном виде: " + (i << 1));
        System.out.println("Побитовый сдиг вправо в двоичном виде: " + binaryStr(i >> 1));
        System.out.println();

/**
 *                           Логические побитовые
 */
        System.out.println("Побитовое И (AND) &");
        int b1 = 0b00001001;
        int b2 = 0b00001010;
        printBinary(b1);
        printBinary(b2);
        printBinary(b1 & b2);
        System.out.println();

        System.out.println("Побитовое ИЛИ (OR)|");
        printBinary(b1);
        printBinary(b2);
        printBinary(b1 | b2);
        System.out.println();

        System.out.println("Исключающее ИЛИ (XOR)^");
        printBinary(b1);
        printBinary(b2);
        printBinary(b1 ^ b2);
        System.out.println();

        System.out.println("Инверсия (NOT)~");
        printBinary(b1);
        printBinary(~b1);
        System.out.println();

        //установка бита
        int bb = 0b11010000;
        printBinary(bb);

        System.out.println("установка бита");
        printBinary(bb | 0b00000010);
        System.out.println();

        //сброс бита в 0
        printBinary(bb);
        System.out.println("сброс бита в 0");
        printBinary(bb & 0b11110111);
        System.out.println();

        //проверка бита
        System.out.println("проверка бита");
        System.out.println((bb & 0b00001000) > 0 ? "1" : "0");
        System.out.println();

        // упаковка 4 байт в int
        System.out.println("упаковка 4 байт в int");
        int r = 64;
        int g = 128;
        int b = 32;
        int alpha = 255;
        int color = alpha << 24 | r << 16 | g << 8 | b;
        System.out.println(Integer.toBinaryString(color));
        System.out.println();

        // извлечение байтов из int
        System.out.println("извлечение байтов из int");
        b1 = color & 0xFF;
        b2 = (color & 0xFF << 8) >> 8;
        int b3 = (color & 0xFF << 16) >> 16;
        int b4 = (color & 0xFF << 24) >> 24;
        printBinary(b1);
        printBinary(b2);
        printBinary(b3);
        printBinary(b4);
        System.out.println();

        // проверка битового массива
        System.out.println("проверка битового массива");
        BitArray bitArray = new BitArray(100);
        bitArray.set(0, 1);
        bitArray.set(9, 1);

        bitArray.set(5, 1);
        bitArray.set(5, 0);

        System.out.println(bitArray.toString());

    }

    public static void printBinary(int b) {
        System.out.println("0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1));
    }

    public static String binaryStr(int b) {
        return "0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1);
    }





}
