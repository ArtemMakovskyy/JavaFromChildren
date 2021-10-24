package krolic.Lesson30;

public class Main {
    public static void main(String[] args) throws PerimeterExeption {
PerimetrSquare perimetrSquare = new PerimetrSquare();
        try {
            perimetrSquare.getPerimetr("5");
        } catch (PerimeterExeption e) {
            e.printStackTrace();
        }

    }
}
