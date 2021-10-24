package Shildt.Exceptions;

public class MyExceptionP297 extends Exception {
    private int detail;

    public MyExceptionP297(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException" +
                "detail=" + detail +
                '}';
    }
}
