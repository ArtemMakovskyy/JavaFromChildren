package Shildt.Exceptions;
// создание исключения
public class ExceptionDemo297 {
    static void compute(int a) throws MyExceptionP297 {
        System.out.println("Bызвaн метод compute(" + a + ")");
        if (a>10)throw new MyExceptionP297(a);
        System.out.println("Hopмaльнoe завершение");
    }

    public static void main(String[] args) {
try {
    compute(1);
    compute(-20);
    compute(20);
} catch (MyExceptionP297 e) {
    System.out.println("Пepexвaчeнo исключение: " + e.toString());
}
    }
}
