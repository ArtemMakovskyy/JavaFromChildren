package Shildt.PART1.S152;

/**
 * a = 0011
 * b = 0110
 * a|b = 0111
 * а&Ь = 0010
 * а^b = 0101
 * -а&b | а&~Ь 0101
 * а  = 1100
 */



public class S111_000000 {
    public static void main(String[] args) {
        String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101 ", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

        int a = 3; // О+ 2 + 1, или 0011 в  двоичном представлении
        int b = 6; // 4 + 2 +О, или 0110 в  двоичном представлении
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & -b);
        int g = ~a & 0x0f;
        System.out.println(" а = 3 =" + binary[a]);
        System.out.println(" Ь = 6 =" + binary[b]);
        System.out.println(" a|b " + binary[c]);
        System.out.println(" а&Ь " + binary[d]);
        System.out.println(" a^b " + binary[e]);
        System.out.println("-a&b  | a&-b  = " + binary[f]);
        System.out.println(" -а=" + binary[g]);
    }
}

