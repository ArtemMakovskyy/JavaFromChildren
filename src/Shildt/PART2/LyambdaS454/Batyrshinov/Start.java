package Shildt.PART2.LyambdaS454.Batyrshinov;
// https://www.youtube.com/watch?v=EIiHdEOqf2k
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Start {
    private static ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) {

        Car car1 = new Car("BMW", 1999);
        Car car2 = new Car("NIVA", 2004);
        Car car3 = new Car("Opel", 2013);
        Car car4 = new Car("Nissan", 1990);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Collections.sort(cars);
        print();
//        System.out.println(cars.get(0).getName());
//        Collections.sort(cars, new CarYearComparator());
    }

    private static void print() {
        System.out.println();
        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car.getName() + ", "+ car.getYear());
        }
    }
}
