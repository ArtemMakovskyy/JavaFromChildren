package Shildt.PART1.S247;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("B  области четырехугольника.");
        return dim2 * dim1;
    }
}

class Tringle extends Figure {
    Tringle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("B  области треугольника.");
        return dim2 * dim1 / 2;
    }
}

class S231AbstractAreas {
    public static void main(String[] args) {
Rectangle r = new Rectangle(9,5);
Tringle t= new Tringle(10,8);

Figure figRef;

figRef = r;
        System.out.println("Плoщaдь равна " + figRef.area());

        figRef = t;
        System.out.println( "Плoщaдь равна "  + figRef.area());
    }
}
