package krolic.Lesson30;

public class PerimeterExeption extends Exception {
    public PerimeterExeption() {
    }

    public PerimeterExeption(String message) {
        super(message);
    }

    public PerimeterExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public PerimeterExeption(Throwable cause) {
        super(cause);
    }

    public PerimeterExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
