package Shildt.PART2.LyambdaS454;

interface StringFunction2 {
    String func2(String s);
}
///////////////////////////////////////////////
class MyStringOps2 {
    String strReverse2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

//////////////////////////////////////////////////

public class MethodRefDemo2 {
    static String stringOp2(StringFunction2 sf, String str) {
        return sf.func2(str);
    }

    public static void main(String[] args) {
        String inO = "Лямбда-выражения  повышают эффективность Java";
        String outO;

        MyStringOps2 msOps2  = new MyStringOps2();

        outO = stringOp2(msOps2::strReverse2, inO);
        System.out.println(outO);

    }


}
