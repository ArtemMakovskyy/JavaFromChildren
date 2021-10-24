package DiferentsLessons;
/** https://www.youtube.com/watch?v=91D-1O50iIk     */
class Point <T extends Number> {
    T x, y;


    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }
Object [] coor(){
    return new Object[]{x,y};
    }

    double getMax(){
        double xd = x.doubleValue();
        double yd = y.doubleValue();
        return (xd<yd)?yd:xd;
    }

}

class Math{
    public static <T> boolean isIn(T val, T[] ar){
        for (T v :
                ar) {
            if (v.equals(val)) return true;
        }
        return false;
    }
}

public class MainT {
    public static void main(String[] args) {
        Point <Integer> cI = new Point<>(2,8);
        for (Object o :
                cI.coor()) {
            System.out.println((Integer)o);
        }

        double max = cI.getMax();
        System.out.println(max);

        Short ar [] = {1,2,3,4};
        Short val = 5;
        boolean flIn = Math.isIn(val,ar);
        System.out.println(flIn);


    }
}
