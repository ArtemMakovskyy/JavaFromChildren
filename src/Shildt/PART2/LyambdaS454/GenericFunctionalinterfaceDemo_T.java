package Shildt.PART2.LyambdaS454;

// p446
interface SomeFunction<T> {
    T func(T t);
}

public class GenericFunctionalinterfaceDemo_T {
    public static void main(String[] args) {
        SomeFunc<String> reverse = str -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Лямбдa обращается на  " + reverse.func("Лямбдa"));
        System.out.println("Bыpaжeниe обращается на " + reverse.func("Bыpaжeниe"));
//        а  теперь использовать целочисленный вариант интерфейса SomeFunc
        SomeFunc<Integer> fuctorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Фaктopиaл числа 3  равен " + fuctorial.func(5));
    }
}
