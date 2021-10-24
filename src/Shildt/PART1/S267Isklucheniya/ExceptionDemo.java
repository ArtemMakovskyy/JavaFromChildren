package Shildt.PART1.S267Isklucheniya;

class MyExeption extends Exception {
    private int detail;

    public MyExeption(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}

public class ExceptionDemo {
    static void compute(int a) throws MyExeption {
        System.err.println("Bызвaн метод  compute (" + a + ") ");
        if (a > 10)
            throw new MyExeption(a);
        System.out.println("Hopмaльнoe завершение");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }catch (MyExeption e){
            System.out . println("Пepexвaчeнo исключение :   "+ e) ;
        }
    }
}
