package Shildt.PART2.LyambdaS454;

interface NumericFunc {
    int func(int n);
}

interface StringFunc {
    String func(String n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc fuctorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) result = i * result;
            return result;
        };
        System.out.println(fuctorial.func(5));
        ///////////////
        StringFunc reverse = str -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
           return result;
        };

        System.out.println(reverse.func("Lymbda"));
        String text = "four";
        System.out.println(text.charAt(0));

    }
}
