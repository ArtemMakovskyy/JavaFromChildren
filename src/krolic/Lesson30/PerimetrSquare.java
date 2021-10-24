package krolic.Lesson30;

public class PerimetrSquare {
    public void getPerimetr(String str) throws PerimeterExeption {
        Square square = new Square();
        try {
            double side = Double.parseDouble(str);
            square.setSide(-5);
        }catch (NumberFormatException e) {
            throw new PerimeterExeption("String is incorrect",e);
        }catch (PerimeterExeption ex) {
            System.err.println(ex.getMessage());;
        }
    }
}
