package Shildt.Classes;
// p 656

import java.util.BitSet;

class BitSetDemo {

    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);
//        установить некоторые биты
        for (int i = 0; i < 16; i++) {
            if((i%2)==0) bits1.set(i);
            if((i%5)!=0) bits2.set(i);
        }
        System.out.println("Начальная комоинация битов в  оОъекте Ьits 1: ");
        System.out.println(bits1);
        System.out.println("Начальная комоинация битов в  оОъекте Ьits 2: ");
        System.out.println(bits2);
//        выполнить логическую  операцию И над битами/
        bits2.and(bits1);
        System.out.println("\n Ьits2 AND Ьitsl:  ");
        System.out.println(bits2);
        bits2.or(bits1);
        System.out.println("\n Ьits2 OR Ьitsl:  ");
        System.out.println(bits2);
        bits2.xor(bits1);
        System.out.println("\n Ьits2 XOR Ьitsl:  ");
        System.out.println(bits2);

    }
}
