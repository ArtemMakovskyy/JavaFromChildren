package Shildt.PART1.Reoeat;
class Factorial{
int fuctor(int n) {
    int result;
    if (n == 1) return 1;
    result = fuctor(n - 1) * n;
    return result;



}
}

class Fuct2{
    int fac(int s){
        int resultat;
        if(s==5)return 1;
        return resultat = fac(s+1);
    }
}


public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        for(int i = 1;i<11;i++)
        System.out.println("factorial " + i+" = "+f.fuctor(i));
        System.out.println();
        Fuct2 f2 = new Fuct2();
        System.out.println(f2.fac(5));


    }
}
