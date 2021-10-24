package Shildt.PART2.LyambdaS454;

@FunctionalInterface
interface StringFunctions {
    String func(String s);
}

public class LamЬdasAsArgumentsDemo2 {
    static String unitedFunc(StringFunctions functions, String str) {
        return functions.func(str);
    }

    public static void main(String[] args) {

        String in = "My string function and nambers 123";
        String out;
        out = unitedFunc(tf -> {
            String rez = "";
            for (int i = 0; i < tf.length(); i++)
                if (tf.charAt(i) != ' ') rez += tf.charAt(i);
            return rez;

        }, in);
        System.out.println(out);

        //revers

        out = unitedFunc(str -> {
            String rez = "";
            for (int i = str.length() - 1; i >= 0; i--)
                rez += str.charAt(i);
            return rez;
        }, in);
        System.out.println(out);

    }
}
