package Shildt.PART1.S228;

class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.print("Плoщaдь фигуры не определена. ");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.print("B  области четырехугольника ");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.print("B  области треугольника ");
        return dim1 * dim2 / 2;
    }


}

public class S228FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figref;

        figref = f;
        System.out.println("площадь равна: "+figref.area());
        figref = r;
        System.out.println("площадь равна: "+figref.area());
        figref = t;
        System.out.println("площадь равна: "+figref.area());

    }
}
