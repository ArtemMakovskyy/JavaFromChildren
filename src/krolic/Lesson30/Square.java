package krolic.Lesson30;

/**
 * https://www.youtube.com/watch?v=KLAf5EEdZ-s&t=101s
 */
public class Square {
    private double side;

    public double getSige() {
        return side;
    }
    public void setSide(double side) throws PerimeterExeption {
        if(side<0){
            throw new PerimeterExeption("Side is incorrect");
        }
        this.side = side;
    }


}
