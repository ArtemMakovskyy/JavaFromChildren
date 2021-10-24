package Shildt.PART1.S228;

class Factorial {
    int fact(int n) {
        System.out.print(n+"*");
        if (n == 1) return 1;
       return fact(n-1)*n;
    }
}


public class S186rec {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("="+f.fact(5));

    }

}
