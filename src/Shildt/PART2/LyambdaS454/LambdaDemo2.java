package Shildt.PART2.LyambdaS454;

interface NumericTestt {
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {

        NumericTestt nt = new NumericTestt() {
            @Override
            public boolean test(int n) {
                if (n % 2 == 0){
                    System.out.println(n+" even "); return  true;}
                System.out.println(n+" not even ");  return false;
            }
        };
        nt.test(11);


        NumericTestt isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println(" number  10 is even");
        if (!isEven.test(9)) System.out.println(" number  9 is not even");


        NumericTestt isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("+");
        if (!isNonNeg.test(-1)) System.out.println("-");


    }
}
