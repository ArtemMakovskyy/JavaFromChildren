package Shildt.PART2.LyambdaS454;

interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalinterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = str -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.print(reverse.func(", HellO"));
        System.out.println(reverse.func("123"));
        System.out.println("==================");
        SomeFunc<Integer> fuctorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println(fuctorial.func(5));
        System.out.println(fuctorial.func(6));
        System.out.println("==================");


    }
}
